package de.lhaider.yodo.save.domain

import kotlinx.coroutines.flow.Flow

interface KilledEnemyRepo {
    suspend fun getAll(): Flow<List<KilledEnemy>>
    suspend fun getAllBy(gameId: String): Flow<List<KilledEnemy>>
    suspend fun create(gameId: String, locationId: String, enemyId: String)
    suspend fun delete(id: Long)
    suspend fun deleteAllBy(gameId: String)
    suspend fun deleteAll()
}