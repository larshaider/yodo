package de.lhaider.yodo.dark_souls_3.location

import de.lhaider.yodo.R
import de.lhaider.yodo.dark_souls_3.enemy.DS3Boss
import de.lhaider.yodo.dark_souls_3.enemy.DS3Invader
import de.lhaider.yodo.dark_souls_3.enemy.DS3MiniBoss
import de.lhaider.yodo.ui.text.UIText

class FarronKeep : AbstractDS3Location(UIText.ResourceText(R.string.farron_keep), "farron_keep") {

    override val enemies = listOf(
        DS3Invader.LondorPaleShade,
        DS3Invader.YellowfingerHeysel,
        DS3MiniBoss.RavenousCrystalLizard,
        DS3MiniBoss.StrayDemon,
        DS3Boss.AbyssWatchers
    )
}