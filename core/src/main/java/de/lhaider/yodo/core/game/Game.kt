package de.lhaider.yodo.core.game

import de.lhaider.yodo.core.location.Location

interface Game {
    val id: String
    val locations: List<Location>
}