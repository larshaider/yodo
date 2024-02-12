package de.lhaider.yodo.dark_souls_3.enemy

import de.lhaider.yodo.domain.enemy.Boss

sealed class DS3Boss(enemyId: String) : Boss {
    override val identifier = "ds3_boss_$enemyId"
    override val pointsForKill = 5

    data object IudexGundyr : DS3Boss("iudex_gundyr")
    data object CurseRottedGreatwood : DS3Boss("curse_rotted_greatwood")
    data object CrystalSage : DS3Boss("crystal_sage")
    data object AbyssWatchers : DS3Boss("abyss_watchers")
    data object DeaconsOfTheDeep : DS3Boss("deacons_of_the_deep")
    data object HighLordWolnir : DS3Boss("high_lord_wolnir")
    data object OldDemonKing : DS3Boss("old_demon_king")
}