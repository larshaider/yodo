package de.lhaider.yodo.db.save.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import de.lhaider.yodo.db.save.domain.KilledEnemy

@Entity(tableName = "killed_enemy")
data class KilledEnemyDto(
    @PrimaryKey(autoGenerate = true) override val id: Long = 0,
    @ColumnInfo(name = "game_id") override val gameId: String,
    @ColumnInfo(name = "location_id") override val locationId: String,
    @ColumnInfo(name = "enemy_id") override val enemyId: String
) : KilledEnemy