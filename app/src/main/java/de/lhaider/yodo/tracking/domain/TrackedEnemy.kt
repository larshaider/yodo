package de.lhaider.yodo.tracking.domain

import de.lhaider.yodo.domain.enemy.Enemy

interface TrackedEnemy {
    val enemy: Enemy
    val killId: Long?
}

fun TrackedEnemy.isKilled(): Boolean {
    return this.killId != null
}