package de.lhaider.yodo.dark_souls_3.enemy

import de.lhaider.yodo.R
import de.lhaider.yodo.domain.enemy.Invader
import de.lhaider.yodo.ui.text.UIText

sealed class DS3Invader(
    enemyId: String,
    override val name: UIText = UIText.Dynamic("Undefined")
) : Invader {
    override val identifier = "ds3_invader_$enemyId"
    override val pointsForKill = 3
}

data object HolyKnightHodrick : DS3Invader("holy_knight_hodrick", UIText.Resource(R.string.holy_knight_hodrick))
data object YellowfingerHeysel : DS3Invader("yellowfinger_heysel", UIText.Resource(R.string.yellowfinger_heysel))
data object LondorPaleShade : DS3Invader("londor_pale_shade", UIText.Resource(R.string.londor_pale_shade))
data object LongfingerKirk : DS3Invader("longfinger_kirk", UIText.Resource(R.string.longfinger_kirk))
data object KnightSlayerTsorig : DS3Invader("knight_slayer_tsorig", UIText.Resource(R.string.knight_slayer_tsorig))
data object AlvaSeekerOfTheSpurned : DS3Invader("alva_seeker_of_the_spurned")
data object CreightonTheWanderer : DS3Invader("creighton_the_wanderer")
data object DaughterOfCrystalKriemhild : DS3Invader("daughter_of_crystal_kriemhild")
data object LividPyromancerDunnel : DS3Invader("livid_pyromancer_dunnel")
data object MoaningKnight : DS3Invader("moaning_knight")
data object SilverKnightLedo : DS3Invader("silver_knight_ledo")