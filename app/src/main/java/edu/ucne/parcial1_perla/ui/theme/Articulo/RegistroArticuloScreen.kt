package edu.ucne.parcial1_perla.ui.theme.Articulo

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Money
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Save
import androidx.compose.material.icons.filled.Streetview
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.core.text.isDigitsOnly
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import edu.ucne.parcial1_perla.navegation.Screen

@Composable
fun RegistroArticuloScreen(
    navHostController: NavHostController,
    viewModel : ArticuloViewModel = hiltViewModel()

) {



    val ScaffoldState = rememberScaffoldState()

    var validarDescripcion by remember{ mutableStateOf(false) }
    var validarMarca by remember{ mutableStateOf(false) }
    var validarExistencia by remember{ mutableStateOf(false) }
    val context = LocalContext.current


    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Registro de Articulo") })
        },

        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    validarDescripcion = viewModel.descripcion.isBlank()
                    validarMarca = viewModel.marca.isBlank()
                    validarExistencia = viewModel.existencia.isBlank()

                    if(viewModel.descripcion== ""){
                        Toast.makeText(context, "La descripcion no debe estar vacia", Toast.LENGTH_SHORT).show()
                    }

                    if(viewModel.marca == ""){
                        Toast.makeText(context, "La marca no debe estar vacia", Toast.LENGTH_SHORT).show()
                    }

                    if(viewModel.existencia == ""){
                        Toast.makeText(context, "La existencia no debe estar vacio y debe de ser mayor a 0", Toast.LENGTH_SHORT).show()
                    }else{
                        if(!viewModel.existencia.isDigitsOnly()){
                            Toast.makeText(context, "No puedes escribir letras", Toast.LENGTH_SHORT).show()
                        }
                    }

                    if(!validarDescripcion && !validarMarca && !validarExistencia){
                        if(viewModel.existencia.isDigitsOnly() && viewModel.existencia.toDouble() > 0.0){
                            viewModel.Guardar()
                            Toast.makeText(context, "Guardado", Toast.LENGTH_SHORT).show()
                           // backToListado()
                        }else{
                            Toast.makeText(context, "La existencia debe de ser mayor a 0", Toast.LENGTH_SHORT).show()
                        }
                    }
                },
                backgroundColor = MaterialTheme.colors.primary
            ) {
                Icon(imageVector = Icons.Default.Save, contentDescription = "Nuevo")
            }
        },
        scaffoldState = ScaffoldState

    ){it

        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)) {

            TextField(
                value = viewModel.descripcion,
                onValueChange = {viewModel.descripcion = it} ,
                label = { Text(text = "Nombre del articulo")},
                modifier = Modifier.fillMaxWidth(),
                leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription ="") }

            )
            TextField(
                value = viewModel.marca,
                onValueChange = {viewModel.marca = it} ,
                label = { Text(text = "Marca")},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                leadingIcon = { Icon(imageVector = Icons.Default.Streetview, contentDescription ="") }

            )
            TextField(
                value = viewModel.existencia,
                onValueChange = {viewModel.existencia = it} ,
                label = { Text(text = "Existencia")},
                modifier = Modifier.fillMaxWidth(),
                leadingIcon = { Icon(imageVector = Icons.Default.Money, contentDescription ="") }

            )
        }
    }
}