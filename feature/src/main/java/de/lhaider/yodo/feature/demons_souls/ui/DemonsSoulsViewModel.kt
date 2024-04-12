package de.lhaider.yodo.feature.demons_souls.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import de.lhaider.yodo.core.tracking.data.MainTrackedEnemy
import de.lhaider.yodo.core.tracking.data.MainTrackedLocation
import de.lhaider.yodo.core.tracking.domain.TrackedEnemy
import de.lhaider.yodo.core.tracking.domain.TrackedLocation
import de.lhaider.yodo.db.save.domain.KilledEnemyRepo
import de.lhaider.yodo.feature.demons_souls.game.DemonsSouls
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DemonsSoulsViewModel @Inject constructor(
    private val repo: KilledEnemyRepo
) : ViewModel() {
    data class UIState(
        val isLoading: Boolean = true,
        val locations: List<TrackedLocation> = emptyList(),
        val currentPoints: Int = 0,
        val maxPoints: Int = 0
    )

    private val game = DemonsSouls()

    private val _uiState = MutableStateFlow(UIState())
    val uiState = _uiState.asStateFlow()

    init {
        collectRepoUpdates()
    }

    private fun collectRepoUpdates() {
        viewModelScope.launch {
            repo.getAllBy(game.id).collect { killed ->
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
                repo.create(game.id, location.identifier, enemy.identifier)
                return@launch
            }

            repo.delete(killId)
        }
    }

    fun reset() {
        viewModelScope.launch {
            repo.deleteAllBy(game.id)
        }
    }
}