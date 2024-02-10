package de.lhaider.yodo.location.domain

import de.lhaider.yodo.enemy.domain.Enemy
import de.lhaider.yodo.ui.text.UIText

interface Location {
    val identifier: String
    val name: UIText
    val enemies: List<Enemy>
}