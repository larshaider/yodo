package de.lhaider.yodo.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed interface Screen {

    @Serializable
    data object Home : Screen

    @Serializable
    data object DemonsSouls : Screen

    @Serializable
    data object DarkSouls : Screen

    @Serializable
    data object DarkSouls3 : Screen
}