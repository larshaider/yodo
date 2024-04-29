package de.lhaider.yodo.feature.dark_souls3.location

import de.lhaider.yodo.common.ui_text.UIText
import de.lhaider.yodo.core.enemy.Enemy
import de.lhaider.yodo.core.location.Location
import de.lhaider.yodo.feature.R
import de.lhaider.yodo.feature.dark_souls3.enemy.AbyssWatchers
import de.lhaider.yodo.feature.dark_souls3.enemy.AldrichDevourerOfGods
import de.lhaider.yodo.feature.dark_souls3.enemy.AlvaSeekerOfTheSpurned
import de.lhaider.yodo.feature.dark_souls3.enemy.AncientWyvern
import de.lhaider.yodo.feature.dark_souls3.enemy.BorealOutriderKnight
import de.lhaider.yodo.feature.dark_souls3.enemy.CarthusSandworm
import de.lhaider.yodo.feature.dark_souls3.enemy.ChampionGundyr
import de.lhaider.yodo.feature.dark_souls3.enemy.ChampionsGravetenderAndGreatwolf
import de.lhaider.yodo.feature.dark_souls3.enemy.CreightonTheWanderer
import de.lhaider.yodo.feature.dark_souls3.enemy.CrystalSage
import de.lhaider.yodo.feature.dark_souls3.enemy.CurseRottedGreatwood
import de.lhaider.yodo.feature.dark_souls3.enemy.DancerOfTheBorealValley
import de.lhaider.yodo.feature.dark_souls3.enemy.DarkeaterMidir
import de.lhaider.yodo.feature.dark_souls3.enemy.DaughterOfCrystalKriemhild
import de.lhaider.yodo.feature.dark_souls3.enemy.DeaconsOfTheDeep
import de.lhaider.yodo.feature.dark_souls3.enemy.DeepAccursed
import de.lhaider.yodo.feature.dark_souls3.enemy.Demon
import de.lhaider.yodo.feature.dark_souls3.enemy.DemonPrince
import de.lhaider.yodo.feature.dark_souls3.enemy.DragonslayerArmour
import de.lhaider.yodo.feature.dark_souls3.enemy.HalflightSpearOfTheChurch
import de.lhaider.yodo.feature.dark_souls3.enemy.HighLordWolnir
import de.lhaider.yodo.feature.dark_souls3.enemy.HolyKnightHodrick
import de.lhaider.yodo.feature.dark_souls3.enemy.IudexGundyr
import de.lhaider.yodo.feature.dark_souls3.enemy.KnightSlayerTsorig
import de.lhaider.yodo.feature.dark_souls3.enemy.LividPyromancerDunnel
import de.lhaider.yodo.feature.dark_souls3.enemy.LondorPaleShade
import de.lhaider.yodo.feature.dark_souls3.enemy.LongfingerKirk
import de.lhaider.yodo.feature.dark_souls3.enemy.LothricYoungerPrince
import de.lhaider.yodo.feature.dark_souls3.enemy.MoaningKnight
import de.lhaider.yodo.feature.dark_souls3.enemy.NamelessKing
import de.lhaider.yodo.feature.dark_souls3.enemy.OceirosTheConsumedKing
import de.lhaider.yodo.feature.dark_souls3.enemy.OldDemonKing
import de.lhaider.yodo.feature.dark_souls3.enemy.PontiffSulyvahn
import de.lhaider.yodo.feature.dark_souls3.enemy.RavenousCrystalLizard
import de.lhaider.yodo.feature.dark_souls3.enemy.SilverKnightLedo
import de.lhaider.yodo.feature.dark_souls3.enemy.SisterFriede
import de.lhaider.yodo.feature.dark_souls3.enemy.SlaveKnightGael
import de.lhaider.yodo.feature.dark_souls3.enemy.SoulOfCinder
import de.lhaider.yodo.feature.dark_souls3.enemy.StrayDemon
import de.lhaider.yodo.feature.dark_souls3.enemy.SulyvahnsBeast
import de.lhaider.yodo.feature.dark_souls3.enemy.SwordMaster
import de.lhaider.yodo.feature.dark_souls3.enemy.VordtOfTheBorealValley
import de.lhaider.yodo.feature.dark_souls3.enemy.YellowfingerHeysel
import de.lhaider.yodo.feature.dark_souls3.enemy.YhormTheGiant

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
    UIText.Resource(R.string.ds3_cemetery_of_ash)
)

data object HighWallOfLothric : DS3Location(
    "high_wall_of_lothric",
    listOf(
        VordtOfTheBorealValley,
        DancerOfTheBorealValley
    ),
    UIText.Resource(R.string.ds3_high_wall_of_lothric)
)

data object UndeadSettlement : DS3Location(
    "undead_settlement",
    listOf(
        HolyKnightHodrick,
        BorealOutriderKnight,
        Demon,
        CurseRottedGreatwood
    ),
    UIText.Resource(R.string.ds3_undead_settlement)
)

data object RoadOfSacrifices : DS3Location(
    "road_of_sacrifices",
    listOf(
        YellowfingerHeysel,
        CrystalSage
    ),
    UIText.Resource(R.string.ds3_road_of_sacrifices)
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
    UIText.Resource(R.string.ds3_farron_keep)
)

data object CathedralOfTheDeep : DS3Location(
    "cathedral_of_the_deep",
    listOf(
        LongfingerKirk,
        RavenousCrystalLizard(),
        DeepAccursed,
        DeaconsOfTheDeep
    ),
    UIText.Resource(R.string.ds3_cathedral_of_the_deep)
)

data object CatacombsOfCarthus : DS3Location(
    "catacombs_of_carthus",
    listOf(
        KnightSlayerTsorig,
        Demon,
        HighLordWolnir
    ),
    UIText.Resource(R.string.ds3_catacombs_of_carthus)
)

data object SmoulderingLake : DS3Location(
    "smouldering_lake",
    listOf(
        KnightSlayerTsorig,
        CarthusSandworm,
        OldDemonKing
    ),
    UIText.Resource(R.string.ds3_smouldering_lake)
)

data object IrithyllOfTheBorealValley : DS3Location(
    "irithyll_of_the_boreal_valley",
    listOf(
        LondorPaleShade,
        CreightonTheWanderer("first"),
        CreightonTheWanderer("second"),
        AlvaSeekerOfTheSpurned,
        SulyvahnsBeast("first"),
        SulyvahnsBeast("second"),
        SulyvahnsBeast("third"),
        PontiffSulyvahn
    ),
    UIText.Resource(R.string.ds3_irithyll_of_the_boreal_valley)
)

data object ProfanedCapital : DS3Location(
    "profaned_capital",
    listOf(
        YhormTheGiant
    ),
    UIText.Resource(R.string.ds3_profaned_capital)
)

data object AnorLondo : DS3Location(
    "anor_londo",
    listOf(
        DeepAccursed,
        AldrichDevourerOfGods
    ),
    UIText.Resource(R.string.ds3_anor_londo)
)

data object LothricCastle : DS3Location(
    "lothric_castle",
    listOf(
        BorealOutriderKnight,
        DragonslayerArmour,
        LothricYoungerPrince
    ),
    UIText.Resource(R.string.ds3_lothric_castle)
)

data object GrandArchives : DS3Location(
    "grand_archives",
    listOf(
        BorealOutriderKnight
    ),
    UIText.Resource(R.string.ds3_grand_archives)
)

data object ConsumedKingsGarden : DS3Location(
    "consumed_kings_garden",
    listOf(
        OceirosTheConsumedKing
    ),
    UIText.Resource(R.string.ds3_consumed_kings_garden)
)

data object UntendedGraves : DS3Location(
    "untended_graves",
    listOf(
        DaughterOfCrystalKriemhild,
        RavenousCrystalLizard("first"),
        RavenousCrystalLizard("second"),
        ChampionGundyr
    ),
    UIText.Resource(R.string.ds3_untended_graves)
)

data object ArchdragonPeak : DS3Location(
    "archdragon_peak",
    listOf(
        AncientWyvern,
        NamelessKing
    ),
    UIText.Resource(R.string.ds3_archdragon_peak)
)

data object KilnOfTheFirstFlame : DS3Location(
    "kiln_of_the_first_flame",
    listOf(
        SoulOfCinder
    ),
    UIText.Resource(R.string.ds3_kiln_of_the_first_flame)
)

data object PaintedWorldOfAriandel : DS3Location(
    "painted_world_of_ariandel",
    listOf(
        LividPyromancerDunnel,
        SisterFriede,
        ChampionsGravetenderAndGreatwolf
    ),
    UIText.Resource(R.string.ds3_painted_world_of_ariandel)
)

data object DregHeap : DS3Location(
    "dreg_heap",
    listOf(
        DemonPrince
    ),
    UIText.Resource(R.string.ds3_dreg_heap)
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
    ),
    UIText.Resource(R.string.ds3_ringed_city)
)