package edu.ucne.parcial1_perla.data

import androidx.room.*
import edu.ucne.parcial1_perla.data.entity.Articulo
import kotlinx.coroutines.flow.Flow

@Dao
interface ArticuloDao  {
    @Insert(onConflict = OnConflictStrategy.REPLACE)

    suspend fun Insertar(persona: Articulo)

    @Update
    suspend fun Modificar(persona: Articulo)

    @Query(
        "SELECT * FROM Articulo ORDER BY ArticuloId"
    )
    fun Lista(): Flow<List<Articulo>>
}