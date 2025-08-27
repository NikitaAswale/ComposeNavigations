package com.example.composenavigations

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.composenavigations.ui.theme.ComposeNavigationsTheme

/**
 * MainActivity - Think of this as the foundation of your house
 *
 * Just like how a house needs a solid foundation to stand on,
 * MainActivity is the foundation that holds your entire app together.
 * It sets up the basic structure and displays your app's content.
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            // This is like wrapping your house with the app's theme/color scheme
            ComposeNavigationsTheme {
                // Surface is like the outer walls of your house - provides the background
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // This is where we place our navigation system
                    // Think of it as placing the floor plan inside the house structure
                    AppNavigation()
                }
            }
        }
    }
}