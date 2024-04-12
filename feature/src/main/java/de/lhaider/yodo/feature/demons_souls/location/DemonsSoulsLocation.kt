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
    override val enemies: List<Enemy>
) : Location {
    override val identifier = "demons_souls_$locationId"
    override val name = UIText.Resource(R.string.undefined)
}

data object ForlornOutpost : DemonsSoulsLocation(
    "forlorn_outpost",
    listOf(
        VanguardDemon
    )
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
    )
)

data object StonefangTunnel : DemonsSoulsLocation(
    "stonefang_tunnel",
    listOf(
        ArmorSpider,
        Flamelurker,
        DragonGod,
        PrimevalDemon,
        ScirvirTheWanderer
    )
)

data object TowerOfLatria : DemonsSoulsLocation(
    "tower_of_latria",
    listOf(
        FoolsIdol,
        Maneater,
        OldMonk,
        PrimevalDemon,
        LordRydell
    )
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
    )
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
    )
)