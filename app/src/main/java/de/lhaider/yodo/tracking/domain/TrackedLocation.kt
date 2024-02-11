package de.lhaider.yodo.tracking.domain

import de.lhaider.yodo.domain.location.Location

interface TrackedLocation {
    val location: Location
    val enemies: List<TrackedEnemy>
    val currentPoints: Int
    val maxPoints: Int
}