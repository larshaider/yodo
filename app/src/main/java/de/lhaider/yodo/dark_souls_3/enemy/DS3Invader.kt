package de.lhaider.yodo.enemy.data

import de.lhaider.yodo.R
import de.lhaider.yodo.enemy.domain.Invader
import de.lhaider.yodo.ui.text.UIText

sealed class DS3Invader(override val name: UIText, enemyId: String) : Invader {
    override val identifier = "ds3_invader_$enemyId"

    data object HolyKnightHodrick : DS3Invader(UIText.ResourceText(R.string.holy_knight_hodrick), "holy_knight_hodrick")
    data object YellowfingerHeysel : DS3Invader(UIText.ResourceText(R.string.yellowfinger_heysel), "yellowfinger_heysel")
    data object LondorPaleShade : DS3Invader(UIText.ResourceText(R.string.londor_pale_shade), "londor_pale_shade")
}