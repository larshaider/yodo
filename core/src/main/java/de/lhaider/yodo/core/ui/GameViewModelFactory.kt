package de.lhaider.yodo.core.ui

import android.app.Activity
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import dagger.assisted.AssistedFactory
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.EntryPointAccessors
import dagger.hilt.android.components.ActivityComponent
import de.lhaider.yodo.core.game.Game

@AssistedFactory
interface GameViewModelFactory {

    @Suppress("UNCHECKED_CAST")
    companion object {
        fun provide(
            assistedFactory: GameViewModelFactory,
            game: Game
        ): ViewModelProvider.Factory = object : ViewModelProvider.Factory {
            override fun <T : ViewModel> create(modelClass: Class<T>): T {
                return assistedFactory.create(game) as T
            }
        }
    }

    fun create(game: Game): GameViewModel
}

@EntryPoint
@InstallIn(ActivityComponent::class)
interface GameViewModelFactoryProvider {
    fun gameViewModelFactory(): GameViewModelFactory
}

@Composable
fun gameViewModel(game: Game, key: String? = game.id): GameViewModel {
    val factory = EntryPointAccessors.fromActivity(
        LocalContext.current as Activity,
        GameViewModelFactoryProvider::class.java
    ).gameViewModelFactory()

    return viewModel(factory = GameViewModelFactory.provide(factory, game), key = key)
}