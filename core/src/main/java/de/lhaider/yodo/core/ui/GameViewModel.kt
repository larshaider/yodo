package de.lhaider.yodo.core.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import de.lhaider.yodo.common.ui_text.UIText
import de.lhaider.yodo.core.game.Game
import de.lhaider.yodo.core.ui.dto.data.MainTrackedEnemy
import de.lhaider.yodo.core.ui.dto.data.MainTrackedLocation
import de.lhaider.yodo.core.ui.dto.domain.TrackedEnemy
import de.lhaider.yodo.core.ui.dto.domain.TrackedLocation
import de.lhaider.yodo.db.save.domain.KilledEnemyRepo
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class GameViewModel @AssistedInject constructor(
    @Assisted private val game: Game,
    private val repo: KilledEnemyRepo
) : ViewModel() {

    data class UIState(
        val isLoading: Boolean,
        val gameName: UIText,
        val locations: List<TrackedLocation>,
        val currentPoints: Int,
        val maxPoints: Int,
        val allowSelectionChange: Boolean
    )

    private val _uiState = MutableStateFlow(
        UIState(
            isLoading = true,
            gameName = game.name,
            locations = emptyList(),
            currentPoints = 0,
            maxPoints = 0,
            allowSelectionChange = true
        )
    )
    val uiState = _uiState.asStateFlow()

    private var allowModification = true

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
            if (!allowModification) {
                return@launch
            }

            val killId = enemy.killId
            if (killId == null) {
                repo.create(game.id, location.identifier, enemy.identifier)
                return@launch
            }

            repo.deleteById(killId)
        }
    }

    fun resetRun() {
        viewModelScope.launch {
            repo.deleteAllBy(game.id)
        }
    }

    fun onNavigateBack() {
        viewModelScope.launch {
            allowModification = false

            _uiState.update {
                it.copy(
                    allowSelectionChange = false
                )
            }
        }
    }
}