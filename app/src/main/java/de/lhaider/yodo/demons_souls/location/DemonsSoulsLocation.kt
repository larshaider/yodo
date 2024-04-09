package de.lhaider.yodo.demons_souls.location

import de.lhaider.yodo.demons_souls.enemy.*
import de.lhaider.yodo.domain.enemy.Enemy
import de.lhaider.yodo.domain.location.Location
import de.lhaider.yodo.ui.text.UIText

sealed class DemonsSoulsLocation(locationId: String, override val enemies: List<Enemy>) : Location {
    override val identifier = "demons_souls_$locationId"
    override val name = UIText.Dynamic("Undefined")
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