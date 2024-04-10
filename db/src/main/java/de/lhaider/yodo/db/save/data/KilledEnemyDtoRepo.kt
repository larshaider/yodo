package de.lhaider.yodo.db.save.data

import de.lhaider.yodo.core.coroutine.IoDispatcher
import de.lhaider.yodo.db.save.domain.KilledEnemy
import de.lhaider.yodo.db.save.domain.KilledEnemyRepo
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext
import javax.inject.Inject

class KilledEnemyDtoRepo @Inject constructor(
    private val dao: KilledEnemyDao,
    @IoDispatcher private val dispatcher: CoroutineDispatcher
) : KilledEnemyRepo {

    override suspend fun getAll(): Flow<List<KilledEnemy>> {
        return withContext(dispatcher) {
            dao.getAll()
        }
    }

    override suspend fun getAllBy(gameId: String): Flow<List<KilledEnemy>> {
        return withContext(dispatcher) {
            dao.getAllBy(gameId)
        }
    }

    override suspend fun create(gameId: String, locationId: String, enemyId: String) {
        return withContext(dispatcher) {
            val dto = KilledEnemyDto(gameId = gameId, locationId = locationId, enemyId = enemyId)
            dao.insert(dto)
        }
    }

    override suspend fun delete(id: Long) {
        return withContext(dispatcher) {
            dao.deleteById(id)
        }
    }

    override suspend fun deleteAllBy(gameId: String) {
        return withContext(dispatcher) {
            dao.deleteAllBy(gameId)
        }
    }

    override suspend fun deleteAll() {
        return withContext(dispatcher) {
            dao.deleteAll()
        }
    }
}