package de.lhaider.yodo.core.enemy

import de.lhaider.yodo.core.ui_text.UIText

interface Enemy {
    val identifier: String
    val pointsForKill: Int
    val name: UIText
}