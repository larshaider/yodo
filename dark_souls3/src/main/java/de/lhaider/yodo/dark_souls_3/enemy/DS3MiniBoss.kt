package de.lhaider.yodo.dark_souls_3.enemy

import de.lhaider.yodo.core.enemy.MiniBoss
import de.lhaider.yodo.core.ui_text.UIText
import de.lhaider.yodo.dark_souls_3.R

sealed class DS3MiniBoss(
    enemyId: String,
    override val name: UIText = UIText.Resource(R.string.undefined)
) : MiniBoss {
    override val identifier = "ds3_mini_boss_$enemyId"
    override val pointsForKill = 3
}

data class RavenousCrystalLizard(private val prefix: String = "") : DS3MiniBoss(prefix + "_ravenous_crystal_lizard", UIText.Resource(R.string.ravenous_crystal_lizard))
data object SwordMaster : DS3MiniBoss("sword_master", UIText.Resource(R.string.sword_master))
data object BorealOutriderKnight : DS3MiniBoss("boreal_outrider_knight", UIText.Resource(R.string.boreal_outrider_knight))
data object Demon : DS3MiniBoss("demon", UIText.Resource(R.string.demon))
data object StrayDemon : DS3MiniBoss("stray_demon", UIText.Resource(R.string.stray_demon))
data object DeepAccursed : DS3MiniBoss("deep_accursed", UIText.Resource(R.string.deep_accursed))
data object CarthusSandworm : DS3MiniBoss("carthus_sandworm", UIText.Resource(R.string.carthus_sandworm))
data class SulyvahnsBeast(private val prefix: String = "") : DS3MiniBoss(prefix + "_sulyvahns_beast", UIText.Resource(R.string.sulyvahns_beast))