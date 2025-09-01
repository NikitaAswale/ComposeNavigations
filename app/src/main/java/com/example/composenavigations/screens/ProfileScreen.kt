package com.example.composenavigations.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

/**
 * ProfileScreen - Think of this as your bedroom or personal space
 *
 * Just like how your bedroom is a private space where you keep personal items,
 * this screen shows user-specific information like profile details, settings, etc.
 * You can only reach this room by coming from another room (like the living room).
 */
@Composable
fun ProfileScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // This is like a nameplate on your bedroom door
        Text(
            text = "👤 Profile Room",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "This is your personal profile area - like your private bedroom in the app!",
            style = MaterialTheme.typography.bodyLarge
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Display some example profile information
        Card(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text("Name: John Doe", style = MaterialTheme.typography.bodyLarge)
                Text("Email: john@example.com", style = MaterialTheme.typography.bodyMedium)
                Text("Member since: 2024", style = MaterialTheme.typography.bodyMedium)
            }
        }

        Spacer(modifier = Modifier.height(32.dp))

        // This button is like a door leading to another room
        Button(
            onClick = {
                navController.navigate("settings")
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = androidx.compose.ui.graphics.Color(0xFF10B981), // Vibrant Green
                contentColor = androidx.compose.ui.graphics.Color.White
            )
        ) {
            Text("Go to Settings ⚙️")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // This is like a "back" door to return to the previous room
        OutlinedButton(
            onClick = {
                // This is like walking back through the door you came from
                navController.popBackStack()
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.outlinedButtonColors(
                containerColor = androidx.compose.ui.graphics.Color(0xFFF59E0B), // Vibrant Orange
                contentColor = androidx.compose.ui.graphics.Color(0xFFF59E0B) // Orange text
            )
        ) {
            Text("⬅️ Go Back")
        }
    }
}
