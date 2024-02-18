package de.lhaider.yodo.tracking.domain

import de.lhaider.yodo.ui.text.UIText

interface TrackedEnemy {
    val identifier: String
    val name: UIText
    val killId: Long?
    val currentPoints: Int
    val maxPoints: Int
    val type: Type

    enum class Type {
        MiniBoss,
        Invader,
        Boss
    }
}

fun TrackedEnemy.isKilled(): Boolean {
    return this.killId != null
}