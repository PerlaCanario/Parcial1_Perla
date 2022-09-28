package edu.ucne.parcial1_perla.navegation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import edu.ucne.parcial1_perla.ui.theme.Articulo.ConsultaArticuloScreen
import edu.ucne.parcial1_perla.ui.theme.Articulo.RegistroArticuloScreen


@Composable
fun App() {
    val navHostController = rememberNavController()

    NavHost(navController = navHostController, startDestination = Screen.ConsultaArticuloScreen.route){
        composable(Screen.ConsultaArticuloScreen.route){
            ConsultaArticuloScreen(navHostController = navHostController)
        }
        composable(Screen.RegistroArticuloScreen.route){
            RegistroArticuloScreen(navHostController = navHostController)
        }

    }
}