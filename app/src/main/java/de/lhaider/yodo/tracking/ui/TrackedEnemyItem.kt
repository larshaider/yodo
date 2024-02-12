package de.lhaider.yodo.tracking.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import de.lhaider.yodo.tracking.domain.TrackedEnemy
import de.lhaider.yodo.tracking.domain.isKilled

@Composable
fun TrackedEnemyItem(
    tracked: TrackedEnemy,
    onClick: () -> Unit
) {
    Card(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp)
    ) {
        Row(modifier = Modifier.fillMaxSize()) {
            Text(text = tracked.enemy.name.asString())
            Checkbox(checked = tracked.isKilled(), onCheckedChange = { onClick() })
        }
    }
}