package de.lhaider.yodo.enemy.data

import de.lhaider.yodo.R
import de.lhaider.yodo.enemy.domain.Boss
import de.lhaider.yodo.ui.text.UIText

class DS3Boss(override val name: UIText, enemyId: String) : Boss {

    companion object {
        val IudexGundyr = DS3Boss(UIText.ResourceText(R.string.iudex_gundyr), "iudex_gundyr")
    }

    override val identifier = "ds3_boss_$enemyId"
}