package edu.ucne.parcial1_perla.di

import android.content.Context
import androidx.room.Room
import dagger.Provides
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

object AppModule {
    @Singleton
    @Provides
    fun ProvideParcialBd(@ApplicationContext context: Context): ParcialBd {
        val DATABASE_NAME = "parcialBd"
        return Room.databaseBuilder(
            context,
            ParcialBd::class.java,
            DATABASE_NAME       )
            .fallbackToDestructiveMigration()
            .build()
    }


}