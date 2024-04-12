package de.lhaider.yodo.core.ui.dto.domain

import de.lhaider.yodo.common.ui_text.UIText

interface TrackedLocation {
    val identifier: String
    val name: UIText
    val enemies: List<TrackedEnemy>
    val currentPoints: Int
    val maxPoints: Int
}

fun TrackedLocation.isFinished(): Boolean {
    return this.currentPoints == this.maxPoints
}