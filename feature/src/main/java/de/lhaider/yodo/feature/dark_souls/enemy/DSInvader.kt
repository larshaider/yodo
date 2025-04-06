package de.lhaider.yodo.feature.dark_souls.enemy

import de.lhaider.yodo.common.ui_text.UIText
import de.lhaider.yodo.core.enemy.Invader
import de.lhaider.yodo.feature.R

sealed class DSInvader(
    enemyId: String,
    override val name: UIText = UIText.Resource(R.string.undefined)
) : Invader {
    override val identifier = "ds_invader_$enemyId"
    override val pointsForKill = 3
}

data object KirkKnightOfThorns : DSInvader("kirk_knight_of_thorns", UIText.Resource(R.string.ds_kirk_knight_of_thorns))
data object ManeaterMildred : DSInvader("maneater_mildred", UIText.Resource(R.string.ds_maneater_mildred))
data object MarvelousChester : DSInvader("marvelous_chester", UIText.Resource(R.string.ds_marvelous_chester))
data object PaladinLeeroy : DSInvader("paladin_leeroy", UIText.Resource(R.string.ds_paladin_leeroy))
data object XanthousKingJeremiah : DSInvader("xanthous_king_jeremiah", UIText.Resource(R.string.ds_xanthous_king_jeremiah))
