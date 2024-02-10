package de.lhaider.yodo.dark_souls_3.game

import de.lhaider.yodo.game.domain.Game
import de.lhaider.yodo.dark_souls_3.location.CemeteryOfAsh
import de.lhaider.yodo.dark_souls_3.location.RoadOfSacrifices
import de.lhaider.yodo.dark_souls_3.location.UndeadSettlement

class DarkSouls3 : Game {

    override val locations = listOf(
        CemeteryOfAsh(),
        UndeadSettlement(),
        RoadOfSacrifices()
    )
}