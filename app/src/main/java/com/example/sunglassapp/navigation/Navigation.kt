package com.example.sunglassapp.navigation

import SplashScreen
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.sunglassapp.navigation.Screen
import com.example.sunglassapp.view.DashboardScreen
import com.example.sunglassapp.view.OnBoardingScreen
import com.example.sunglassapp.view.ProductDetailsScreen



@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.SplashScreen.route
    ) {
        composable(Screen.SplashScreen.route) {
            SplashScreen(navController = navController)
        }
        composable(Screen.DashboardScreen.route) {
            DashboardScreen(navController= navController)
        }
        composable(Screen.OnBoardingScreen.route) {
            OnBoardingScreen(navController= navController)
        }

        composable(Screen.ProductDetailScreen.route) {
            ProductDetailsScreen(navController=navController)
        }
    }
}