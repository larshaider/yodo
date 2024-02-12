package de.lhaider.yodo.tracking.ui

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import de.lhaider.yodo.tracking.domain.TrackedEnemy
import de.lhaider.yodo.tracking.domain.isKilled

@Composable
fun TrackedEnemyItem(
    enemy: TrackedEnemy,
    onClick: () -> Unit
) {
    val state = if (enemy.isKilled()) " is killed." else " is alive."
    Text(
        modifier = Modifier.clickable(onClick = onClick),
        text = enemy.enemy.name.asString() + state
    )
}