package de.lhaider.yodo.domain.location

import de.lhaider.yodo.domain.enemy.Enemy
import de.lhaider.yodo.ui.text.UIText

interface Location {
    val identifier: String
    val name: UIText
    val enemies: List<Enemy>
}