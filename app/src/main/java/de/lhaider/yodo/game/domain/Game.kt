package de.lhaider.yodo.game.domain

import de.lhaider.yodo.location.domain.Location

interface Game {
    val locations: List<Location>
}