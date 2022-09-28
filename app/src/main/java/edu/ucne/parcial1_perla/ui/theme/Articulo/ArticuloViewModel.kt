package edu.ucne.parcial1_perla.ui.theme.Articulo

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import edu.ucne.parcial1_perla.data.entity.Articulo
import edu.ucne.parcial1_perla.data.repository.ArticuloRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ArticuloViewModel @Inject constructor(
    val articulorepository: ArticuloRepository
):ViewModel(){
    var descripcion by mutableStateOf("")
    var marca by mutableStateOf("")
    var existencia by mutableStateOf("")
    var articulo = articulorepository.Lista()
        private set
    fun Guardar(){
        viewModelScope.launch {
            articulorepository.Insertar(Articulo(
                ArticuloId = 0,
                Descripcion = descripcion,
                Marca = marca,
                Existencia = existencia.toDouble()
            ))
        }
    }
}