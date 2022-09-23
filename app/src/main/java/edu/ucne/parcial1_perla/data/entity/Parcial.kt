package edu.ucne.parcial1_perla.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Parcial")
data class Parcial {
    @PrimaryKey(autoGenerate = true)
    val id : Int = 0,
    val cosa1 : String,
    val cosa2: String,
    val algo: Double = 0.00
}