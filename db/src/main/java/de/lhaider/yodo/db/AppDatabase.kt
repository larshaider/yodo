package de.lhaider.yodo.db

import androidx.room.Database
import androidx.room.RoomDatabase
import de.lhaider.yodo.db.save.data.KilledEnemyDao
import de.lhaider.yodo.db.save.data.KilledEnemyDto

@Database(entities = [KilledEnemyDto::class], version = 2)
abstract class AppDatabase : RoomDatabase() {
    abstract fun killedEnemyDao(): KilledEnemyDao
}