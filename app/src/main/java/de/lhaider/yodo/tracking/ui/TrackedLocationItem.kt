package de.lhaider.yodo.tracking.ui

import androidx.compose.animation.fadeIn
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import de.lhaider.yodo.tracking.domain.TrackedEnemy
import de.lhaider.yodo.tracking.domain.TrackedLocation
import de.lhaider.yodo.ui.extension.image
import de.lhaider.yodo.ui.extension.name

@Composable
fun TrackedLocationItem(
    modifier: Modifier = Modifier,
    tracked: TrackedLocation,
    onEnemyClicked: (TrackedEnemy) -> Unit
) {
    Box(
        modifier = modifier,
    ) {
        Image(
            tracked.image(),
            contentDescription = "",
            contentScale = ContentScale.FillBounds,
            alpha = 0.5f,
            modifier = Modifier.matchParentSize()
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp, 0.dp)
        ) {
            val locationScore = "(${tracked.currentPoints}/${tracked.maxPoints})"
            Text(text = tracked.name() + " $locationScore")

            tracked.enemies.forEach {
                TrackedEnemyItem(enemy = it) {
                    onEnemyClicked(it)
                }

                Spacer(
                    modifier = Modifier
                        .height(4.dp)
                        .fillMaxWidth()
                )
            }
        }
    }
}