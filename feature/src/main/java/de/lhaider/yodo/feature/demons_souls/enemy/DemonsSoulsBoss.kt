package de.lhaider.yodo.feature.demons_souls.enemy

import de.lhaider.yodo.common.ui_text.UIText
import de.lhaider.yodo.core.enemy.Boss
import de.lhaider.yodo.feature.R

sealed class DemonsSoulsBoss(
    enemyId: String,
    override val name: UIText = UIText.Resource(R.string.undefined)
) : Boss {
    override val identifier = "des_boss_$enemyId"
    override val pointsForKill = 5
}

data object VanguardDemon : DemonsSoulsBoss("vanguard_demon", UIText.Resource(R.string.des_vanguard_demon))
data object Phalanx : DemonsSoulsBoss("phalanx", UIText.Resource(R.string.des_phalanx))
data object TowerKnight : DemonsSoulsBoss("tower_knight", UIText.Resource(R.string.des_tower_knight))
data object Penetrator : DemonsSoulsBoss("penetrator", UIText.Resource(R.string.des_penetrator))
data object OldKingAlant : DemonsSoulsBoss("old_king_alant", UIText.Resource(R.string.des_old_king_alant))
data object ArmorSpider : DemonsSoulsBoss("armor_spider", UIText.Resource(R.string.des_armor_spider))
data object Flamelurker : DemonsSoulsBoss("flamelurker", UIText.Resource(R.string.des_flamelurker))
data object DragonGod : DemonsSoulsBoss("dragon_god", UIText.Resource(R.string.des_dragon_god))
data object FoolsIdol : DemonsSoulsBoss("fools_idol", UIText.Resource(R.string.des_fools_idol))
data object Maneater : DemonsSoulsBoss("maneater", UIText.Resource(R.string.des_maneater))
data object OldMonk : DemonsSoulsBoss("old_monk", UIText.Resource(R.string.des_old_monk))
data object Adjucator : DemonsSoulsBoss("adjucator", UIText.Resource(R.string.des_adjucator))
data object OldHero : DemonsSoulsBoss("old_hero", UIText.Resource(R.string.des_old_hero))
data object StormKing : DemonsSoulsBoss("storm_king", UIText.Resource(R.string.des_storm_king))
data object Leechmonger : DemonsSoulsBoss("leechmonger", UIText.Resource(R.string.des_leechmonger))
data object DirtyColossus : DemonsSoulsBoss("dirty_colossus", UIText.Resource(R.string.des_dirty_colossus))
data object MaidenAstraea : DemonsSoulsBoss("maiden_astraea", UIText.Resource(R.string.des_maiden_astraea))