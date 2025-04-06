package de.lhaider.yodo

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import de.lhaider.yodo.navigation.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    navController: NavHostController
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "You only die once",
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                )
            )
        }
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Card(
                    onClick = { navController.navigate(Screen.DemonsSouls) },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp),
                    shape = RoundedCornerShape(8.dp),
                ) {
                    Image(
                        modifier = Modifier.fillMaxWidth(),
                        painter = painterResource(id = R.drawable.bg_demons_souls),
                        contentDescription = "Demon's Souls",
                        contentScale = ContentScale.FillBounds
                    )
                }

                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(16.dp)
                )

                Card(
                    onClick = { navController.navigate(Screen.DarkSouls3) },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp),
                    shape = RoundedCornerShape(8.dp),
                ) {
                    Image(
                        modifier = Modifier.fillMaxWidth(),
                        painter = painterResource(id = R.drawable.bg_dark_souls_3),
                        contentDescription = "Dark Souls 3",
                        contentScale = ContentScale.FillBounds
                    )
                }
            }
        }
    }
}