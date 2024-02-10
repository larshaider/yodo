package de.lhaider.yodo.dark_souls_3.location

import de.lhaider.yodo.R
import de.lhaider.yodo.dark_souls_3.enemy.DS3Boss.DeaconsOfTheDeep
import de.lhaider.yodo.dark_souls_3.enemy.DS3Invader.LongfingerKirk
import de.lhaider.yodo.dark_souls_3.enemy.DS3MiniBoss.DeepAccursed
import de.lhaider.yodo.dark_souls_3.enemy.DS3MiniBoss.RavenousCrystalLizard
import de.lhaider.yodo.ui.text.UIText

class CathedralOfTheDeep : AbstractDS3Location("cathedral_of_the_deep") {

    override val name = UIText.ResourceText(R.string.cathedral_of_the_deep)

    override val enemies = listOf(
        LongfingerKirk,
        RavenousCrystalLizard,
        DeepAccursed,
        DeaconsOfTheDeep
    )
}