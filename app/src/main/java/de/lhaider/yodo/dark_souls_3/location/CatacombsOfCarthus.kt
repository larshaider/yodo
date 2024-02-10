package de.lhaider.yodo.dark_souls_3.location

import de.lhaider.yodo.R
import de.lhaider.yodo.dark_souls_3.enemy.DS3Boss.HighLordWolnir
import de.lhaider.yodo.dark_souls_3.enemy.DS3Invader.KnightSlayerTsorig
import de.lhaider.yodo.dark_souls_3.enemy.DS3MiniBoss.Demon
import de.lhaider.yodo.ui.text.UIText

class CatacombsOfCarthus : AbstractDS3Location("catacombs_of_carthus") {
    override val name = UIText.ResourceText(R.string.catacombs_of_carthus)

    override val enemies = listOf(
        KnightSlayerTsorig,
        Demon,
        HighLordWolnir
    )
}