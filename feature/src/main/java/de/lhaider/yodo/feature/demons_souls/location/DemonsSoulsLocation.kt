package de.lhaider.yodo.feature.demons_souls.location

import de.lhaider.yodo.common.ui_text.UIText
import de.lhaider.yodo.core.enemy.Enemy
import de.lhaider.yodo.core.location.Location
import de.lhaider.yodo.feature.R
import de.lhaider.yodo.feature.demons_souls.enemy.Adjucator
import de.lhaider.yodo.feature.demons_souls.enemy.AlfredKnightOfTheTower
import de.lhaider.yodo.feature.demons_souls.enemy.ArmorSpider
import de.lhaider.yodo.feature.demons_souls.enemy.BlueDragon
import de.lhaider.yodo.feature.demons_souls.enemy.DirtyColossus
import de.lhaider.yodo.feature.demons_souls.enemy.DragonGod
import de.lhaider.yodo.feature.demons_souls.enemy.ExecutionerMiralda
import de.lhaider.yodo.feature.demons_souls.enemy.Flamelurker
import de.lhaider.yodo.feature.demons_souls.enemy.FoolsIdol
import de.lhaider.yodo.feature.demons_souls.enemy.GarlVinland
import de.lhaider.yodo.feature.demons_souls.enemy.Leechmonger
import de.lhaider.yodo.feature.demons_souls.enemy.LongBowOolan
import de.lhaider.yodo.feature.demons_souls.enemy.LordRydell
import de.lhaider.yodo.feature.demons_souls.enemy.MaidenAstraea
import de.lhaider.yodo.feature.demons_souls.enemy.Maneater
import de.lhaider.yodo.feature.demons_souls.enemy.MetasKnightOfTheLance
import de.lhaider.yodo.feature.demons_souls.enemy.OldHero
import de.lhaider.yodo.feature.demons_souls.enemy.OldKingAlant
import de.lhaider.yodo.feature.demons_souls.enemy.OldKingDoran
import de.lhaider.yodo.feature.demons_souls.enemy.OldMonk
import de.lhaider.yodo.feature.demons_souls.enemy.OstravaOfBoletaria
import de.lhaider.yodo.feature.demons_souls.enemy.Penetrator
import de.lhaider.yodo.feature.demons_souls.enemy.Phalanx
import de.lhaider.yodo.feature.demons_souls.enemy.PrimevalDemon
import de.lhaider.yodo.feature.demons_souls.enemy.RedDragon
import de.lhaider.yodo.feature.demons_souls.enemy.Satsuki
import de.lhaider.yodo.feature.demons_souls.enemy.ScirvirTheWanderer
import de.lhaider.yodo.feature.demons_souls.enemy.SelenVinland
import de.lhaider.yodo.feature.demons_souls.enemy.StormKing
import de.lhaider.yodo.feature.demons_souls.enemy.TowerKnight
import de.lhaider.yodo.feature.demons_souls.enemy.Vanguard
import de.lhaider.yodo.feature.demons_souls.enemy.VanguardDemon

sealed class DemonsSoulsLocation(
    locationId: String,
    override val enemies: List<Enemy>,
    override val name: UIText = UIText.Dynamic("Undefined")
) : Location {
    override val identifier = "des_$locationId"
}

data object ForlornOutpost : DemonsSoulsLocation(
    "forlorn_outpost",
    listOf(
        VanguardDemon
    ),
    UIText.Resource(R.string.des_forlorn_outpost)
)

data object BoletarianPalace : DemonsSoulsLocation(
    "boletarian_palace",
    listOf(
        Phalanx,
        TowerKnight,
        Penetrator,
        OldKingAlant,
        BlueDragon,
        RedDragon,
        OldKingDoran,
        PrimevalDemon,
        ExecutionerMiralda,
        MetasKnightOfTheLance,
        AlfredKnightOfTheTower,
        LongBowOolan,
        OstravaOfBoletaria
    ),
    UIText.Resource(R.string.des_boletarian_palace)
)

data object StonefangTunnel : DemonsSoulsLocation(
    "stonefang_tunnel",
    listOf(
        ArmorSpider,
        Flamelurker,
        DragonGod,
        PrimevalDemon,
        ScirvirTheWanderer
    ),
    UIText.Resource(R.string.des_stonefang_tunnel)
)

data object TowerOfLatria : DemonsSoulsLocation(
    "tower_of_latria",
    listOf(
        FoolsIdol,
        Maneater,
        OldMonk,
        PrimevalDemon,
        LordRydell
    ),
    UIText.Resource(R.string.des_tower_of_latria)
)

data object ShrineOfStorms : DemonsSoulsLocation(
    "shrine_of_storms",
    listOf(
        Adjucator,
        OldHero,
        StormKing,
        Vanguard,
        PrimevalDemon,
        Satsuki
    ),
    UIText.Resource(R.string.des_shrine_of_storms)
)

data object ValleyOfDefilement : DemonsSoulsLocation(
    "valley_of_defilement",
    listOf(
        Leechmonger,
        DirtyColossus,
        MaidenAstraea,
        PrimevalDemon,
        SelenVinland,
        GarlVinland
    ),
    UIText.Resource(R.string.des_valley_of_defilement)
)