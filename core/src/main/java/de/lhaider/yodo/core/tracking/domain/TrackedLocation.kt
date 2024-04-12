package de.lhaider.yodo.core.tracking.domain

import de.lhaider.yodo.common.ui_text.UIText

interface TrackedLocation {
    val identifier: String
    val name: de.lhaider.yodo.common.ui_text.UIText
    val enemies: List<TrackedEnemy>
    val currentPoints: Int
    val maxPoints: Int
}

fun TrackedLocation.isFinished(): Boolean {
    return this.currentPoints == this.maxPoints
}