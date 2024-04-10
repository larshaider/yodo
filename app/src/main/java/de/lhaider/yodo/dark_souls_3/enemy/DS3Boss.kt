package de.lhaider.yodo.dark_souls_3.enemy

import de.lhaider.yodo.R
import de.lhaider.yodo.domain.enemy.Boss
import de.lhaider.yodo.ui.text.UIText

sealed class DS3Boss(
    enemyId: String,
    override val name: UIText = UIText.Resource(R.string.undefined)
) : Boss {
    override val identifier = "ds3_boss_$enemyId"
    override val pointsForKill = 5
}

data object IudexGundyr : DS3Boss("iudex_gundyr", UIText.Resource(R.string.iudex_gundyr))
data object CurseRottedGreatwood : DS3Boss("curse_rotted_greatwood", UIText.Resource(R.string.curse_rotted_greatwood))
data object CrystalSage : DS3Boss("crystal_sage", UIText.Resource(R.string.crystal_sage))
data object AbyssWatchers : DS3Boss("abyss_watchers", UIText.Resource(R.string.abyss_watchers))
data object DeaconsOfTheDeep : DS3Boss("deacons_of_the_deep", UIText.Resource(R.string.deacons_of_the_deep))
data object HighLordWolnir : DS3Boss("high_lord_wolnir", UIText.Resource(R.string.high_lord_wolnir))
data object OldDemonKing : DS3Boss("old_demon_king", UIText.Resource(R.string.old_demon_king))
data object PontiffSulyvahn : DS3Boss("pontiff_sulyvahn", UIText.Resource(R.string.pontiff_sulyvahn))
data object YhormTheGiant : DS3Boss("yhorm_the_giant", UIText.Resource(R.string.yhorm_the_giant))
data object AldrichDevourerOfGods : DS3Boss("aldrich_devourer_of_gods", UIText.Resource(R.string.aldrich_devourer_of_gods))
data object DancerOfTheBorealValley : DS3Boss("dancer_of_the_boreal_valley", UIText.Resource(R.string.dancer_of_the_boreal_valley))
data object DragonslayerArmour : DS3Boss("dragonslayer_armour", UIText.Resource(R.string.dragonslayer_armour))
data object LothricYoungerPrince : DS3Boss("lothric_younger_prince", UIText.Resource(R.string.lothric_younger_prince))
data object OceirosTheConsumedKing : DS3Boss("oceiros_the_consumed_king", UIText.Resource(R.string.oceiros_the_consumed_king))
data object ChampionGundyr : DS3Boss("champion_gundyr", UIText.Resource(R.string.champion_gundyr))
data object AncientWyvern : DS3Boss("ancient_wyvern", UIText.Resource(R.string.ancient_wyvern))
data object NamelessKing : DS3Boss("nameless_king", UIText.Resource(R.string.nameless_king))
data object SoulOfCinder : DS3Boss("soul_of_cinder", UIText.Resource(R.string.soul_of_cinder))
data object SisterFriede : DS3Boss("sister_friede", UIText.Resource(R.string.sister_friede))
data object ChampionsGravetenderAndGreatwolf : DS3Boss("champions_gravetender_greatwolf", UIText.Resource(R.string.champions_gravetender_greatwolf))
data object DemonPrince : DS3Boss("demon_in_pain_demon_from_below", UIText.Resource(R.string.demon_in_pain_demon_from_below))
data object HalflightSpearOfTheChurch : DS3Boss("halflight_spear_of_the_church", UIText.Resource(R.string.halflight_spear_of_the_church))
data object DarkeaterMidir : DS3Boss("darkeater_midir", UIText.Resource(R.string.darkeater_midir))
data object SlaveKnightGael : DS3Boss("slave_knight_gael", UIText.Resource(R.string.slave_knight_gael))