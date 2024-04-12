package de.lhaider.yodo.feature.demons_souls.game

import de.lhaider.yodo.core.game.Game
import de.lhaider.yodo.feature.demons_souls.location.BoletarianPalace
import de.lhaider.yodo.feature.demons_souls.location.ForlornOutpost
import de.lhaider.yodo.feature.demons_souls.location.ShrineOfStorms
import de.lhaider.yodo.feature.demons_souls.location.StonefangTunnel
import de.lhaider.yodo.feature.demons_souls.location.TowerOfLatria
import de.lhaider.yodo.feature.demons_souls.location.ValleyOfDefilement

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