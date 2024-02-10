package de.lhaider.yodo.dark_souls_3.location

import de.lhaider.yodo.R
import de.lhaider.yodo.dark_souls_3.enemy.DS3Boss
import de.lhaider.yodo.dark_souls_3.enemy.DS3Invader
import de.lhaider.yodo.ui.text.UIText

class RoadOfSacrifices : AbstractDS3Location(UIText.ResourceText(R.string.road_of_sacrifices), "road_of_sacrifices") {

    override val enemies = listOf(
        DS3Invader.YellowfingerHeysel,
        DS3Boss.CrystalSage
    )
}