package edu.ucne.parcial1_perla.di

import android.content.Context
import androidx.room.Room
import dagger.Provides
import dagger.hilt.android.qualifiers.ApplicationContext
import edu.ucne.parcial1_perla.data.ArticuloDb
import javax.inject.Singleton

object AppModule {
    @Singleton
    @Provides
    fun ProvideArticuloDd(@ApplicationContext context: Context): ArticuloDb {
        val DATABASE_NAME = "articuloDb"
        return Room.databaseBuilder(
            context,
            ArticuloDb::class.java,
            DATABASE_NAME       )
            .fallbackToDestructiveMigration()
            .build()
    }


}