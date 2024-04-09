package de.lhaider.yodo.tracking.data

import de.lhaider.yodo.domain.location.Location
import de.lhaider.yodo.tracking.domain.TrackedEnemy
import de.lhaider.yodo.tracking.domain.TrackedLocation
import de.lhaider.yodo.ui.text.UIText

data class MainTrackedLocation(
    private val location: Location,
    override val enemies: List<TrackedEnemy>,
) : TrackedLocation {
    override val identifier = location.identifier
    override val name = location.name
    override val currentPoints = enemies.sumOf { it.currentPoints }
    override val maxPoints = enemies.sumOf { it.maxPoints }
}