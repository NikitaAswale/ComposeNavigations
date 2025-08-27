package com.example.composenavigations.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

/**
 * HomeScreen - Think of this as your app's "living room"
 *
 * Just like how you enter your home and see the main living area,
 * this is the first screen users see when they open your app.
 * It's where you provide the main entry points to other areas of your app.
 */
@Composable
fun HomeScreen(navController: NavController) {
    // Column is like arranging furniture in a room - everything stacks vertically
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp), // Padding is like giving space around the edges of a room
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // This is like the main title/sign on your living room wall
        Text(
            text = "🏠 Welcome Home!",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(16.dp)) // Spacer is like empty space between furniture

        Text(
            text = "This is your home screen - like the main entrance of your app!",
            style = MaterialTheme.typography.bodyLarge
        )

        Spacer(modifier = Modifier.height(32.dp))

        // This button is like a door to another room in your house
        Button(
            onClick = {
                // This is like opening a door and walking to another room
                navController.navigate("profile")
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Go to Profile 👤")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Another door to a different room
        Button(
            onClick = {
                navController.navigate("settings")
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Go to Settings ⚙️")
        }
    }
}
