package de.lhaider.yodo.enemy.data

import de.lhaider.yodo.R
import de.lhaider.yodo.enemy.domain.MiniBoss
import de.lhaider.yodo.ui.text.UIText

class DS3MiniBoss(override val name: UIText, enemyId: String) : MiniBoss {

    companion object {
        val RavenousCrystalLizard = DS3MiniBoss(UIText.ResourceText(R.string.ravenous_crystal_lizard), "ravenous_crystal_lizard")
    }

    override val identifier = "ds3_mini_boss_$enemyId"
}