package edu.ucne.parcial1_perla.navegation

sealed class Screen (val route : String){

    object RegistroParcialScreen : Screen("RegistroParcial")
    object ConsultaParcialScreen : Screen("ConsultaParcial")
}