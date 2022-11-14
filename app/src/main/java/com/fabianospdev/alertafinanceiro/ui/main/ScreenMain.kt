package com.fabianospdev.alertafinanceiro.ui.main

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.fabianospdev.alertafinanceiro.ui.NaveScreens
import com.fabianospdev.alertafinanceiro.ui.theme.AlertaFinanceiroTheme

@Composable
fun MainPage(navController: NavHostController) {
    Column { Text("MainPage") }
}

@Preview(showBackground = true)
@Composable
private fun defaultPreview() {
    AlertaFinanceiroTheme {
        NaveScreens("Main")
    }
}