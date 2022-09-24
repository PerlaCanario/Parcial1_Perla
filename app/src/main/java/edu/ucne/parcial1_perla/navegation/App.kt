package edu.ucne.parcial1_perla.navegation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import edu.ucne.parcial1_perla.ui.theme.Parcial.ConsultaParcialScreen
import edu.ucne.parcial1_perla.ui.theme.Parcial.RegistroParcialScreen

@Composable
fun App() {
    val navHostController = rememberNavController()

    NavHost(navController = navHostController, startDestination = Screen.ConsultaParcialScreen.route){
        composable(Screen.ConsultaParcialScreen.route){
            ConsultaParcialScreen(navHostController = navHostController)
        }
        composable(Screen.RegistroParcialScreen.route){
            RegistroParcialScreen(navHostController = navHostController)
        }

    }
}