package de.lhaider.yodo.save.di

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import de.lhaider.yodo.common.database.AppDatabase
import de.lhaider.yodo.save.data.KilledEnemyDao
import de.lhaider.yodo.save.data.KilledEnemyDtoRepo
import de.lhaider.yodo.save.domain.KilledEnemyRepo
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