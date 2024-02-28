package de.lhaider.yodo.tracking.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import de.lhaider.yodo.tracking.domain.TrackedEnemy
import de.lhaider.yodo.tracking.domain.isKilled
import de.lhaider.yodo.ui.theme.BloodRed
import de.lhaider.yodo.ui.theme.Gold

@Composable
fun TrackedEnemyItem(
    enemy: TrackedEnemy,
    onClick: () -> Unit
) {
    Card(
        onClick = onClick,
        shape = RoundedCornerShape(10),
        colors = CardDefaults.cardColors().copy(containerColor = BloodRed),
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
                colors = CheckboxDefaults.colors().copy(checkedBoxColor = Color.Black, checkedBorderColor = Color.Black, checkedCheckmarkColor = Color.White, uncheckedBoxColor = Color.Black, uncheckedBorderColor = Color.Black),
                modifier = Modifier.constrainAs(button) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                }
            )

            Text(
                text = enemy.name.asString(),
                color = Color.White,
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