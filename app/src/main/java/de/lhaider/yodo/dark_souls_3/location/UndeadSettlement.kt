package de.lhaider.yodo.dark_souls_3.location

import de.lhaider.yodo.R
import de.lhaider.yodo.dark_souls_3.enemy.DS3Boss
import de.lhaider.yodo.dark_souls_3.enemy.DS3Invader
import de.lhaider.yodo.dark_souls_3.enemy.DS3MiniBoss
import de.lhaider.yodo.ui.text.UIText

class UndeadSettlement : AbstractDS3Location(UIText.ResourceText(R.string.undead_settlement), "undead_settlement") {

    override val enemies = listOf(
        DS3Invader.HolyKnightHodrick,
        DS3MiniBoss.BorealOutriderKnight,
        DS3MiniBoss.Demon,
        DS3Boss.CurseRottedGreatwood
    )
}