package de.lhaider.yodo.dark_souls_3.location

import de.lhaider.yodo.R
import de.lhaider.yodo.dark_souls_3.enemy.DS3Boss.CrystalSage
import de.lhaider.yodo.dark_souls_3.enemy.DS3Invader.YellowfingerHeysel
import de.lhaider.yodo.ui.text.UIText

class RoadOfSacrifices : AbstractDS3Location("road_of_sacrifices") {

    override val name = UIText.ResourceText(R.string.road_of_sacrifices)

    override val enemies = listOf(
        YellowfingerHeysel,
        CrystalSage
    )
}