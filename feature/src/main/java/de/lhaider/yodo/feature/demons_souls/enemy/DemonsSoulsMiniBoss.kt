package de.lhaider.yodo.feature.demons_souls.enemy

import de.lhaider.yodo.common.ui_text.UIText
import de.lhaider.yodo.core.enemy.MiniBoss
import de.lhaider.yodo.feature.R

sealed class DemonsSoulsMiniBoss(
    enemyId: String
) : MiniBoss {
    override val identifier = "demons_souls_mini_boss_$enemyId"
    override val pointsForKill = 3
    override val name = UIText.Resource(R.string.undefined)
}

data object BlueDragon : DemonsSoulsMiniBoss("blue_dragon")
data object RedDragon : DemonsSoulsMiniBoss("red_dragon")
data object Vanguard : DemonsSoulsMiniBoss("vanguard")
data object OldKingDoran : DemonsSoulsMiniBoss("old_king_doran")
data object PrimevalDemon : DemonsSoulsMiniBoss("primeval_demon")