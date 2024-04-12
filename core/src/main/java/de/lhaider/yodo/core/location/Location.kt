package de.lhaider.yodo.core.location

import de.lhaider.yodo.core.enemy.Enemy
import de.lhaider.yodo.common.ui_text.UIText

interface Location {
    val identifier: String
    val enemies: List<Enemy>
    val name: de.lhaider.yodo.common.ui_text.UIText
}