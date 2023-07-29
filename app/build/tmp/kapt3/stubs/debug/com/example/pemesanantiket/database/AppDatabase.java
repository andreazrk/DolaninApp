package com.example.pemesanantiket.database;

import java.lang.System;

/**
 * AppDatabase adalah class abstract untuk menampilkan ModelDatabase
 */
@androidx.room.Database(entities = {com.example.pemesanantiket.model.ModelDatabase.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/example/pemesanantiket/database/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "databaseDao", "Lcom/example/pemesanantiket/database/dao/DatabaseDao;", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.example.pemesanantiket.database.dao.DatabaseDao databaseDao();
}