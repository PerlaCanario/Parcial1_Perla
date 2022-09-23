package edu.ucne.parcial1_perla.ui.theme.Parcial

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import edu.ucne.parcial1_perla.data.entity.Parcial
import edu.ucne.parcial1_perla.navegation.Screen

@Composable
fun ConsultaParcialScreen(

    navHostController: NavHostController,
    viewModel : ParcialViewModel = hiltViewModel()
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Consulta Parcial") }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {
                navHostController.navigate(Screen.RegistroParcialScreen.route)
            }) {
                Icon(imageVector = Icons.Default.Add, contentDescription = null)
            }
        }

    ) {

        Column(
            modifier = Modifier
                .padding(it)
                .padding(8.dp)
        ) {

        }
    }

    @Composable
    fun RowParcial(examen: Parcial) {
        Row() {
            Text(text = examen.cosa1)
            Text(text = examen.cosa2)
            Text(text = examen.algo.toString())
        }
    }
}