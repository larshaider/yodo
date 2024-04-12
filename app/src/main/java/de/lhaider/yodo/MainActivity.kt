package de.lhaider.yodo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import dagger.hilt.android.AndroidEntryPoint
import de.lhaider.yodo.feature.dark_souls3.ui.DarkSouls3GameView
import de.lhaider.yodo.ui.theme.YouOnlyDieOnceTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            YouOnlyDieOnceTheme {
                DarkSouls3GameView()
            }
        }
    }
}