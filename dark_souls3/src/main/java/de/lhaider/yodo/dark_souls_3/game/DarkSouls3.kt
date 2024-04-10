package de.lhaider.yodo.dark_souls_3.game

import de.lhaider.yodo.core.game.Game
import de.lhaider.yodo.dark_souls_3.location.AnorLondo
import de.lhaider.yodo.dark_souls_3.location.ArchdragonPeak
import de.lhaider.yodo.dark_souls_3.location.CatacombsOfCarthus
import de.lhaider.yodo.dark_souls_3.location.CathedralOfTheDeep
import de.lhaider.yodo.dark_souls_3.location.CemeteryOfAsh
import de.lhaider.yodo.dark_souls_3.location.ConsumedKingsGarden
import de.lhaider.yodo.dark_souls_3.location.DregHeap
import de.lhaider.yodo.dark_souls_3.location.FarronKeep
import de.lhaider.yodo.dark_souls_3.location.GrandArchives
import de.lhaider.yodo.dark_souls_3.location.HighWallOfLothric
import de.lhaider.yodo.dark_souls_3.location.IrithyllOfTheBorealValley
import de.lhaider.yodo.dark_souls_3.location.KilnOfTheFirstFlame
import de.lhaider.yodo.dark_souls_3.location.LothricCastle
import de.lhaider.yodo.dark_souls_3.location.PaintedWorldOfAriandel
import de.lhaider.yodo.dark_souls_3.location.ProfanedCapital
import de.lhaider.yodo.dark_souls_3.location.RingedCity
import de.lhaider.yodo.dark_souls_3.location.RoadOfSacrifices
import de.lhaider.yodo.dark_souls_3.location.SmoulderingLake
import de.lhaider.yodo.dark_souls_3.location.UndeadSettlement
import de.lhaider.yodo.dark_souls_3.location.UntendedGraves

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