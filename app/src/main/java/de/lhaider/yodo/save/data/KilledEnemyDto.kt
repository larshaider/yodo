package de.lhaider.yodo.save.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import de.lhaider.yodo.save.domain.KilledEnemy

@Entity(tableName = "killed_enemy")
data class KilledEnemyDto(
    @PrimaryKey(autoGenerate = true) override val id: Long = 0,
    @ColumnInfo(name = "location_id") override val locationId: String,
    @ColumnInfo(name = "enemy_id") override val enemyId: String
) : KilledEnemy