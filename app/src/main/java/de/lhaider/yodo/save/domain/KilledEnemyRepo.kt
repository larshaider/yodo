package de.lhaider.yodo.save.domain

import kotlinx.coroutines.flow.Flow

interface KilledEnemyRepo {
    suspend fun getAll(): Flow<List<KilledEnemy>>
    suspend fun create(locationId: String, enemyId: String)
    suspend fun delete(id: Long)
    suspend fun deleteAll()
}