package de.lhaider.yodo.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class Screen(val route: String) {

    @Serializable
    data object Home : Screen("home_screen")

    @Serializable
    data object DarkSouls3 : Screen("dark_souls_3_screen")

    @Serializable
    data object DemonsSouls : Screen("demons_souls_screen")
}