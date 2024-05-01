package de.lhaider.yodo.feature.demons_souls.enemy

import de.lhaider.yodo.common.ui_text.UIText
import de.lhaider.yodo.core.enemy.MiniBoss
import de.lhaider.yodo.feature.R

sealed class DemonsSoulsMiniBoss(
    enemyId: String,
    override val name: UIText = UIText.Resource(R.string.undefined)
) : MiniBoss {
    override val identifier = "des_mini_boss_$enemyId"
    override val pointsForKill = 3
}

data object BlueDragon : DemonsSoulsMiniBoss("blue_dragon", UIText.Resource(R.string.des_blue_dragon))
data object RedDragon : DemonsSoulsMiniBoss("red_dragon", UIText.Resource(R.string.des_red_dragon))
data object Vanguard : DemonsSoulsMiniBoss("vanguard", UIText.Resource(R.string.des_vanguard))
data object OldKingDoran : DemonsSoulsMiniBoss("old_king_doran", UIText.Resource(R.string.des_old_king_doran))
data object PrimevalDemon : DemonsSoulsMiniBoss("primeval_demon", UIText.Resource(R.string.des_primeval_demon))