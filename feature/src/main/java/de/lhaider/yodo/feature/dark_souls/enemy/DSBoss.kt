package de.lhaider.yodo.feature.dark_souls.enemy

import de.lhaider.yodo.common.ui_text.UIText
import de.lhaider.yodo.core.enemy.Boss
import de.lhaider.yodo.feature.R

sealed class DSBoss(
    enemyId: String,
    override val name: UIText = UIText.Resource(R.string.undefined)
) : Boss {
    override val identifier = "ds_boss_$enemyId"
    override val pointsForKill = 5
}

data object ArtoriasTheAbysswalker : DSBoss("artorias_the_abysswalker", UIText.Resource(R.string.ds_artorias_the_abysswalker))
data object AsylumDemon : DSBoss("asylum_demon", UIText.Resource(R.string.ds_asylum_demon))
data object BedOfChaos : DSBoss("bed_of_chaos", UIText.Resource(R.string.ds_bed_of_chaos))
data object BellGargoyles : DSBoss("bell_gargoyles", UIText.Resource(R.string.ds_bell_gargoyles))
data object CapraDemon : DSBoss("capra_demon", UIText.Resource(R.string.ds_capra_demon))
data object CeaselessDischarge : DSBoss("ceaseless_discharge", UIText.Resource(R.string.ds_ceaseless_discharge))
data object CentipedeDemon : DSBoss("centipede_demon", UIText.Resource(R.string.ds_centipede_demon))
data object DemonFiresage : DSBoss("demon_firesage", UIText.Resource(R.string.ds_demon_firesage))
data object FourKings : DSBoss("four_kings", UIText.Resource(R.string.ds_four_kings))
data object GapingDragon : DSBoss("gaping_dragon", UIText.Resource(R.string.ds_gaping_dragon))
data object GwynLordOfCinder : DSBoss("gwyn_lord_of_cinder", UIText.Resource(R.string.ds_gwyn_lord_of_cinder))
data object DarkSunGwyndolin : DSBoss("dark_sun_gwyndolin", UIText.Resource(R.string.ds_dark_sun_gwyndolin))
data object IronGolem : DSBoss("iron_golem", UIText.Resource(R.string.ds_iron_golem))
data object BlackDragonKalameet : DSBoss("black_dragon_kalameet", UIText.Resource(R.string.ds_black_dragon_kalameet))
data object ManusFatherOfTheAbyss : DSBoss("manus_father_of_the_abyss", UIText.Resource(R.string.ds_manus_father_of_the_abyss))
data object MoonlightButterfly : DSBoss("moonlight_butterfly", UIText.Resource(R.string.ds_moonlight_butterfly))
data object GravelordNito : DSBoss("gravelord_nito", UIText.Resource(R.string.ds_gravelord_nito))
data object OrnsteinAndSmough : DSBoss("ornstein_and_smough", UIText.Resource(R.string.ds_ornstein_smough))
data object Pinwheel : DSBoss("pinwheel", UIText.Resource(R.string.ds_pinwheel))
data object CrossbreedPriscilla : DSBoss("crossbreed_priscilla", UIText.Resource(R.string.ds_crossbreed_priscilla))
data object ChaosWitchQuelaag : DSBoss("chaos_witch_quelaag", UIText.Resource(R.string.ds_chaos_witch_quelaag))
data object SanctuaryGuardian : DSBoss("sanctuary_guardian", UIText.Resource(R.string.ds_sanctuary_guardian))
data object SeathTheScaleless : DSBoss("seath_the_scaleless", UIText.Resource(R.string.ds_seath_the_scaleless))
data object GreatGreyWolfSif : DSBoss("great_grey_wolf_sif", UIText.Resource(R.string.ds_great_grey_wolf_sif))
data object StrayDemon : DSBoss("stray_demon", UIText.Resource(R.string.ds_stray_demon))
data object TaurusDemon : DSBoss("taurus_demon", UIText.Resource(R.string.ds_taurus_demon))