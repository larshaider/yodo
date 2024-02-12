package de.lhaider.yodo.database

import androidx.room.Database
import androidx.room.RoomDatabase
import de.lhaider.yodo.save.data.KilledEnemyDao
import de.lhaider.yodo.save.data.KilledEnemyDto

@Database(entities = [KilledEnemyDto::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun killedEnemyDao(): KilledEnemyDao
}