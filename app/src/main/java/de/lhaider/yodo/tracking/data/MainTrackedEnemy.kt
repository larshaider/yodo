package de.lhaider.yodo.tracking.data

import de.lhaider.yodo.domain.enemy.Boss
import de.lhaider.yodo.domain.enemy.Enemy
import de.lhaider.yodo.domain.enemy.Invader
import de.lhaider.yodo.domain.enemy.MiniBoss
import de.lhaider.yodo.tracking.domain.TrackedEnemy

data class MainTrackedEnemy(
    private val enemy: Enemy,
    override val killId: Long? = null
) : TrackedEnemy {
    override val identifier = enemy.identifier
    override val currentPoints = if (killId == null) 0 else enemy.pointsForKill
    override val maxPoints = enemy.pointsForKill
    override val type = getEnemyType()

    private fun getEnemyType(): TrackedEnemy.Type {
        return when (enemy) {
            is MiniBoss -> TrackedEnemy.Type.MiniBoss
            is Invader -> TrackedEnemy.Type.Invader
            is Boss -> TrackedEnemy.Type.Boss
            else -> throw NotImplementedError()
        }
    }
}