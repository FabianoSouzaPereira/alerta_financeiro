package com.fabianospdev.alertafinanceiro.ui.login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.fabianospdev.alertafinanceiro.ui.NaveScreens
import com.fabianospdev.alertafinanceiro.ui.theme.AlertaFinanceiroTheme

class LoginActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AlertaFinanceiroTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.primary
                ) {
                    NaveScreens("Login")
                }
            }
        }
    }
}