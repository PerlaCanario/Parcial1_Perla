package edu.ucne.parcial1_perla.ui.theme.Articulo

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
import edu.ucne.parcial1_perla.data.entity.Articulo
import edu.ucne.parcial1_perla.navegation.Screen

@Composable
fun ConsultaArticuloScreen(

    navHostController: NavHostController,
    viewModel : ArticuloViewModel = hiltViewModel()
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Consulta Articulo") }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {
                navHostController.navigate(Screen.RegistroArticuloScreen.route)
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
    fun RowArticulo(articulo: Articulo) {
        Row() {
            Text(text = articulo.Descripcion)
            Text(text = articulo.Marca)
            Text(text = articulo.Existencia.toString())
        }
    }
}