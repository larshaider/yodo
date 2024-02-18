package de.lhaider.yodo.dark_souls_3.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import de.lhaider.yodo.R
import de.lhaider.yodo.tracking.domain.TrackedLocation
import de.lhaider.yodo.tracking.ui.TrackedLocationList
import de.lhaider.yodo.ui.extension.name

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
        modifier = Modifier
            .fillMaxSize()
            .paint(painterResource(R.drawable.ds_background), contentScale = ContentScale.FillHeight, alpha = 0.9f)
            .padding(8.dp)
    ) {
        Text(text = "Score: $currentPoints of $maxPoints")

        Button(onClick = viewModel::reset) {
            Text(text = "Reset")
        }

        TrackedLocationList(locations) { location, enemy ->
            viewModel.onEnemyClicked(location, enemy)
        }
    }
}

@Composable
fun LocationHeader(location: TrackedLocation) {
    val locationScore = "(${location.currentPoints}/${location.maxPoints})"
    Text(text = location.name() + " $locationScore")
}
