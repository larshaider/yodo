package de.lhaider.yodo.dark_souls_3.location

import de.lhaider.yodo.R
import de.lhaider.yodo.dark_souls_3.enemy.DS3Boss.IudexGundyr
import de.lhaider.yodo.dark_souls_3.enemy.DS3MiniBoss.RavenousCrystalLizard
import de.lhaider.yodo.ui.text.UIText

class CemeteryOfAsh : AbstractDS3Location(UIText.ResourceText(R.string.cemetery_of_ash), "cemetery_of_ash") {

    override val enemies = listOf(
        RavenousCrystalLizard,
        IudexGundyr
    )
}