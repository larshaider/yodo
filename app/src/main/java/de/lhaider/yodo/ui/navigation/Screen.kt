package de.lhaider.yodo.ui.navigation

sealed class Screen(val route: String) {
    data object Home : Screen("home")
    data object DemonsSouls : Screen("demons_souls")
    data object DarkSouls3 : Screen("dark_souls_3")
}