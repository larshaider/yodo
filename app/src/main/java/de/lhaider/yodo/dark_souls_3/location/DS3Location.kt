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
}