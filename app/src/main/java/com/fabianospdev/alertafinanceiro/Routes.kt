package com.fabianospdev.alertafinanceiro

sealed class Routes(val route: String) {
    object Main : Routes("MainActivity")
    object Login : Routes("LoginActivity")
}
