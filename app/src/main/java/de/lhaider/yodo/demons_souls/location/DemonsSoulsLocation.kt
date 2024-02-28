package de.lhaider.yodo.demons_souls.location

import de.lhaider.yodo.demons_souls.enemy.DemonsSoulsBoss.Adjucator
import de.lhaider.yodo.demons_souls.enemy.DemonsSoulsBoss.ArmorSpider
import de.lhaider.yodo.demons_souls.enemy.DemonsSoulsBoss.DirtyColossus
import de.lhaider.yodo.demons_souls.enemy.DemonsSoulsBoss.DragonGod
import de.lhaider.yodo.demons_souls.enemy.DemonsSoulsBoss.Flamelurker
import de.lhaider.yodo.demons_souls.enemy.DemonsSoulsBoss.FoolsIdol
import de.lhaider.yodo.demons_souls.enemy.DemonsSoulsBoss.Leechmonger
import de.lhaider.yodo.demons_souls.enemy.DemonsSoulsBoss.MaidenAstraea
import de.lhaider.yodo.demons_souls.enemy.DemonsSoulsBoss.Maneater
import de.lhaider.yodo.demons_souls.enemy.DemonsSoulsBoss.OldHero
import de.lhaider.yodo.demons_souls.enemy.DemonsSoulsBoss.OldKingAlant
import de.lhaider.yodo.demons_souls.enemy.DemonsSoulsBoss.OldMonk
import de.lhaider.yodo.demons_souls.enemy.DemonsSoulsBoss.Penetrator
import de.lhaider.yodo.demons_souls.enemy.DemonsSoulsBoss.Phalanx
import de.lhaider.yodo.demons_souls.enemy.DemonsSoulsBoss.StormKing
import de.lhaider.yodo.demons_souls.enemy.DemonsSoulsBoss.TowerKnight
import de.lhaider.yodo.demons_souls.enemy.DemonsSoulsBoss.VanguardDemon
import de.lhaider.yodo.demons_souls.enemy.DemonsSoulsInvader.AlfredKnightOfTheTower
import de.lhaider.yodo.demons_souls.enemy.DemonsSoulsInvader.ExecutionerMiralda
import de.lhaider.yodo.demons_souls.enemy.DemonsSoulsInvader.GarlVinland
import de.lhaider.yodo.demons_souls.enemy.DemonsSoulsInvader.LongBowOolan
import de.lhaider.yodo.demons_souls.enemy.DemonsSoulsInvader.LordRydell
import de.lhaider.yodo.demons_souls.enemy.DemonsSoulsInvader.MetasKnightOfTheLance
import de.lhaider.yodo.demons_souls.enemy.DemonsSoulsInvader.OstravaOfBoletaria
import de.lhaider.yodo.demons_souls.enemy.DemonsSoulsInvader.Satsuki
import de.lhaider.yodo.demons_souls.enemy.DemonsSoulsInvader.ScirvirTheWanderer
import de.lhaider.yodo.demons_souls.enemy.DemonsSoulsInvader.SelenVinland
import de.lhaider.yodo.demons_souls.enemy.DemonsSoulsMiniBoss.BlueDragon
import de.lhaider.yodo.demons_souls.enemy.DemonsSoulsMiniBoss.OldKingDoran
import de.lhaider.yodo.demons_souls.enemy.DemonsSoulsMiniBoss.PrimevalDemon
import de.lhaider.yodo.demons_souls.enemy.DemonsSoulsMiniBoss.RedDragon
import de.lhaider.yodo.demons_souls.enemy.DemonsSoulsMiniBoss.Vanguard
import de.lhaider.yodo.domain.enemy.Enemy
import de.lhaider.yodo.domain.location.Location

sealed class DemonsSoulsLocation(locationId: String, override val enemies: List<Enemy>) : Location {
    override val identifier = "demons_souls_$locationId"

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
}