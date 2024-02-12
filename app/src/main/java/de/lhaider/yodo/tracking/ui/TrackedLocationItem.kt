package de.lhaider.yodo.tracking.ui

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import de.lhaider.yodo.tracking.domain.TrackedEnemy
import de.lhaider.yodo.tracking.domain.TrackedLocation

@Composable
fun TrackedLocationItem(
    location: TrackedLocation,
    onEnemyClicked: (TrackedEnemy) -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth()
    ) {
        val locationScore = "(${location.currentPoints}/${location.maxPoints})"
        Text(text = location.location.name.asString() + " $locationScore")

        location.enemies.forEach {
            TrackedEnemyItem(enemy = it) {
                onEnemyClicked(it)
            }
        }
    }
}