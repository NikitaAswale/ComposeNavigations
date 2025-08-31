package com.example.composenavigations

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composenavigations.screens.HomeScreen
import com.example.composenavigations.screens.ProfileScreen
import com.example.composenavigations.screens.SettingsScreen

/**
 * Navigation - Think of this as your house's floor plan or map.
 *
 * Just like how a house has a floor plan that shows how all rooms connect,
 * this Navigation component shows how all your app screens connect to each other.
 * It defines the "routes" (like addresses) for each screen and how to navigate between them.
 */
@Composable
fun AppNavigation() {
    // This is like having a personal tour guide who remembers where you've been
    // and can take you back to previous rooms
    val navController = rememberNavController()

    // NavHost is like the main hallway that connects all rooms
    // startDestination is like your front door - where visitors enter first
    NavHost(
        navController = navController,
        startDestination = "home" // This is like your home address - where the app starts
    ) {
        // Each composable is like a room in your house
        // The route is like the room's address

        // Home room - the main entrance
        composable(route = "home") {
            // This is like opening the door to the home room
            HomeScreen(navController = navController)
        }

        // Profile room - like a bedroom
        composable(route = "profile") {
            // This is like opening the door to the profile room
            ProfileScreen(navController = navController)
        }

        // Settings room - like a workshop/garage
        composable(route = "settings") {
            // This is like opening the door to the settings room
            SettingsScreen(navController = navController)
        }
    }
}
