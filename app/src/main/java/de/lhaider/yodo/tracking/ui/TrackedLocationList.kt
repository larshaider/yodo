package de.lhaider.yodo.tracking.ui

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import de.lhaider.yodo.dark_souls_3.ui.LocationHeader
import de.lhaider.yodo.tracking.domain.TrackedEnemy
import de.lhaider.yodo.tracking.domain.TrackedLocation

@Composable
fun TrackedLocationList(
    locations: List<TrackedLocation>,
    onEnemyClicked: (TrackedLocation, TrackedEnemy) -> Unit
) {
    LazyColumn {
        locations.forEach { location ->
            item {
                LocationHeader(location)
            }

            items(location.enemies) { enemy ->
                TrackedEnemyItem(enemy = enemy) {
                    onEnemyClicked(location, enemy)
                }

                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(4.dp)
                )
            }
        }
    }
}