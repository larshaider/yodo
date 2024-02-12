package de.lhaider.yodo.save.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface KilledEnemyDao {

    @Query("SELECT * FROM killed_enemy")
    fun getAll(): Flow<List<KilledEnemyDto>>

    @Insert
    fun insert(enemy: KilledEnemyDto)

    @Query("DELETE FROM killed_enemy WHERE id = :id")
    fun deleteById(id: Long)

    @Query("DELETE FROM killed_enemy")
    fun deleteAll()
}