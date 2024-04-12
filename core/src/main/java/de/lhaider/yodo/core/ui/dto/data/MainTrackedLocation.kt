package de.lhaider.yodo.core.ui.dto.data

import de.lhaider.yodo.core.location.Location
import de.lhaider.yodo.core.ui.dto.domain.TrackedEnemy
import de.lhaider.yodo.core.ui.dto.domain.TrackedLocation

data class MainTrackedLocation(
    private val location: Location,
    override val enemies: List<TrackedEnemy>,
) : TrackedLocation {
    override val identifier = location.identifier
    override val name = location.name
    override val currentPoints = enemies.sumOf { it.currentPoints }
    override val maxPoints = enemies.sumOf { it.maxPoints }
}