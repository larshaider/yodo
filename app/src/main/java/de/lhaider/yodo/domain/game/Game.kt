package de.lhaider.yodo.domain.game

import de.lhaider.yodo.domain.location.Location

interface Game {
    val id: String
    val locations: List<Location>
}