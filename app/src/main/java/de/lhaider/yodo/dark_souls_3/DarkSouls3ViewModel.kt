package de.lhaider.yodo.dark_souls_3

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import de.lhaider.yodo.dark_souls_3.game.DarkSouls3
import de.lhaider.yodo.domain.enemy.Enemy
import de.lhaider.yodo.domain.location.Location
import de.lhaider.yodo.save.domain.KilledEnemyRepo
import de.lhaider.yodo.tracking.data.MainTrackedEnemy
import de.lhaider.yodo.tracking.data.MainTrackedLocation
import de.lhaider.yodo.tracking.domain.TrackedEnemy
import de.lhaider.yodo.tracking.domain.TrackedLocation
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DarkSouls3ViewModel @Inject constructor(
    private val repo: KilledEnemyRepo
) : ViewModel() {

    private val game = DarkSouls3()

    private val _isLoading = MutableStateFlow(true)
    val isLoading = _isLoading.asStateFlow()

    private val _locations = MutableStateFlow(emptyList<TrackedLocation>())
    val locations = _locations.asStateFlow()

    val currentPoints: StateFlow<Int> = _locations.map { locations ->
        locations.sumOf { it.currentPoints }
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(), 0)

    val maxPoints: StateFlow<Int> = _locations.map { locations ->
        locations.sumOf { it.maxPoints }
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(), 0)

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

                _locations.update { trackedLocations }
                _isLoading.update { false }
            }
        }
    }

    fun add(location: Location, enemy: Enemy) {
        viewModelScope.launch {
            repo.create(location.identifier, enemy.identifier)
        }
    }

    fun delete(killId: Long) {
        viewModelScope.launch {
            repo.delete(killId)
        }
    }

    fun reset() {
        viewModelScope.launch {
            repo.deleteAll()
        }
    }
}