package de.lhaider.yodo.dark_souls_3.game

import de.lhaider.yodo.dark_souls_3.location.DS3Location
import de.lhaider.yodo.domain.game.Game

class DarkSouls3 : Game {

    override val locations = listOf(
        DS3Location.CemeteryOfAsh,
        DS3Location.UndeadSettlement,
        DS3Location.RoadOfSacrifices,
        DS3Location.FarronKeep,
        DS3Location.CathedralOfTheDeep,
        DS3Location.CatacombsOfCarthus,
        DS3Location.SmoulderingLake
    )
}