package de.lhaider.yodo.dark_souls_3.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import de.lhaider.yodo.dark_souls_3.game.DarkSouls3
import de.lhaider.yodo.save.domain.KilledEnemyRepo
import de.lhaider.yodo.tracking.data.MainTrackedEnemy
import de.lhaider.yodo.tracking.data.MainTrackedLocation
import de.lhaider.yodo.tracking.domain.TrackedEnemy
import de.lhaider.yodo.tracking.domain.TrackedLocation
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DarkSouls3ViewModel @Inject constructor(
    private val repo: KilledEnemyRepo
) : ViewModel() {

    data class UIState(
        val isLoading: Boolean = true,
        val locations: List<TrackedLocation> = emptyList(),
        val currentPoints: Int = 0,
        val maxPoints: Int = 0
    )

    private val game = DarkSouls3()

    private val _uiState = MutableStateFlow(UIState())
    val uiState = _uiState.asStateFlow()

    init {
        collectRepoUpdates()
    }

    private fun collectRepoUpdates() {
        viewModelScope.launch {
            repo.getAll().collect { killed ->
                val trackedLocations = mutableListOf<TrackedLocation>()
                for (location in game.locations) {
                    val trackedEnemies = mutableListOf<TrackedEnemy>()
                    for (enemy in location.enemies) {
                        val killedEnemy = killed.find { it.locationId == location.identifier && it.enemyId == enemy.identifier }
                        val trackedEnemy = MainTrackedEnemy(enemy, killedEnemy?.id)
                        trackedEnemies.add(trackedEnemy)
                    }

                    val trackedLocation = MainTrackedLocation(location, trackedEnemies)
                    trackedLocations.add(trackedLocation)
                }

                _uiState.update { state ->
                    state.copy(
                        isLoading = false,
                        locations = trackedLocations,
                        currentPoints = trackedLocations.sumOf { it.currentPoints },
                        maxPoints = trackedLocations.sumOf { it.maxPoints }
                    )
                }
            }
        }
    }

    fun onEnemyClicked(location: TrackedLocation, enemy: TrackedEnemy) {
        viewModelScope.launch {
            val killId = enemy.killId
            if (killId == null) {
                repo.create(location.location.identifier, enemy.enemy.identifier)
                return@launch
            }

            repo.delete(killId)
        }
    }

    fun reset() {
        viewModelScope.launch {
            repo.deleteAll()
        }
    }
}