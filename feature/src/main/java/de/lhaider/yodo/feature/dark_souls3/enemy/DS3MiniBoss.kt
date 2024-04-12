package de.lhaider.yodo.feature.dark_souls3.enemy

import de.lhaider.yodo.core.enemy.MiniBoss
import de.lhaider.yodo.common.ui_text.UIText
import de.lhaider.yodo.feature.R

sealed class DS3MiniBoss(
    enemyId: String,
    override val name: de.lhaider.yodo.common.ui_text.UIText = de.lhaider.yodo.common.ui_text.UIText.Resource(R.string.undefined)
) : MiniBoss {
    override val identifier = "ds3_mini_boss_$enemyId"
    override val pointsForKill = 3
}

data class RavenousCrystalLizard(private val prefix: String = "") : DS3MiniBoss(prefix + "_ravenous_crystal_lizard", de.lhaider.yodo.common.ui_text.UIText.Resource(R.string.ravenous_crystal_lizard))
data object SwordMaster : DS3MiniBoss("sword_master", de.lhaider.yodo.common.ui_text.UIText.Resource(R.string.sword_master))
data object BorealOutriderKnight : DS3MiniBoss("boreal_outrider_knight", de.lhaider.yodo.common.ui_text.UIText.Resource(R.string.boreal_outrider_knight))
data object Demon : DS3MiniBoss("demon", de.lhaider.yodo.common.ui_text.UIText.Resource(R.string.demon))
data object StrayDemon : DS3MiniBoss("stray_demon", de.lhaider.yodo.common.ui_text.UIText.Resource(R.string.stray_demon))
data object DeepAccursed : DS3MiniBoss("deep_accursed", de.lhaider.yodo.common.ui_text.UIText.Resource(R.string.deep_accursed))
data object CarthusSandworm : DS3MiniBoss("carthus_sandworm", de.lhaider.yodo.common.ui_text.UIText.Resource(R.string.carthus_sandworm))
data class SulyvahnsBeast(private val prefix: String = "") : DS3MiniBoss(prefix + "_sulyvahns_beast", de.lhaider.yodo.common.ui_text.UIText.Resource(R.string.sulyvahns_beast))