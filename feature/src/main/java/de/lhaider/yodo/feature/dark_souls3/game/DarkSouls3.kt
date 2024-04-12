package de.lhaider.yodo.feature.dark_souls3.game

import de.lhaider.yodo.core.game.Game
import de.lhaider.yodo.feature.dark_souls3.location.AnorLondo
import de.lhaider.yodo.feature.dark_souls3.location.ArchdragonPeak
import de.lhaider.yodo.feature.dark_souls3.location.CatacombsOfCarthus
import de.lhaider.yodo.feature.dark_souls3.location.CathedralOfTheDeep
import de.lhaider.yodo.feature.dark_souls3.location.CemeteryOfAsh
import de.lhaider.yodo.feature.dark_souls3.location.ConsumedKingsGarden
import de.lhaider.yodo.feature.dark_souls3.location.DregHeap
import de.lhaider.yodo.feature.dark_souls3.location.FarronKeep
import de.lhaider.yodo.feature.dark_souls3.location.GrandArchives
import de.lhaider.yodo.feature.dark_souls3.location.HighWallOfLothric
import de.lhaider.yodo.feature.dark_souls3.location.IrithyllOfTheBorealValley
import de.lhaider.yodo.feature.dark_souls3.location.KilnOfTheFirstFlame
import de.lhaider.yodo.feature.dark_souls3.location.LothricCastle
import de.lhaider.yodo.feature.dark_souls3.location.PaintedWorldOfAriandel
import de.lhaider.yodo.feature.dark_souls3.location.ProfanedCapital
import de.lhaider.yodo.feature.dark_souls3.location.RingedCity
import de.lhaider.yodo.feature.dark_souls3.location.RoadOfSacrifices
import de.lhaider.yodo.feature.dark_souls3.location.SmoulderingLake
import de.lhaider.yodo.feature.dark_souls3.location.UndeadSettlement
import de.lhaider.yodo.feature.dark_souls3.location.UntendedGraves

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