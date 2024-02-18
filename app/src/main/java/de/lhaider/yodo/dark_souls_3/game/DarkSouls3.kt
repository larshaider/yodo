package de.lhaider.yodo.dark_souls_3.game

import de.lhaider.yodo.dark_souls_3.location.DS3Location.AnorLondo
import de.lhaider.yodo.dark_souls_3.location.DS3Location.ArchdragonPeak
import de.lhaider.yodo.dark_souls_3.location.DS3Location.CatacombsOfCarthus
import de.lhaider.yodo.dark_souls_3.location.DS3Location.CathedralOfTheDeep
import de.lhaider.yodo.dark_souls_3.location.DS3Location.CemeteryOfAsh
import de.lhaider.yodo.dark_souls_3.location.DS3Location.ConsumedKingsGarden
import de.lhaider.yodo.dark_souls_3.location.DS3Location.DregHeap
import de.lhaider.yodo.dark_souls_3.location.DS3Location.FarronKeep
import de.lhaider.yodo.dark_souls_3.location.DS3Location.GrandArchives
import de.lhaider.yodo.dark_souls_3.location.DS3Location.HighWallOfLothric
import de.lhaider.yodo.dark_souls_3.location.DS3Location.IrithyllOfTheBorealValley
import de.lhaider.yodo.dark_souls_3.location.DS3Location.KilnOfTheFirstFlame
import de.lhaider.yodo.dark_souls_3.location.DS3Location.LothricCastle
import de.lhaider.yodo.dark_souls_3.location.DS3Location.PaintedWorldOfAriandel
import de.lhaider.yodo.dark_souls_3.location.DS3Location.ProfanedCapital
import de.lhaider.yodo.dark_souls_3.location.DS3Location.RingedCity
import de.lhaider.yodo.dark_souls_3.location.DS3Location.RoadOfSacrifices
import de.lhaider.yodo.dark_souls_3.location.DS3Location.SmoulderingLake
import de.lhaider.yodo.dark_souls_3.location.DS3Location.UndeadSettlement
import de.lhaider.yodo.dark_souls_3.location.DS3Location.UntendedGraves
import de.lhaider.yodo.domain.game.Game

class DarkSouls3 : Game {

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