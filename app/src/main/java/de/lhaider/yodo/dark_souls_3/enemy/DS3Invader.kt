package de.lhaider.yodo.dark_souls_3.enemy

import de.lhaider.yodo.R
import de.lhaider.yodo.domain.enemy.Invader
import de.lhaider.yodo.ui.text.UIText

sealed class DS3Invader(override val name: UIText, enemyId: String) : Invader {
    override val identifier = "ds3_invader_$enemyId"
    override val pointsForKill = 3

    data object HolyKnightHodrick : DS3Invader(UIText.ResourceText(R.string.holy_knight_hodrick), "holy_knight_hodrick")
    data object YellowfingerHeysel : DS3Invader(UIText.ResourceText(R.string.yellowfinger_heysel), "yellowfinger_heysel")
    data object LondorPaleShade : DS3Invader(UIText.ResourceText(R.string.londor_pale_shade), "londor_pale_shade")
    data object LongfingerKirk : DS3Invader(UIText.ResourceText(R.string.longfinger_kirk), "longfinger_kirk")
    data object KnightSlayerTsorig : DS3Invader(UIText.ResourceText(R.string.knight_slayer_tsorig), "knight_slayer_tsorig")
}