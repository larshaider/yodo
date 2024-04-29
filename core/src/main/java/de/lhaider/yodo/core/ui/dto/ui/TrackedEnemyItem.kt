package de.lhaider.yodo.core.ui.dto.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import de.lhaider.yodo.core.ui.dto.domain.TrackedEnemy
import de.lhaider.yodo.core.ui.dto.domain.isKilled

@Composable
fun TrackedEnemyItem(
    enemy: TrackedEnemy,
    isReadOnly: Boolean,
    onClick: () -> Unit
) {
    Card(
        onClick = onClick,
        shape = RoundedCornerShape(10),
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp)
    ) {
        ConstraintLayout(
            modifier = Modifier
                .padding(0.dp, 4.dp, 4.dp, 4.dp)
                .fillMaxSize()
        )
        {
            val (text, button) = createRefs()

            Checkbox(
                checked = enemy.isKilled(),
                onCheckedChange = { onClick() },
                enabled = !isReadOnly,
                modifier = Modifier.constrainAs(button) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                }
            )

            Text(
                text = enemy.name.asString(),
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .padding(4.dp, 0.dp, 0.dp, 0.dp)
                    .constrainAs(text) {
                        top.linkTo(parent.top)
                        bottom.linkTo(parent.bottom)
                        start.linkTo(button.end)
                        end.linkTo(parent.end)
                        width = Dimension.fillToConstraints
                    }
            )
        }
    }
}