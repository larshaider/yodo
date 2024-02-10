package de.lhaider.yodo.enemy.domain

import de.lhaider.yodo.ui.text.UIText

interface Enemy {
    val identifier: String
    val name: UIText
}