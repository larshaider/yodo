package de.lhaider.yodo.tracking.data

import de.lhaider.yodo.domain.location.Location
import de.lhaider.yodo.tracking.domain.TrackedEnemy
import de.lhaider.yodo.tracking.domain.TrackedLocation

data class MainTrackedLocation(
    override val location: Location,
    override val enemies: List<TrackedEnemy>,
) : TrackedLocation {
    override val currentPoints = enemies.sumOf { if (it.isKilled) it.enemy.pointsForKill else 0 }
    override val maxPoints = enemies.sumOf { it.enemy.pointsForKill }
}