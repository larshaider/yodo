package de.lhaider.yodo.feature.dark_souls3.enemy

import de.lhaider.yodo.core.enemy.Invader
import de.lhaider.yodo.core.ui_text.UIText
import de.lhaider.yodo.feature.R

sealed class DS3Invader(
    enemyId: String,
    override val name: UIText = UIText.Resource(R.string.undefined)
) : Invader {
    override val identifier = "ds3_invader_$enemyId"
    override val pointsForKill = 3
}

data object HolyKnightHodrick : DS3Invader("holy_knight_hodrick", UIText.Resource(R.string.holy_knight_hodrick))
data object YellowfingerHeysel : DS3Invader("yellowfinger_heysel", UIText.Resource(R.string.yellowfinger_heysel))
data object LondorPaleShade : DS3Invader("londor_pale_shade", UIText.Resource(R.string.londor_pale_shade))
data object LongfingerKirk : DS3Invader("longfinger_kirk", UIText.Resource(R.string.longfinger_kirk))
data object KnightSlayerTsorig : DS3Invader("knight_slayer_tsorig", UIText.Resource(R.string.knight_slayer_tsorig))
data object AlvaSeekerOfTheSpurned : DS3Invader("alva_seeker_of_the_spurned", UIText.Resource(R.string.alva_seeker_of_the_spurned))
data object CreightonTheWanderer : DS3Invader("creighton_the_wanderer", UIText.Resource(R.string.creighton_the_wanderer))
data object DaughterOfCrystalKriemhild : DS3Invader("daughter_of_crystal_kriemhild", UIText.Resource(R.string.daughter_of_crystal_kriemhild))
data object LividPyromancerDunnel : DS3Invader("livid_pyromancer_dunnel", UIText.Resource(R.string.livid_pyromancer_dunnel))
data object MoaningKnight : DS3Invader("moaning_knight", UIText.Resource(R.string.moaning_knight))
data object SilverKnightLedo : DS3Invader("silver_knight_ledo", UIText.Resource(R.string.silver_knight_ledo))