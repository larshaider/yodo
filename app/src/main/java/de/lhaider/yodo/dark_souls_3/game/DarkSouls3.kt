package de.lhaider.yodo.dark_souls_3.game

import de.lhaider.yodo.dark_souls_3.location.CatacombsOfCarthus
import de.lhaider.yodo.dark_souls_3.location.CathedralOfTheDeep
import de.lhaider.yodo.dark_souls_3.location.CemeteryOfAsh
import de.lhaider.yodo.dark_souls_3.location.FarronKeep
import de.lhaider.yodo.dark_souls_3.location.RoadOfSacrifices
import de.lhaider.yodo.dark_souls_3.location.SmoulderingLake
import de.lhaider.yodo.dark_souls_3.location.UndeadSettlement
import de.lhaider.yodo.domain.game.Game

class DarkSouls3 : Game {

    override val locations = listOf(
        CemeteryOfAsh(),
        UndeadSettlement(),
        RoadOfSacrifices(),
        FarronKeep(),
        CathedralOfTheDeep(),
        CatacombsOfCarthus(),
        SmoulderingLake()
    )
}