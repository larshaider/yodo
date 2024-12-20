package de.lhaider.yodo.core.ui.dto.ui

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import de.lhaider.yodo.core.ui.dto.domain.TrackedEnemy
import de.lhaider.yodo.core.ui.dto.domain.TrackedLocation

@Composable
fun TrackedLocationList(
    locations: List<TrackedLocation>,
    isReadOnly: Boolean,
    onEnemyClicked: (TrackedLocation, TrackedEnemy) -> Unit
) {
    LazyColumn {
        locations.forEach { location ->
            item {
                Spacer(modifier = Modifier.fillMaxWidth().height(8.dp))
                LocationHeader(location)
            }

            items(location.enemies) { enemy ->
                TrackedEnemyItem(enemy = enemy, isReadOnly = isReadOnly) {
                    onEnemyClicked(location, enemy)
                }

                Spacer(modifier = Modifier.fillMaxWidth().height(8.dp))
            }
        }
    }
}

@Composable
fun LocationHeader(location: TrackedLocation) {
    val locationScore = "(${location.currentPoints}/${location.maxPoints})"
    val headline = location.name.asString() + " $locationScore"
    Text(
        text = headline,
        fontSize = 18.sp
    )
}