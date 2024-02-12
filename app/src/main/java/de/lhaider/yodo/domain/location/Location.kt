package de.lhaider.yodo.domain.location

import de.lhaider.yodo.domain.enemy.Enemy

interface Location {
    val identifier: String
    val enemies: List<Enemy>
}