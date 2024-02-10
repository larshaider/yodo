package de.lhaider.yodo.dark_souls_3.location

import de.lhaider.yodo.R
import de.lhaider.yodo.dark_souls_3.enemy.DS3Boss.OldDemonKing
import de.lhaider.yodo.dark_souls_3.enemy.DS3Invader.KnightSlayerTsorig
import de.lhaider.yodo.dark_souls_3.enemy.DS3MiniBoss.CarthusSandworm
import de.lhaider.yodo.ui.text.UIText

class SmoulderingLake : AbstractDS3Location("smouldering_lake") {
    override val name = UIText.ResourceText(R.string.smouldering_lake)

    override val enemies = listOf(
        KnightSlayerTsorig,
        CarthusSandworm,
        OldDemonKing
    )
}