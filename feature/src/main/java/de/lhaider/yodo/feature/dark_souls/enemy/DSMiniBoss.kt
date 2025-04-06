package de.lhaider.yodo.feature.dark_souls.enemy

import de.lhaider.yodo.common.ui_text.UIText
import de.lhaider.yodo.core.enemy.MiniBoss
import de.lhaider.yodo.feature.R

sealed class DSMiniBoss(
    enemyId: String,
    override val name: UIText = UIText.Resource(R.string.undefined)
) : MiniBoss {
    override val identifier = "ds_mini_boss_$enemyId"
    override val pointsForKill = 3
}

data object BerenikeKnight : DSMiniBoss("berenike_knight", UIText.Resource(R.string.ds_berenike_knight))
data object BlackHydra : DSMiniBoss("black_hydra", UIText.Resource(R.string.ds_black_hydra))
data object BlackKnightGreataxe : DSMiniBoss("black_knight_greataxe", UIText.Resource(R.string.ds_black_knight_greataxe))
data object BlackKnightGreatsword : DSMiniBoss("black_knight_greatsword", UIText.Resource(R.string.ds_black_knight_greatsword))
data object BlackKnightHalberd : DSMiniBoss("black_knight_halberd", UIText.Resource(R.string.ds_black_knight_halberd))
data class BlackKnightSword(private val prefix: String = "") : DSMiniBoss("${prefix}_black_knight_sword", UIText.Resource(R.string.ds_black_knight_sword))
data class Butcher(private val prefix: String = "") : DSMiniBoss("${prefix}_butcher", UIText.Resource(R.string.ds_butcher))
data class Channeler(private val prefix: String = "") : DSMiniBoss("${prefix}_channeler", UIText.Resource(R.string.ds_channeler))
data class FangBoar(private val prefix: String = "") : DSMiniBoss("${prefix}_fang_boar", UIText.Resource(R.string.ds_fang_boar))
data class GiantCat(private val prefix: String = "") : DSMiniBoss("${prefix}_giant_cat", UIText.Resource(R.string.ds_giant_cat))
data object GiantRat : DSMiniBoss("giant_rat", UIText.Resource(R.string.ds_giant_rat))
data class GoldenCrystalGolem(private val prefix: String = "") : DSMiniBoss("${prefix}_golden_crystal_golem", UIText.Resource(R.string.ds_golden_crystal_golem))
data object HavelTheRock : DSMiniBoss("havel_the_rock", UIText.Resource(R.string.ds_havel_the_rock))
data object HellkiteWyvern : DSMiniBoss("hellkite_wyvern", UIText.Resource(R.string.ds_hellkite_wyvern))
data object Hydra : DSMiniBoss("hydra", UIText.Resource(R.string.ds_hydra))
data class MassOfSouls(private val prefix: String = "") : DSMiniBoss("${prefix}_mass_of_souls", UIText.Resource(R.string.ds_mass_of_souls))
data object RichardTheArcher : DSMiniBoss("richard_the_archer", UIText.Resource(R.string.ds_ricard_the_archer))
data class TitaniteDemon(private val prefix: String = "") : DSMiniBoss("${prefix}_titanite_demon", UIText.Resource(R.string.ds_titanite_demon))
data object UndeadDragon : DSMiniBoss("undead_dragon", UIText.Resource(R.string.ds_undead_dragon))
data object ParasiticWallHugger : DSMiniBoss("parasitic_wall_hugger", UIText.Resource(R.string.ds_parasitic_wall_hugger))