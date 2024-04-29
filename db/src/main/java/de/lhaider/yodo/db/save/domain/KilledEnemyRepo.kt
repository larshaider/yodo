package de.lhaider.yodo.db.save.domain

import kotlinx.coroutines.flow.Flow

interface KilledEnemyRepo {
    suspend fun getAllBy(gameId: String): Flow<List<KilledEnemy>>
    suspend fun create(gameId: String, locationId: String, enemyId: String)
    suspend fun deleteById(id: Long)
    suspend fun deleteAllBy(gameId: String)
}