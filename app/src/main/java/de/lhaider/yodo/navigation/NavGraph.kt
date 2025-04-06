package de.lhaider.yodo.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import de.lhaider.yodo.MainScreen
import de.lhaider.yodo.core.ui.GameView
import de.lhaider.yodo.core.ui.gameViewModel
import de.lhaider.yodo.feature.dark_souls3.game.DarkSouls3
import de.lhaider.yodo.feature.demons_souls.game.DemonsSouls

@Composable
fun NavGraph(
    navController: NavHostController,
    startDestination: Screen
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable<Screen.Home> {
            MainScreen(
                navController = navController
            )
        }

        composable<Screen.DarkSouls3> {
            GameView(
                navController = navController,
                viewModel = gameViewModel(game = DarkSouls3())
            )
        }

        composable<Screen.DemonsSouls> {
            GameView(
                navController = navController,
                viewModel = gameViewModel(game = DemonsSouls())
            )
        }
    }
}