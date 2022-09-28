package edu.ucne.parcial1_perla.navegation

sealed class Screen (val route : String){

    object RegistroArticuloScreen : Screen("RegistroParcial")
    object ConsultaArticuloScreen : Screen("ConsultaParcial")
}