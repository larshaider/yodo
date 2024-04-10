package de.lhaider.yodo.core.tracking.data

import de.lhaider.yodo.core.enemy.Boss
import de.lhaider.yodo.core.enemy.Enemy
import de.lhaider.yodo.core.enemy.Invader
import de.lhaider.yodo.core.enemy.MiniBoss
import de.lhaider.yodo.core.tracking.domain.TrackedEnemy

data class MainTrackedEnemy(
    private val enemy: Enemy,
    override val killId: Long? = null
) : TrackedEnemy {
    override val identifier = enemy.identifier
    override val name = enemy.name
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