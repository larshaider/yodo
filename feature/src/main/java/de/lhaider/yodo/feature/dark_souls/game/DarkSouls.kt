package de.lhaider.yodo.feature.dark_souls.game

import de.lhaider.yodo.common.ui_text.UIText
import de.lhaider.yodo.core.game.Game
import de.lhaider.yodo.core.location.Location
import de.lhaider.yodo.feature.R

class DarkSouls : Game {

    override val id = "dark_souls"

    override val name = UIText.Resource(R.string.dark_souls)

    override val locations = emptyList<Location>()
}