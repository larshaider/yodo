package de.lhaider.yodo.dark_souls_3

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import de.lhaider.yodo.dark_souls_3.game.DarkSouls3
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
class DarkSouls3ViewModel @Inject constructor() : ViewModel() {

    private val game = DarkSouls3()

    private val _locations: MutableStateFlow<List<TrackedLocation>> = MutableStateFlow(emptyList())
    val locations: StateFlow<List<TrackedLocation>> = _locations.asStateFlow()

    val currentPoints: StateFlow<Int> = _locations.map { locations ->
        locations.sumOf { it.currentPoints }
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(), 0)

    val maxPoints: StateFlow<Int> = _locations.map { locations ->
        locations.sumOf { it.maxPoints }
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(), 0)

    init {
        collectLocationUpdates()
    }

    private fun collectLocationUpdates() {
        viewModelScope.launch {
            val trackedLocations = mutableListOf<TrackedLocation>()
            for (location in game.locations) {
                val trackedEnemies = mutableListOf<TrackedEnemy>()
                for (enemy in location.enemies) {
                    val trackedEnemy = MainTrackedEnemy(enemy, null)
                    trackedEnemies.add(trackedEnemy)
                }

                val trackedLocation = MainTrackedLocation(location, trackedEnemies)
                trackedLocations.add(trackedLocation)
            }

            _locations.update { trackedLocations }
        }
    }
}