package de.lhaider.yodo.ui.extension

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import de.lhaider.yodo.R
import de.lhaider.yodo.dark_souls_3.enemy.DS3Boss
import de.lhaider.yodo.dark_souls_3.enemy.DS3Invader
import de.lhaider.yodo.dark_souls_3.enemy.DS3MiniBoss
import de.lhaider.yodo.dark_souls_3.game.DarkSouls3
import de.lhaider.yodo.dark_souls_3.location.DS3Location
import de.lhaider.yodo.domain.game.Game
import de.lhaider.yodo.tracking.domain.TrackedEnemy
import de.lhaider.yodo.tracking.domain.TrackedLocation

private const val DEFAULT_NAME = "UNDEFINED"

@Composable
fun TrackedEnemy.name(): String {
    return when (this.identifier) {
        DS3Boss.IudexGundyr.identifier -> stringResource(R.string.iudex_gundyr)
        DS3Boss.CurseRottedGreatwood.identifier -> stringResource(R.string.curse_rotted_greatwood)
        DS3Boss.CrystalSage.identifier -> stringResource(R.string.crystal_sage)
        DS3Boss.AbyssWatchers.identifier -> stringResource(R.string.abyss_watchers)
        DS3Boss.DeaconsOfTheDeep.identifier -> stringResource(R.string.deacons_of_the_deep)
        DS3Boss.HighLordWolnir.identifier -> stringResource(R.string.high_lord_wolnir)
        DS3Boss.OldDemonKing.identifier -> stringResource(R.string.old_demon_king)

        DS3Invader.HolyKnightHodrick.identifier -> stringResource(R.string.holy_knight_hodrick)
        DS3Invader.YellowfingerHeysel.identifier -> stringResource(R.string.yellowfinger_heysel)
        DS3Invader.LondorPaleShade.identifier -> stringResource(R.string.londor_pale_shade)
        DS3Invader.LongfingerKirk.identifier -> stringResource(R.string.longfinger_kirk)
        DS3Invader.KnightSlayerTsorig.identifier -> stringResource(R.string.knight_slayer_tsorig)

        DS3MiniBoss.RavenousCrystalLizard.identifier -> stringResource(R.string.ravenous_crystal_lizard)
        DS3MiniBoss.SwordMaster.identifier -> stringResource(R.string.sword_master)
        DS3MiniBoss.BorealOutriderKnight.identifier -> stringResource(R.string.boreal_outrider_knight)
        DS3MiniBoss.Demon.identifier -> stringResource(R.string.demon)
        DS3MiniBoss.StrayDemon.identifier -> stringResource(R.string.stray_demon)
        DS3MiniBoss.DeepAccursed.identifier -> stringResource(R.string.deep_accursed)
        DS3MiniBoss.CarthusSandworm.identifier -> stringResource(R.string.carthus_sandworm)

        else -> DEFAULT_NAME
    }
}

@Composable
fun TrackedLocation.name(): String {
    return when (this.identifier) {
        DS3Location.CemeteryOfAsh.identifier -> stringResource(R.string.cemetery_of_ash)
        DS3Location.UndeadSettlement.identifier -> stringResource(R.string.undead_settlement)
        DS3Location.RoadOfSacrifices.identifier -> stringResource(R.string.road_of_sacrifices)
        DS3Location.FarronKeep.identifier -> stringResource(R.string.farron_keep)
        DS3Location.CathedralOfTheDeep.identifier -> stringResource(R.string.cathedral_of_the_deep)
        DS3Location.CatacombsOfCarthus.identifier -> stringResource(R.string.catacombs_of_carthus)
        DS3Location.SmoulderingLake.identifier -> stringResource(R.string.smouldering_lake)

        else -> DEFAULT_NAME
    }
}