package de.lhaider.yodo.navigation

sealed class Screen(val route: String) {
    data object Home : Screen("home_screen")
    data object DarkSouls3 : Screen("dark_souls_3_screen")
    data object DemonsSouls : Screen("demons_souls_screen")
}