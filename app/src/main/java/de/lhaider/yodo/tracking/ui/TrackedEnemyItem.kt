package de.lhaider.yodo.tracking.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import de.lhaider.yodo.tracking.domain.TrackedEnemy
import de.lhaider.yodo.tracking.domain.isKilled
import de.lhaider.yodo.ui.extension.image
import de.lhaider.yodo.ui.extension.name

@Composable
fun TrackedEnemyItem(
    enemy: TrackedEnemy,
    onClick: () -> Unit
) {
    Card(
        onClick = onClick,
        shape = RoundedCornerShape(10, 50, 50, 10),
        colors = CardDefaults.cardColors().copy(containerColor = Color.White.copy(alpha = 0.75f)),
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp)
    ) {
        ConstraintLayout(modifier = Modifier.padding(0.dp, 4.dp, 4.dp, 4.dp).fillMaxSize()) {
            val (image, text, button) = createRefs()

            Checkbox(
                checked = enemy.isKilled(),
                onCheckedChange = { onClick() },
                modifier = Modifier.constrainAs(button) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                }
            )

            Text(
                text = enemy.name(),
                modifier = Modifier
                    .padding(4.dp, 0.dp, 0.dp, 0.dp)
                    .constrainAs(text) {
                        top.linkTo(parent.top)
                        bottom.linkTo(parent.bottom)
                        start.linkTo(button.end)
                    }
            )

            Image(
                painter = enemy.image(),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .clip(CircleShape)
                    .aspectRatio(1.0f)
                    .constrainAs(image) {
                        top.linkTo(parent.top)
                        bottom.linkTo(parent.bottom)
                        end.linkTo(parent.end)
                    }
            )
        }
    }
}