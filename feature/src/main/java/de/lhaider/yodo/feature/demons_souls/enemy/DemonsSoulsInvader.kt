package de.lhaider.yodo.feature.demons_souls.enemy

import de.lhaider.yodo.common.ui_text.UIText
import de.lhaider.yodo.core.enemy.Invader
import de.lhaider.yodo.feature.R

sealed class DemonsSoulsInvader(
    enemyId: String
) : Invader {
    override val identifier = "des_invader_$enemyId"
    override val pointsForKill = 3
    override val name = UIText.Resource(R.string.undefined)
}

data object ExecutionerMiralda : DemonsSoulsInvader("executioner_miralda")
data object MetasKnightOfTheLance : DemonsSoulsInvader("metas_knight_of_the_lance")
data object AlfredKnightOfTheTower : DemonsSoulsInvader("alfred_knight_of_the_tower")
data object LongBowOolan : DemonsSoulsInvader("long_bow_oolan")
data object OstravaOfBoletaria : DemonsSoulsInvader("ostrava_of_boletaria")
data object ScirvirTheWanderer : DemonsSoulsInvader("scirvir_the_wanderer")
data object LordRydell : DemonsSoulsInvader("lord_rydell")
data object Satsuki : DemonsSoulsInvader("satsuki")
data object SelenVinland : DemonsSoulsInvader("selen_vinland")
data object GarlVinland : DemonsSoulsInvader("garl_vinland")