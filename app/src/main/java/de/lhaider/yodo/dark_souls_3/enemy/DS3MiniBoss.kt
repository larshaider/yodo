package de.lhaider.yodo.dark_souls_3.enemy

import de.lhaider.yodo.domain.enemy.MiniBoss

sealed class DS3MiniBoss(enemyId: String) : MiniBoss {
    override val identifier = "ds3_mini_boss_$enemyId"
    override val pointsForKill = 3

    data class RavenousCrystalLizard(private val prefix: String = "") : DS3MiniBoss(prefix + "_ravenous_crystal_lizard")
    data object SwordMaster : DS3MiniBoss("sword_master")
    data object BorealOutriderKnight : DS3MiniBoss("boreal_outrider_knight")
    data object Demon : DS3MiniBoss("demon")
    data object StrayDemon : DS3MiniBoss("stray_demon")
    data object DeepAccursed : DS3MiniBoss("deep_accursed")
    data object CarthusSandworm : DS3MiniBoss("carthus_sandworm")
    data class SulyvahnsBeast(private val prefix: String = "") : DS3MiniBoss(prefix + "_sulyvahns_beast")
}