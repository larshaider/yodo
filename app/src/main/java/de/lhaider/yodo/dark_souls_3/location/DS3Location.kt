package de.lhaider.yodo.dark_souls_3.location

import de.lhaider.yodo.R
import de.lhaider.yodo.dark_souls_3.enemy.*
import de.lhaider.yodo.domain.enemy.Enemy
import de.lhaider.yodo.domain.location.Location
import de.lhaider.yodo.ui.text.UIText

sealed class DS3Location(
    locationId: String,
    override val enemies: List<Enemy>,
    override val name: UIText = UIText.Dynamic("Undefined")
) : Location {
    override val identifier = "ds3_$locationId"
}

data object CemeteryOfAsh : DS3Location(
    "cemetery_of_ash",
    listOf(
        RavenousCrystalLizard(),
        SwordMaster,
        IudexGundyr
    ),
    UIText.Resource(R.string.cemetery_of_ash)
)

data object UndeadSettlement : DS3Location(
    "undead_settlement",
    listOf(
        HolyKnightHodrick,
        BorealOutriderKnight,
        Demon,
        CurseRottedGreatwood
    ),
    UIText.Resource(R.string.undead_settlement)
)

data object RoadOfSacrifices : DS3Location(
    "road_of_sacrifices",
    listOf(
        YellowfingerHeysel,
        CrystalSage
    ),
    UIText.Resource(R.string.road_of_sacrifices)
)

data object FarronKeep : DS3Location(
    "farron_keep",
    listOf(
        LondorPaleShade,
        YellowfingerHeysel,
        RavenousCrystalLizard(),
        StrayDemon,
        AbyssWatchers
    ),
    UIText.Resource(R.string.farron_keep)
)

data object CathedralOfTheDeep : DS3Location(
    "cathedral_of_the_deep",
    listOf(
        LongfingerKirk,
        RavenousCrystalLizard(),
        DeepAccursed,
        DeaconsOfTheDeep
    ),
    UIText.Resource(R.string.cathedral_of_the_deep)
)

data object CatacombsOfCarthus : DS3Location(
    "catacombs_of_carthus",
    listOf(
        KnightSlayerTsorig,
        Demon,
        HighLordWolnir
    ),
    UIText.Resource(R.string.catacombs_of_carthus)
)

data object SmoulderingLake : DS3Location(
    "smouldering_lake",
    listOf(
        KnightSlayerTsorig,
        CarthusSandworm,
        OldDemonKing
    ),
    UIText.Resource(R.string.smouldering_lake)
)

data object IrithyllOfTheBorealValley : DS3Location(
    "irithyll_of_the_boreal_valley",
    listOf(
        LondorPaleShade,
        CreightonTheWanderer,
        AlvaSeekerOfTheSpurned,
        SulyvahnsBeast("first"),
        SulyvahnsBeast("second"),
        SulyvahnsBeast("third"),
        PontiffSulyvahn
    )
)

data object ProfanedCapital : DS3Location(
    "profaned_capital",
    listOf(
        YhormTheGiant
    )
)

data object AnorLondo : DS3Location(
    "anor_londo",
    listOf(
        DeepAccursed,
        AldrichDevourerOfGods
    )
)

data object HighWallOfLothric : DS3Location(
    "high_wall_of_lothric",
    listOf(
        DancerOfTheBorealValley
    )
)

data object LothricCastle : DS3Location(
    "lothric_castle",
    listOf(
        BorealOutriderKnight,
        DragonslayerArmour,
        LothricYoungerPrince
    )
)

data object GrandArchives : DS3Location(
    "grand_archives",
    listOf(
        BorealOutriderKnight
    )
)

data object ConsumedKingsGarden : DS3Location(
    "consumed_kings_garden",
    listOf(
        OceirosTheConsumedKing
    )
)

data object UntendedGraves : DS3Location(
    "untended_graves",
    listOf(
        DaughterOfCrystalKriemhild,
        RavenousCrystalLizard("first"),
        RavenousCrystalLizard("second"),
        ChampionGundyr
    )
)

data object ArchdragonPeak : DS3Location(
    "archdragon_peak",
    listOf(
        AncientWyvern,
        NamelessKing
    )
)

data object KilnOfTheFirstFlame : DS3Location(
    "kiln_of_the_first_flame",
    listOf(
        SoulOfCinder
    )
)

data object PaintedWorldOfAriandel : DS3Location(
    "painted_world_of_ariandel",
    listOf(
        LividPyromancerDunnel,
        SisterFriede,
        ChampionsGravetenderAndGreatwolf
    )
)

data object DregHeap : DS3Location(
    "dreg_heap",
    listOf(
        DemonPrince
    )
)

data object RingedCity : DS3Location(
    "ringed_city",
    listOf(
        SilverKnightLedo,
        MoaningKnight,
        AlvaSeekerOfTheSpurned,
        HalflightSpearOfTheChurch,
        DarkeaterMidir,
        SlaveKnightGael
    )
)