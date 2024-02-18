package de.lhaider.yodo.tracking.domain

import de.lhaider.yodo.ui.text.UIText

interface TrackedLocation {
    val identifier: String
    val name: UIText
    val enemies: List<TrackedEnemy>
    val currentPoints: Int
    val maxPoints: Int
}