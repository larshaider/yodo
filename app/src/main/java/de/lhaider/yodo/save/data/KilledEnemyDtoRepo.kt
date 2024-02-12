package de.lhaider.yodo.save.data

import de.lhaider.yodo.save.domain.KilledEnemyRepo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class KilledEnemyDtoRepo @Inject constructor(
    private val dao: KilledEnemyDao
) : KilledEnemyRepo {

    override fun getAll(): Flow<List<KilledEnemyDto>> {
        return dao.getAll()
    }

    override fun create(locationId: String, enemyId: String) {
        val dto = KilledEnemyDto(locationId = locationId, enemyId = enemyId)
        dao.insert(dto)
    }

    override fun delete(id: Long) {
        dao.deleteById(id)
    }

    override fun deleteAll() {
        dao.deleteAll()
    }
}