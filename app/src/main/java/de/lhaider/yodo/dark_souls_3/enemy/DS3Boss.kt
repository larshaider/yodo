package de.lhaider.yodo.dark_souls_3.enemy

import de.lhaider.yodo.R
import de.lhaider.yodo.domain.enemy.Boss
import de.lhaider.yodo.ui.text.UIText

sealed class DS3Boss(override val name: UIText, enemyId: String) : Boss {
    override val identifier = "ds3_boss_$enemyId"

    data object IudexGundyr : DS3Boss(UIText.ResourceText(R.string.iudex_gundyr), "iudex_gundyr")
    data object CurseRottedGreatwood : DS3Boss(UIText.ResourceText(R.string.curse_rotted_greatwood), "curse_rotted_greatwood")
    data object CrystalSage : DS3Boss(UIText.ResourceText(R.string.crystal_sage), "crystal_sage")
    data object AbyssWatchers : DS3Boss(UIText.ResourceText(R.string.abyss_watchers), "abyss_watchers")
    data object DeaconsOfTheDeep : DS3Boss(UIText.ResourceText(R.string.deacons_of_the_deep), "deacons_of_the_deep")
    data object HighLordWolnir : DS3Boss(UIText.ResourceText(R.string.high_lord_wolnir), "high_lord_wolnir")
    data object OldDemonKing : DS3Boss(UIText.ResourceText(R.string.old_demon_king), "old_demon_king")
}