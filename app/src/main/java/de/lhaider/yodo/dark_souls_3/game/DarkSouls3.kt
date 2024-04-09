package de.lhaider.yodo.dark_souls_3.game

import de.lhaider.yodo.dark_souls_3.location.*
import de.lhaider.yodo.domain.game.Game

class DarkSouls3 : Game {

    override val id = "dark_souls_3"

    override val locations = listOf(
        CemeteryOfAsh,
        UndeadSettlement,
        RoadOfSacrifices,
        FarronKeep,
        CathedralOfTheDeep,
        CatacombsOfCarthus,
        SmoulderingLake,
        IrithyllOfTheBorealValley,
        ProfanedCapital,
        AnorLondo,
        HighWallOfLothric,
        LothricCastle,
        GrandArchives,
        ConsumedKingsGarden,
        UntendedGraves,
        ArchdragonPeak,
        KilnOfTheFirstFlame,
        PaintedWorldOfAriandel,
        DregHeap,
        RingedCity
    )
}