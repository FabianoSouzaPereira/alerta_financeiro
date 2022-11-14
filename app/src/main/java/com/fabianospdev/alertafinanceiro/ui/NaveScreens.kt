package com.fabianospdev.alertafinanceiro.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.fabianospdev.alertafinanceiro.Routes
import com.fabianospdev.alertafinanceiro.ui.login.LoginPage
import com.fabianospdev.alertafinanceiro.ui.main.MainPage

@Composable
fun NaveScreens(name: String?) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.Login.route) {
        composable(Routes.Main.route) {
            MainPage(navController = navController)
        }
        composable(Routes.Login.route) {
            LoginPage(navController = navController)
        }
    }
}



