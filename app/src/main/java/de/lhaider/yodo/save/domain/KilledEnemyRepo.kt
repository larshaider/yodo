package de.lhaider.yodo.save.domain

import de.lhaider.yodo.save.data.KilledEnemyDto
import kotlinx.coroutines.flow.Flow

interface KilledEnemyRepo {
    fun getAll(): Flow<List<KilledEnemyDto>>
    fun create(locationId: String, enemyId: String)
    fun delete(id: Long)
    fun deleteAll()
}