package de.lhaider.yodo.dark_souls_3

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
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
    val isLoading = viewModel.isLoading.collectAsState()
    val locations = viewModel.locations.collectAsState()
    val currentPoints = viewModel.currentPoints.collectAsState()
    val maxPoints = viewModel.maxPoints.collectAsState()

    if (isLoading.value) {
        CircularProgressIndicator(modifier = Modifier.fillMaxSize(0.75f))
        return
    }

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "Score: ${currentPoints.value} of ${maxPoints.value}")

        Button(onClick = { viewModel.reset() }) {
            Text(text = "Reset")
        }

        LazyColumn {
            items(locations.value) { tl ->
                Card(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    val locationScore = "(${tl.currentPoints}/${tl.maxPoints})"
                    Text(text = tl.location.name.asString() + " $locationScore")
                    tl.enemies.forEach { te ->
                        val state = if (te.isKilled()) " is killed." else " is alive."
                        Text(
                            modifier = Modifier.clickable { if (te.isKilled()) viewModel.delete(te.killId!!) else viewModel.add(tl.location, te.enemy) }, text = te.enemy.name.asString() + state
                        )
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
}