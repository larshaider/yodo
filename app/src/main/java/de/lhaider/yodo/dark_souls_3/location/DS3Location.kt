package de.lhaider.yodo.dark_souls_3.location

import de.lhaider.yodo.dark_souls_3.enemy.DS3Boss.AbyssWatchers
import de.lhaider.yodo.dark_souls_3.enemy.DS3Boss.CrystalSage
import de.lhaider.yodo.dark_souls_3.enemy.DS3Boss.CurseRottedGreatwood
import de.lhaider.yodo.dark_souls_3.enemy.DS3Boss.DeaconsOfTheDeep
import de.lhaider.yodo.dark_souls_3.enemy.DS3Boss.HighLordWolnir
import de.lhaider.yodo.dark_souls_3.enemy.DS3Boss.IudexGundyr
import de.lhaider.yodo.dark_souls_3.enemy.DS3Boss.OldDemonKing
import de.lhaider.yodo.dark_souls_3.enemy.DS3Invader.HolyKnightHodrick
import de.lhaider.yodo.dark_souls_3.enemy.DS3Invader.KnightSlayerTsorig
import de.lhaider.yodo.dark_souls_3.enemy.DS3Invader.LondorPaleShade
import de.lhaider.yodo.dark_souls_3.enemy.DS3Invader.LongfingerKirk
import de.lhaider.yodo.dark_souls_3.enemy.DS3Invader.YellowfingerHeysel
import de.lhaider.yodo.dark_souls_3.enemy.DS3MiniBoss.BorealOutriderKnight
import de.lhaider.yodo.dark_souls_3.enemy.DS3MiniBoss.CarthusSandworm
import de.lhaider.yodo.dark_souls_3.enemy.DS3MiniBoss.DeepAccursed
import de.lhaider.yodo.dark_souls_3.enemy.DS3MiniBoss.Demon
import de.lhaider.yodo.dark_souls_3.enemy.DS3MiniBoss.RavenousCrystalLizard
import de.lhaider.yodo.dark_souls_3.enemy.DS3MiniBoss.StrayDemon
import de.lhaider.yodo.dark_souls_3.enemy.DS3MiniBoss.SwordMaster
import de.lhaider.yodo.domain.enemy.Enemy
import de.lhaider.yodo.domain.location.Location

sealed class DS3Location(locationId: String, override val enemies: List<Enemy>) : Location {
    override val identifier = "ds3_$locationId"

    data object CemeteryOfAsh : DS3Location(
        "cemetery_of_ash",
        listOf(
            RavenousCrystalLizard,
            SwordMaster,
            IudexGundyr
        )
    )

    data object UndeadSettlement : DS3Location(
        "undead_settlement",
        listOf(
            HolyKnightHodrick,
            BorealOutriderKnight,
            Demon,
            CurseRottedGreatwood
        )
    )

    data object RoadOfSacrifices : DS3Location(
        "road_of_sacrifices",
        listOf(
            YellowfingerHeysel,
            CrystalSage
        )
    )

    data object FarronKeep : DS3Location(
        "farron_keep",
        listOf(
            LondorPaleShade,
            YellowfingerHeysel,
            RavenousCrystalLizard,
            StrayDemon,
            AbyssWatchers
        )
    )

    data object CathedralOfTheDeep : DS3Location(
        "cathedral_of_the_deep",
        listOf(
            LongfingerKirk,
            RavenousCrystalLizard,
            DeepAccursed,
            DeaconsOfTheDeep
        )
    )

    data object CatacombsOfCarthus : DS3Location(
        "catacombs_of_carthus",
        listOf(
            KnightSlayerTsorig,
            Demon,
            HighLordWolnir
        )
    )

    data object SmoulderingLake : DS3Location(
        "smouldering_lake",
        listOf(
            KnightSlayerTsorig,
            CarthusSandworm,
            OldDemonKing
        )
    )

    data object IrithyllOfTheBorealValley : DS3Location("irithyll_of_the_boreal_valley", emptyList())
    data object ProfanedCapital : DS3Location("profaned_capital", emptyList())
    data object AnorLondo : DS3Location("anor_londo", emptyList())
    data object HighWallOfLothric : DS3Location("high_wall_of_lothric", emptyList())
    data object LothricCastle : DS3Location("lothric_castle", emptyList())
    data object GrandArchives : DS3Location("grand_archives", emptyList())
    data object ConsumedKingsGarden : DS3Location("consumed_kings_garden", emptyList())
    data object UntendedGraves : DS3Location("untended_graves", emptyList())
    data object ArchdragonPeak : DS3Location("archdragon_peak", emptyList())
    data object KilnOfTheFirstFlame : DS3Location("kiln_of_the_first_flame", emptyList())
    data object PaintedWorldOfAriandel : DS3Location("painted_world_of_ariandel", emptyList())
    data object DregHeap : DS3Location("dreg_heap", emptyList())
    data object RingedCity : DS3Location("ringed_city", emptyList())
}