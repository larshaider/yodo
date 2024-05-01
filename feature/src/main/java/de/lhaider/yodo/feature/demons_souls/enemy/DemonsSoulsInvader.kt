package de.lhaider.yodo.feature.demons_souls.enemy

import de.lhaider.yodo.common.ui_text.UIText
import de.lhaider.yodo.core.enemy.Invader
import de.lhaider.yodo.feature.R

sealed class DemonsSoulsInvader(
    enemyId: String,
    override val name: UIText = UIText.Resource(R.string.undefined)
) : Invader {
    override val identifier = "des_invader_$enemyId"
    override val pointsForKill = 3
}

data object ExecutionerMiralda : DemonsSoulsInvader("executioner_miralda", UIText.Resource(R.string.des_executioner_miralda))
data object MetasKnightOfTheLance : DemonsSoulsInvader("metas_knight_of_the_lance", UIText.Resource(R.string.des_metas_knight_of_the_lance))
data object AlfredKnightOfTheTower : DemonsSoulsInvader("alfred_knight_of_the_tower", UIText.Resource(R.string.des_alfred_knight_of_the_tower))
data object LongBowOolan : DemonsSoulsInvader("long_bow_oolan", UIText.Resource(R.string.des_long_bow_oolan))
data object OstravaOfBoletaria : DemonsSoulsInvader("ostrava_of_boletaria", UIText.Resource(R.string.des_ostrava_of_boletaria))
data object ScirvirTheWanderer : DemonsSoulsInvader("scirvir_the_wanderer", UIText.Resource(R.string.des_scirvir_the_wanderer))
data object LordRydell : DemonsSoulsInvader("lord_rydell", UIText.Resource(R.string.des_lord_rydell))
data object Satsuki : DemonsSoulsInvader("satsuki", UIText.Resource(R.string.des_satsuki))
data object SelenVinland : DemonsSoulsInvader("selen_vinland", UIText.Resource(R.string.des_selen_vinland))
data object GarlVinland : DemonsSoulsInvader("garl_vinland", UIText.Resource(R.string.des_garl_vinland))