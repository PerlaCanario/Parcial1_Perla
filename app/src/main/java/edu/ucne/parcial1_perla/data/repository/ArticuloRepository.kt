package edu.ucne.parcial1_perla.data.repository

import edu.ucne.parcial1_perla.data.ArticuloDao
import edu.ucne.parcial1_perla.data.entity.Articulo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ArticuloRepository @Inject constructor(
    val articuloDao: ArticuloDao
) {
    suspend fun Insertar(articulo: Articulo) = articuloDao.Insertar(articulo)

    fun Lista(): Flow<List<Articulo>> = articuloDao.Lista()
}