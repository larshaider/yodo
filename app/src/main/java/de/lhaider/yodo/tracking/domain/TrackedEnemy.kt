package de.lhaider.yodo.tracking.domain

interface TrackedEnemy {
    val identifier: String
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