package com.example.pemesanantiket.database

import android.content.Context
import androidx.room.Room

/**
 * Untuk database client kita beri nama "travel_db"
 */

class DatabaseClient private constructor(context: Context) {
    var appDatabase: AppDatabase

    companion object {
        private var mInstance: DatabaseClient? = null
        @JvmStatic
        @Synchronized
        fun getInstance(context: Context): DatabaseClient? {
            if (mInstance == null) {
                mInstance = DatabaseClient(context)
            }
            return mInstance
        }
    }

    init {
        appDatabase = Room.databaseBuilder(context, AppDatabase::class.java, "travel_db")
            .fallbackToDestructiveMigration()
            .build()
    }
}