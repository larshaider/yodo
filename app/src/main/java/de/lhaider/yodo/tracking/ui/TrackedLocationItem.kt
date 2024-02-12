package de.lhaider.yodo.tracking.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import de.lhaider.yodo.tracking.domain.TrackedEnemy
import de.lhaider.yodo.tracking.domain.TrackedLocation

@Composable
fun TrackedLocationItem(
    tracked: TrackedLocation,
    onEnemyClicked: (TrackedEnemy) -> Unit
) {
    OutlinedCard(
        shape = RoundedCornerShape(0),
        border = BorderStroke(1.dp, Color.Black),
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.padding(8.dp, 0.dp),
        ) {
            val locationScore = "(${tracked.currentPoints}/${tracked.maxPoints})"
            Text(
                text = tracked.location.name.asString() + " $locationScore"
            )

            tracked.enemies.forEach {
                TrackedEnemyItem(tracked = it) {
                    onEnemyClicked(it)
                }
            }
        }
    }
}