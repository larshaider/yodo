package de.lhaider.yodo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import dagger.hilt.android.AndroidEntryPoint
import de.lhaider.yodo.core.game.GameView
import de.lhaider.yodo.core.ui.gameViewModel
import de.lhaider.yodo.feature.demons_souls.game.DemonsSouls
import de.lhaider.yodo.ui.theme.YouOnlyDieOnceTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            YouOnlyDieOnceTheme {
                GameView(
                    viewModel = gameViewModel(game = DemonsSouls())
                )
            }
        }
    }
}