package com.example.pemesanantiket.database

import androidx.room.Database
import com.example.pemesanantiket.model.ModelDatabase
import androidx.room.RoomDatabase
import com.example.pemesanantiket.database.dao.DatabaseDao

/**
 * AppDatabase adalah class abstract untuk menampilkan ModelDatabase
 */

@Database(entities = [ModelDatabase::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun databaseDao(): DatabaseDao?
}