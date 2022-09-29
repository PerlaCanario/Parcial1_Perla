package edu.ucne.parcial1_perla.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import edu.ucne.parcial1_perla.data.ArticuloDb
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)

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