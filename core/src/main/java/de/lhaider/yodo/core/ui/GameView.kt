package de.lhaider.yodo.core.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
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
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import de.lhaider.yodo.core.R
import de.lhaider.yodo.core.ui.dto.ui.TrackedLocationList

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GameView(
    navController: NavController,
    viewModel: GameViewModel
) {
    val uiState by viewModel.uiState.collectAsState()
    val isLoading = uiState.isLoading
    val name = uiState.gameName
    val locations = uiState.locations
    val currentPoints = uiState.currentPoints
    val maxPoints = uiState.maxPoints
    val canChangeSelection = uiState.allowSelectionChange

    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            TopAppBar(
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
                navigationIcon = {
                    IconButton(onClick = {
                        viewModel.onNavigateBack()
                        navController.navigateUp()
                    }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Navigate back."
                        )
                    }
                },
                actions = {
                    if (!isLoading) {
                        IconButton(
                            onClick = viewModel::resetRun,
                            enabled = currentPoints > 0
                        ) {
                            Icon(
                                modifier = Modifier.padding(4.dp),
                                painter = painterResource(id = R.drawable.ic_death),
                                contentDescription = "Reset current run."
                            )
                        }
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                scrollBehavior = scrollBehavior
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
                    TrackedLocationList(locations, !canChangeSelection) { location, enemy ->
                        viewModel.onEnemyClicked(location, enemy)
                    }
                }
            }
        }
    }
}
