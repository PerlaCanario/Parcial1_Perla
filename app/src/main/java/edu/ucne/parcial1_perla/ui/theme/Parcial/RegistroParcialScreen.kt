package edu.ucne.parcial1_perla.ui.theme.Parcial

import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController

@Composable
fun RegistroParcialScreen(
    navHostController: NavHostController,
    viewModel: ParcialViewModel = hiltViewModel()
) {

    OutlinedButton(onClick = {
        viewModel.Guardar()
        navHostController.navigateUp()
    }) {
        Text(text = "Guardar")
    }
}