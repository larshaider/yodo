package de.lhaider.yodo.enemy.data

import de.lhaider.yodo.enemy.domain.Invader
import de.lhaider.yodo.ui.text.UIText

class DS3Invader(override val name: UIText, enemyId: String) : Invader {
    override val identifier = "ds3_invader_$enemyId"
}