package de.lhaider.yodo.core.game

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import de.lhaider.yodo.core.R
import de.lhaider.yodo.core.tracking.ui.TrackedLocationList
import de.lhaider.yodo.core.ui.GameViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GameView(
    viewModel: GameViewModel
) {
    val uiState = viewModel.uiState.collectAsState()
    val isLoading = uiState.value.isLoading
    val name = uiState.value.gameName
    val locations = uiState.value.locations
    val currentPoints = uiState.value.currentPoints
    val maxPoints = uiState.value.maxPoints

    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            TopAppBar(
                scrollBehavior = scrollBehavior,
                title = {
                    Column {
                        Text(
                            text = name.asString(),
                            style = MaterialTheme.typography.titleLarge
                        )

                        Text(
                            text = if (isLoading) "Loading last save" else "Current Score: $currentPoints of $maxPoints",
                            style = MaterialTheme.typography.titleSmall,
                        )
                    }
                },
                actions = {
                    IconButton(
                        onClick = viewModel::reset,
                        enabled = currentPoints > 0
                    ) {
                        Icon(
                            modifier = Modifier.padding(4.dp),
                            painter = painterResource(id = R.drawable.ic_death),
                            contentDescription = "Reset current run."
                        )
                    }
                }
            )
        }
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp, 0.dp)
            ) {
                if (isLoading) {
                    CircularProgressIndicator(modifier = Modifier.fillMaxSize(0.75f))
                } else {
                    TrackedLocationList(locations) { location, enemy ->
                        viewModel.onEnemyClicked(location, enemy)
                    }
                }
            }
        }
    }
}
