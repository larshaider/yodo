package de.lhaider.yodo.tracking.data

import de.lhaider.yodo.domain.enemy.Enemy
import de.lhaider.yodo.tracking.domain.TrackedEnemy

data class MainTrackedEnemy(
    override val enemy: Enemy,
    override val killId: Long? = null
) : TrackedEnemy