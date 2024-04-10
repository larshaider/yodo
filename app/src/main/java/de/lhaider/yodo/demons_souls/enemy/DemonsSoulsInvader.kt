package de.lhaider.yodo.demons_souls.enemy

import de.lhaider.yodo.R
import de.lhaider.yodo.domain.enemy.Invader
import de.lhaider.yodo.ui.text.UIText

sealed class DemonsSoulsInvader(enemyId: String) : Invader {
    override val identifier = "demons_souls_invader_$enemyId"
    override val pointsForKill = 3
    override val name: UIText = UIText.Resource(R.string.undefined)
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