package de.lhaider.yodo.game.data

import de.lhaider.yodo.game.domain.Game
import de.lhaider.yodo.location.data.CemeteryOfAsh
import de.lhaider.yodo.location.domain.Location

class DarkSouls3 : Game {

    override val locations = listOf(
        CemeteryOfAsh()
    )
}