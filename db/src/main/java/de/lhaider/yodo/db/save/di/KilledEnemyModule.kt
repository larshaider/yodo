package de.lhaider.yodo.db.save.di

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import de.lhaider.yodo.db.AppDatabase
import de.lhaider.yodo.db.save.data.KilledEnemyDao
import de.lhaider.yodo.db.save.data.KilledEnemyDtoRepo
import de.lhaider.yodo.db.save.domain.KilledEnemyRepo
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object KilledEnemyProvideModule {

    @Provides
    @Singleton
    fun provideKilledEnemyDao(
        database: AppDatabase
    ): KilledEnemyDao {
        return database.killedEnemyDao()
    }
}

@Module
@InstallIn(SingletonComponent::class)
abstract class KilledEnemyBindModule {

    @Binds
    @Singleton
    abstract fun bindKilledEnemyRepo(
        value: KilledEnemyDtoRepo
    ): KilledEnemyRepo
}