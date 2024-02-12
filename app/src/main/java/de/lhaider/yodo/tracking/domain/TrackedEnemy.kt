package de.lhaider.yodo.tracking.domain

interface TrackedEnemy {
    val identifier: String
    val killId: Long?
    val currentPoints: Int
    val maxPoints: Int
}

fun TrackedEnemy.isKilled(): Boolean {
    return this.killId != null
}