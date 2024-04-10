package de.lhaider.yodo.demons_souls.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import de.lhaider.yodo.core.tracking.ui.TrackedLocationList

@Composable
fun DemonsSoulsGameView(
    viewModel: DemonsSoulsViewModel = hiltViewModel()
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
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        TrackedLocationList(locations) { location, enemy ->
            viewModel.onEnemyClicked(location, enemy)
        }
    }
}