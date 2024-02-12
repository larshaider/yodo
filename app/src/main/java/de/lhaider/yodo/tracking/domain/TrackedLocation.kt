package de.lhaider.yodo.tracking.domain

interface TrackedLocation {
    val identifier: String
    val enemies: List<TrackedEnemy>
    val currentPoints: Int
    val maxPoints: Int
}