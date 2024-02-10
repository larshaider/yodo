package de.lhaider.yodo.dark_souls_3.location

import de.lhaider.yodo.R
import de.lhaider.yodo.dark_souls_3.enemy.DS3Boss.CurseRottedGreatwood
import de.lhaider.yodo.dark_souls_3.enemy.DS3Invader.HolyKnightHodrick
import de.lhaider.yodo.dark_souls_3.enemy.DS3MiniBoss.BorealOutriderKnight
import de.lhaider.yodo.dark_souls_3.enemy.DS3MiniBoss.Demon
import de.lhaider.yodo.ui.text.UIText

class UndeadSettlement : AbstractDS3Location("undead_settlement") {

    override val name = UIText.ResourceText(R.string.undead_settlement)

    override val enemies = listOf(
        HolyKnightHodrick,
        BorealOutriderKnight,
        Demon,
        CurseRottedGreatwood
    )
}