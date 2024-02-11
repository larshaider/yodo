package de.lhaider.yodo.domain.enemy

import de.lhaider.yodo.ui.text.UIText

interface Enemy {
    val identifier: String
    val name: UIText
    val pointsForKill: Int
}