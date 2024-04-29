package de.lhaider.yodo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import de.lhaider.yodo.navigation.NavGraph
import de.lhaider.yodo.navigation.Screen
import de.lhaider.yodo.ui.theme.YouOnlyDieOnceTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            val navController = rememberNavController()

            YouOnlyDieOnceTheme {
                NavGraph(
                    navController = navController,
                    startDestination = Screen.Home
                )
            }
        }
    }
}