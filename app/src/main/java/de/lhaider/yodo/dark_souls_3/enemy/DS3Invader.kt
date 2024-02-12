package de.lhaider.yodo.dark_souls_3.enemy

import de.lhaider.yodo.domain.enemy.Invader

sealed class DS3Invader(enemyId: String) : Invader {
    override val identifier = "ds3_invader_$enemyId"
    override val pointsForKill = 3

    data object HolyKnightHodrick : DS3Invader("holy_knight_hodrick")
    data object YellowfingerHeysel : DS3Invader("yellowfinger_heysel")
    data object LondorPaleShade : DS3Invader("londor_pale_shade")
    data object LongfingerKirk : DS3Invader("longfinger_kirk")
    data object KnightSlayerTsorig : DS3Invader("knight_slayer_tsorig")
}