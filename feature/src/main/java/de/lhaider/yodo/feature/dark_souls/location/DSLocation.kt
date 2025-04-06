package de.lhaider.yodo.feature.dark_souls.location

import de.lhaider.yodo.common.ui_text.UIText
import de.lhaider.yodo.core.enemy.Enemy
import de.lhaider.yodo.core.location.Location
import de.lhaider.yodo.feature.R
import de.lhaider.yodo.feature.dark_souls.enemy.ArtoriasTheAbysswalker
import de.lhaider.yodo.feature.dark_souls.enemy.AsylumDemon
import de.lhaider.yodo.feature.dark_souls.enemy.BedOfChaos
import de.lhaider.yodo.feature.dark_souls.enemy.BellGargoyles
import de.lhaider.yodo.feature.dark_souls.enemy.BerenikeKnight
import de.lhaider.yodo.feature.dark_souls.enemy.BlackDragonKalameet
import de.lhaider.yodo.feature.dark_souls.enemy.BlackHydra
import de.lhaider.yodo.feature.dark_souls.enemy.BlackKnightGreataxe
import de.lhaider.yodo.feature.dark_souls.enemy.BlackKnightGreatsword
import de.lhaider.yodo.feature.dark_souls.enemy.BlackKnightHalberd
import de.lhaider.yodo.feature.dark_souls.enemy.BlackKnightSword
import de.lhaider.yodo.feature.dark_souls.enemy.Butcher
import de.lhaider.yodo.feature.dark_souls.enemy.CapraDemon
import de.lhaider.yodo.feature.dark_souls.enemy.CeaselessDischarge
import de.lhaider.yodo.feature.dark_souls.enemy.CentipedeDemon
import de.lhaider.yodo.feature.dark_souls.enemy.Channeler
import de.lhaider.yodo.feature.dark_souls.enemy.ChaosWitchQuelaag
import de.lhaider.yodo.feature.dark_souls.enemy.CrossbreedPriscilla
import de.lhaider.yodo.feature.dark_souls.enemy.DarkSunGwyndolin
import de.lhaider.yodo.feature.dark_souls.enemy.DemonFiresage
import de.lhaider.yodo.feature.dark_souls.enemy.FangBoar
import de.lhaider.yodo.feature.dark_souls.enemy.FourKings
import de.lhaider.yodo.feature.dark_souls.enemy.GapingDragon
import de.lhaider.yodo.feature.dark_souls.enemy.GiantCat
import de.lhaider.yodo.feature.dark_souls.enemy.GiantRat
import de.lhaider.yodo.feature.dark_souls.enemy.GoldenCrystalGolem
import de.lhaider.yodo.feature.dark_souls.enemy.GravelordNito
import de.lhaider.yodo.feature.dark_souls.enemy.GreatGreyWolfSif
import de.lhaider.yodo.feature.dark_souls.enemy.GwynLordOfCinder
import de.lhaider.yodo.feature.dark_souls.enemy.HavelTheRock
import de.lhaider.yodo.feature.dark_souls.enemy.HellkiteWyvern
import de.lhaider.yodo.feature.dark_souls.enemy.Hydra
import de.lhaider.yodo.feature.dark_souls.enemy.IronGolem
import de.lhaider.yodo.feature.dark_souls.enemy.KirkKnightOfThorns
import de.lhaider.yodo.feature.dark_souls.enemy.ManeaterMildred
import de.lhaider.yodo.feature.dark_souls.enemy.ManusFatherOfTheAbyss
import de.lhaider.yodo.feature.dark_souls.enemy.MarvelousChester
import de.lhaider.yodo.feature.dark_souls.enemy.MassOfSouls
import de.lhaider.yodo.feature.dark_souls.enemy.MoonlightButterfly
import de.lhaider.yodo.feature.dark_souls.enemy.OrnsteinAndSmough
import de.lhaider.yodo.feature.dark_souls.enemy.PaladinLeeroy
import de.lhaider.yodo.feature.dark_souls.enemy.ParasiticWallHugger
import de.lhaider.yodo.feature.dark_souls.enemy.Pinwheel
import de.lhaider.yodo.feature.dark_souls.enemy.RichardTheArcher
import de.lhaider.yodo.feature.dark_souls.enemy.SanctuaryGuardian
import de.lhaider.yodo.feature.dark_souls.enemy.SeathTheScaleless
import de.lhaider.yodo.feature.dark_souls.enemy.StrayDemon
import de.lhaider.yodo.feature.dark_souls.enemy.TaurusDemon
import de.lhaider.yodo.feature.dark_souls.enemy.TitaniteDemon
import de.lhaider.yodo.feature.dark_souls.enemy.UndeadDragon
import de.lhaider.yodo.feature.dark_souls.enemy.XanthousKingJeremiah

sealed class DSLocation(
    locationId: String,
    override val enemies: List<Enemy>,
    override val name: UIText = UIText.Dynamic("Undefined")
) : Location {
    override val identifier = "ds_$locationId"
}

data object UndeadAsylum : DSLocation(
    "undead_asylum",
    listOf(
        AsylumDemon,
        StrayDemon,
        BlackKnightSword("first"),
        BlackKnightSword("second")
    ),
    UIText.Resource(R.string.ds_undead_asylum)
)

data object UndeadBurg : DSLocation(
    "undead_burg",
    listOf(
        BlackKnightSword(),
        TaurusDemon,
        HavelTheRock,
        HellkiteWyvern
    ),
    UIText.Resource(R.string.ds_undead_burg)
)

data object UndeadParish : DSLocation(
    "undead_parish",
    listOf(
        FangBoar(),
        BlackKnightGreatsword,
        BerenikeKnight,
        Channeler(),
        BellGargoyles,
        TitaniteDemon(),
        CapraDemon
    ),
    UIText.Resource(R.string.ds_undead_parish)
)

data object DarkrootGarden : DSLocation(
    "darkroot_basin",
    listOf(
        MoonlightButterfly,
        GiantCat("first"),
        GiantCat("second"),
        GiantCat("third"),
        GreatGreyWolfSif
    ),
    UIText.Resource(R.string.ds_darkroot_garden)
)

data object DarkrootBasin : DSLocation(
    "darkroot_basin",
    listOf(
        BlackKnightHalberd,
        Hydra,
        GoldenCrystalGolem()
    ),
    UIText.Resource(R.string.ds_darkroot_basin)
)

data object Depths : DSLocation(
    "depths",
    listOf(
        Butcher("first"),
        Butcher("second"),
        GiantRat,
        KirkKnightOfThorns,
        Channeler(),
        GapingDragon
    ),
    UIText.Resource(R.string.ds_depths)
)

data object Blighttown : DSLocation(
    "blighttown",
    listOf(
        ManeaterMildred,
        ParasiticWallHugger
    ),
    UIText.Resource(R.string.ds_blighttown)
)

data object QuelaagsDomain : DSLocation(
    "quelaags_domain",
    listOf(
        ChaosWitchQuelaag
    ),
    UIText.Resource(R.string.ds_quelaags_domain)
)

data object AshLake : DSLocation(
    "ash_lake",
    listOf(
        BlackHydra
    ),
    UIText.Resource(R.string.ds_ash_lake)
)

data object ValleyOfDrakes : DSLocation(
    "valley_of_drakes",
    listOf(
        UndeadDragon
    ),
    UIText.Resource(R.string.ds_valley_of_drakes)
)

data object SensFortress : DSLocation(
    "sens_fortress",
    listOf(
        BerenikeKnight,
        RichardTheArcher,
        IronGolem,
        TitaniteDemon("first"),
        TitaniteDemon("second"),
        TitaniteDemon("third"),
        TitaniteDemon("fourth")
    ),
    UIText.Resource(R.string.ds_sens_fortress)
)

data object AnorLondo : DSLocation(
    "anor_londo",
    listOf(
        TitaniteDemon(),
        OrnsteinAndSmough,
        DarkSunGwyndolin
    ),
    UIText.Resource(R.string.ds_anor_londo)
)

data object PaintedWorldOfAriamis : DSLocation(
    "painted_world_of_ariamis",
    listOf(
        UndeadDragon,
        XanthousKingJeremiah,
        BerenikeKnight,
        CrossbreedPriscilla
    ),
    UIText.Resource(R.string.ds_painted_world_of_ariamis)
)

data object NewLondoRuins : DSLocation(
    "new_londo_ruins",
    listOf(
        MassOfSouls("first"),
        MassOfSouls("second")
    ),
    UIText.Resource(R.string.ds_new_londo_ruins)
)

data object Abyss : DSLocation(
    "abyss",
    listOf(
        FourKings
    ),
    UIText.Resource(R.string.ds_abyss)
)

data object DukesArchive : DSLocation(
    "dukes_archive",
    listOf(
        FangBoar("first"),
        FangBoar("second"),
        Channeler("first"),
        Channeler("second"),
        Channeler("third"),
        GoldenCrystalGolem()
    ),
    UIText.Resource(R.string.ds_the_dukes_archives)
)

data object CrystalCave : DSLocation(
    "crystal_cave",
    listOf(
        GoldenCrystalGolem("first"),
        GoldenCrystalGolem("second"),
        SeathTheScaleless
    ),
    UIText.Resource(R.string.ds_crystal_cave)
)

data object DemonRuins : DSLocation(
    "demon_ruins",
    listOf(
        CeaselessDischarge,
        KirkKnightOfThorns,
        DemonFiresage,
        CentipedeDemon
    ),
    UIText.Resource(R.string.ds_demon_ruins)
)

data object LostIzalith : DSLocation(
    "lost_izalith",
    listOf(
        TitaniteDemon(),
        KirkKnightOfThorns,
        BedOfChaos
    ),
    UIText.Resource(R.string.ds_lost_izalith)
)

data object Catacombs : DSLocation(
    "catacombs",
    listOf(
        TitaniteDemon(),
        BlackKnightGreataxe,
        Pinwheel
    ),
    UIText.Resource(R.string.ds_catacombs)
)

data object TombOfGiants : DSLocation(
    "tomb_of_giants",
    listOf(
        BlackKnightHalberd,
        PaladinLeeroy,
        GravelordNito
    ),
    UIText.Resource(R.string.ds_tomb_of_giants)
)

data object KilnOfTheFirstFlame : DSLocation(
    "kiln_of_the_first_flame",
    listOf(
        BlackKnightSword("first"),
        BlackKnightGreatsword,
        BlackKnightSword("second"),
        BlackKnightGreataxe,
        BlackKnightHalberd,
        GwynLordOfCinder
    ),
    UIText.Resource(R.string.ds_kiln_of_the_first_flame)
)

data object SanctuaryGarden : DSLocation(
    "sanctuary_garden",
    listOf(
        SanctuaryGuardian
    ),
    UIText.Resource(R.string.ds_sanctuary_garden)
)

data object RoyalWood : DSLocation(
    "royal_wood",
    listOf(
        ArtoriasTheAbysswalker,
        BlackDragonKalameet
    ),
    UIText.Resource(R.string.ds_royal_wood)
)

data object OolacileTownship : DSLocation(
    "oolacile_township",
    listOf(
        MarvelousChester
    ),
    UIText.Resource(R.string.ds_oolacile_township)
)

data object ChasmOfTheAbyss : DSLocation(
    "chasm_of_the_abyss",
    listOf(
        ManusFatherOfTheAbyss
    ),
    UIText.Resource(R.string.ds_chasm_of_the_abyss)
)