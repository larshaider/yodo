package de.lhaider.yodo.dark_souls_3.enemy

import de.lhaider.yodo.R
import de.lhaider.yodo.enemy.domain.MiniBoss
import de.lhaider.yodo.ui.text.UIText

sealed class DS3MiniBoss(override val name: UIText, enemyId: String) : MiniBoss {
    override val identifier = "ds3_mini_boss_$enemyId"

    data object RavenousCrystalLizard : DS3MiniBoss(UIText.ResourceText(R.string.ravenous_crystal_lizard), "ravenous_crystal_lizard")
    data object BorealOutriderKnight : DS3MiniBoss(UIText.ResourceText(R.string.boreal_outrider_knight), "boreal_outrider_knight")
    data object Demon : DS3MiniBoss(UIText.ResourceText(R.string.demon), "demon")
    data object StrayDemon : DS3MiniBoss(UIText.ResourceText(R.string.stray_demon), "stray_demon")
}