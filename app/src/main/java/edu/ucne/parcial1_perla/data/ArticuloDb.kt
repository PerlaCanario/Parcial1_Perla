package edu.ucne.parcial1_perla.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [
        Articulo ::class],
    exportSchema = false,
    version = 1
)
abstract class ArticuloDb : RoomDatabase() {
    abstract val articuloDao: ArticuloDao
}