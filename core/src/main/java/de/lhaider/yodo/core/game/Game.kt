package de.lhaider.yodo.core.game

import de.lhaider.yodo.common.ui_text.UIText
import de.lhaider.yodo.core.location.Location

interface Game {
    val id: String
    val name: UIText
    val locations: List<Location>
}