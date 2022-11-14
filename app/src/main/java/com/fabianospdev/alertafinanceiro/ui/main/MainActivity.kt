package com.fabianospdev.alertafinanceiro.ui.main

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.fabianospdev.alertafinanceiro.ui.NaveScreens
import com.fabianospdev.alertafinanceiro.ui.login.LoginActivity
import com.fabianospdev.alertafinanceiro.ui.theme.AlertaFinanceiroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var Logged = false
        setContent {
            AlertaFinanceiroTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.primary
                ) {
                    if(Logged){
                        NaveScreens("Login")
                    }else {
                        ShowAddForm()
                    }
                }
            }
        }

    }

    @Composable
    private fun ShowAddForm() {
        startActivity(Intent(this, LoginActivity::class.java))
    }
}