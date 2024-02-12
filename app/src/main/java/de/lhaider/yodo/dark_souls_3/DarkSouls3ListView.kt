package de.lhaider.yodo.dark_souls_3

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import de.lhaider.yodo.tracking.domain.isKilled

@Composable
fun DarkSouls3ListView(
    viewModel: DarkSouls3ViewModel = hiltViewModel()
) {
    val locations = viewModel.locations.collectAsState()
    val currentPoints = viewModel.currentPoints.collectAsState()
    val maxPoints = viewModel.maxPoints.collectAsState()

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        locations.value.forEach { tl ->
            Card(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = tl.location.name.asString())
                tl.enemies.forEach { te ->
                    val state = if (te.isKilled()) " is killed." else " is alive."
                    Text(text = te.enemy.name.asString() + state)
                }
            }

            Spacer(
                modifier = Modifier
                    .size(8.dp)
                    .fillMaxWidth()
            )
        }
    }
}