package edu.ucne.parcial1_perla.navegation

sealed class Screen (val route : String){

    object RegistroArticuloScreen : Screen("RegistroArticulo")
    object ConsultaArticuloScreen : Screen("ConsultaArticulo")
}