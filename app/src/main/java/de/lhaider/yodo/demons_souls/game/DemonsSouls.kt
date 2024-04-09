package de.lhaider.yodo.demons_souls.game

import de.lhaider.yodo.demons_souls.location.*
import de.lhaider.yodo.domain.game.Game

class DemonsSouls : Game {

    override val id = "demons_souls"

    override val locations = listOf(
        ForlornOutpost,
        BoletarianPalace,
        StonefangTunnel,
        TowerOfLatria,
        ShrineOfStorms,
        ValleyOfDefilement
    )
}