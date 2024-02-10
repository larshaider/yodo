package de.lhaider.yodo.location.data

import de.lhaider.yodo.R
import de.lhaider.yodo.enemy.data.DS3Boss
import de.lhaider.yodo.enemy.data.DS3MiniBoss
import de.lhaider.yodo.ui.text.UIText

class CemeteryOfAsh : AbstractDS3Location(UIText.ResourceText(R.string.cemetery_of_ash), "cemetery_of_ash") {
    
    override val enemies = listOf(
        DS3MiniBoss.RavenousCrystalLizard,
        DS3Boss.IudexGundyr
    )
}