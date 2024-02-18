package de.lhaider.yodo.dark_souls_3.ui

import de.lhaider.yodo.R
import de.lhaider.yodo.dark_souls_3.enemy.DS3Boss.AbyssWatchers
import de.lhaider.yodo.dark_souls_3.enemy.DS3Boss.CrystalSage
import de.lhaider.yodo.dark_souls_3.enemy.DS3Boss.CurseRottedGreatwood
import de.lhaider.yodo.dark_souls_3.enemy.DS3Boss.DeaconsOfTheDeep
import de.lhaider.yodo.dark_souls_3.enemy.DS3Boss.HighLordWolnir
import de.lhaider.yodo.dark_souls_3.enemy.DS3Boss.IudexGundyr
import de.lhaider.yodo.dark_souls_3.enemy.DS3Boss.OldDemonKing
import de.lhaider.yodo.dark_souls_3.enemy.DS3Invader.HolyKnightHodrick
import de.lhaider.yodo.dark_souls_3.enemy.DS3Invader.KnightSlayerTsorig
import de.lhaider.yodo.dark_souls_3.enemy.DS3Invader.LondorPaleShade
import de.lhaider.yodo.dark_souls_3.enemy.DS3Invader.LongfingerKirk
import de.lhaider.yodo.dark_souls_3.enemy.DS3Invader.YellowfingerHeysel
import de.lhaider.yodo.dark_souls_3.enemy.DS3MiniBoss.BorealOutriderKnight
import de.lhaider.yodo.dark_souls_3.enemy.DS3MiniBoss.CarthusSandworm
import de.lhaider.yodo.dark_souls_3.enemy.DS3MiniBoss.DeepAccursed
import de.lhaider.yodo.dark_souls_3.enemy.DS3MiniBoss.Demon
import de.lhaider.yodo.dark_souls_3.enemy.DS3MiniBoss.RavenousCrystalLizard
import de.lhaider.yodo.dark_souls_3.enemy.DS3MiniBoss.StrayDemon
import de.lhaider.yodo.dark_souls_3.enemy.DS3MiniBoss.SwordMaster
import de.lhaider.yodo.dark_souls_3.location.DS3Location
import de.lhaider.yodo.domain.enemy.Enemy
import de.lhaider.yodo.domain.location.Location
import de.lhaider.yodo.ui.text.UIText

class DS3NameUtil {

    companion object {
        private const val DEFAULT_NAME = "Undefined"

        fun nameOf(enemy: Enemy): UIText {
            return when (enemy) {
                is IudexGundyr -> UIText.Resource(R.string.iudex_gundyr)
                is CurseRottedGreatwood -> UIText.Resource(R.string.curse_rotted_greatwood)
                is CrystalSage -> UIText.Resource(R.string.crystal_sage)
                is AbyssWatchers -> UIText.Resource(R.string.abyss_watchers)
                is DeaconsOfTheDeep -> UIText.Resource(R.string.deacons_of_the_deep)
                is HighLordWolnir -> UIText.Resource(R.string.high_lord_wolnir)
                is OldDemonKing -> UIText.Resource(R.string.old_demon_king)

                is HolyKnightHodrick -> UIText.Resource(R.string.holy_knight_hodrick)
                is YellowfingerHeysel -> UIText.Resource(R.string.yellowfinger_heysel)
                is LondorPaleShade -> UIText.Resource(R.string.londor_pale_shade)
                is LongfingerKirk -> UIText.Resource(R.string.longfinger_kirk)
                is KnightSlayerTsorig -> UIText.Resource(R.string.knight_slayer_tsorig)

                is RavenousCrystalLizard -> UIText.Resource(R.string.ravenous_crystal_lizard)
                is SwordMaster -> UIText.Resource(R.string.sword_master)
                is BorealOutriderKnight -> UIText.Resource(R.string.boreal_outrider_knight)
                is Demon -> UIText.Resource(R.string.demon)
                is StrayDemon -> UIText.Resource(R.string.stray_demon)
                is DeepAccursed -> UIText.Resource(R.string.deep_accursed)
                is CarthusSandworm -> UIText.Resource(R.string.carthus_sandworm)
                else -> UIText.Dynamic(DEFAULT_NAME)
            }
        }

        fun nameOf(location: Location): UIText {
            return when (location) {
                is DS3Location.CemeteryOfAsh -> UIText.Resource(R.string.cemetery_of_ash)
                is DS3Location.UndeadSettlement -> UIText.Resource(R.string.undead_settlement)
                is DS3Location.RoadOfSacrifices -> UIText.Resource(R.string.road_of_sacrifices)
                is DS3Location.FarronKeep -> UIText.Resource(R.string.farron_keep)
                is DS3Location.CathedralOfTheDeep -> UIText.Resource(R.string.cathedral_of_the_deep)
                is DS3Location.CatacombsOfCarthus -> UIText.Resource(R.string.catacombs_of_carthus)
                is DS3Location.SmoulderingLake -> UIText.Resource(R.string.smouldering_lake)
                else -> UIText.Dynamic(DEFAULT_NAME)
            }
        }
    }
}