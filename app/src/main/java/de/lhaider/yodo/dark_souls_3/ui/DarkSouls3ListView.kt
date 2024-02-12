package de.lhaider.yodo.dark_souls_3.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import de.lhaider.yodo.tracking.ui.TrackedLocationItem

@Composable
fun DarkSouls3ListView(
    viewModel: DarkSouls3ViewModel = hiltViewModel()
) {
    val uiState = viewModel.uiState.collectAsState()
    val isLoading = uiState.value.isLoading
    val locations = uiState.value.locations
    val currentPoints = uiState.value.currentPoints
    val maxPoints = uiState.value.maxPoints

    if (isLoading) {
        CircularProgressIndicator(modifier = Modifier.fillMaxSize(0.75f))
        return
    }

    Column(
        modifier = Modifier.fillMaxSize().padding(8.dp)
    ) {
        Text(text = "Score: $currentPoints of $maxPoints")

        Button(onClick = viewModel::reset) {
            Text(text = "Reset")
        }

        LazyColumn {
            items(locations) { location ->
                TrackedLocationItem(location) { enemy ->
                    viewModel.onEnemyClicked(location, enemy)
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