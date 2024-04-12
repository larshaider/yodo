package de.lhaider.yodo.feature.demons_souls.enemy

import de.lhaider.yodo.common.ui_text.UIText
import de.lhaider.yodo.core.enemy.Boss
import de.lhaider.yodo.feature.R

sealed class DemonsSoulsBoss(
    enemyId: String
) : Boss {
    override val identifier = "demons_souls_boss_$enemyId"
    override val pointsForKill = 5
    override val name = UIText.Resource(R.string.undefined)
}

data object VanguardDemon : DemonsSoulsBoss("vanguard_demon")
data object Phalanx : DemonsSoulsBoss("phalanx")
data object TowerKnight : DemonsSoulsBoss("tower_knight")
data object Penetrator : DemonsSoulsBoss("penetrator")
data object OldKingAlant : DemonsSoulsBoss("old_king_alant")
data object ArmorSpider : DemonsSoulsBoss("armor_spider")
data object Flamelurker : DemonsSoulsBoss("flamelurker")
data object DragonGod : DemonsSoulsBoss("dragon_god")
data object FoolsIdol : DemonsSoulsBoss("fools_idol")
data object Maneater : DemonsSoulsBoss("maneater")
data object OldMonk : DemonsSoulsBoss("old_monk")
data object Adjucator : DemonsSoulsBoss("adjucator")
data object OldHero : DemonsSoulsBoss("old_hero")
data object StormKing : DemonsSoulsBoss("storm_king")
data object Leechmonger : DemonsSoulsBoss("leechmonger")
data object DirtyColossus : DemonsSoulsBoss("dirty_colossus")
data object MaidenAstraea : DemonsSoulsBoss("maiden_astraea")