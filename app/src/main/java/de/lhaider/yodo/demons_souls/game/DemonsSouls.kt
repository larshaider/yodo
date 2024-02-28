package de.lhaider.yodo.demons_souls.game

import de.lhaider.yodo.demons_souls.location.DemonsSoulsLocation.BoletarianPalace
import de.lhaider.yodo.demons_souls.location.DemonsSoulsLocation.ForlornOutpost
import de.lhaider.yodo.demons_souls.location.DemonsSoulsLocation.ShrineOfStorms
import de.lhaider.yodo.demons_souls.location.DemonsSoulsLocation.StonefangTunnel
import de.lhaider.yodo.demons_souls.location.DemonsSoulsLocation.TowerOfLatria
import de.lhaider.yodo.demons_souls.location.DemonsSoulsLocation.ValleyOfDefilement
import de.lhaider.yodo.domain.game.Game

class DemonsSouls : Game {

    override val locations = listOf(
        ForlornOutpost,
        BoletarianPalace,
        StonefangTunnel,
        TowerOfLatria,
        ShrineOfStorms,
        ValleyOfDefilement
    )
}