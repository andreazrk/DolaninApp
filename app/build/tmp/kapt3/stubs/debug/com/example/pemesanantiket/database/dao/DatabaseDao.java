package com.example.pemesanantiket.database.dao;

import java.lang.System;

/**
 * Untuk action database seperti :
 * getAllData()
 * insertData()
 * deleteDataById()
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\'J!\u0010\n\u001a\u00020\u00032\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\f\"\u00020\tH\'\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/example/pemesanantiket/database/dao/DatabaseDao;", "", "deleteDataById", "", "uid", "", "getAllData", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/pemesanantiket/model/ModelDatabase;", "insertData", "modelDatabases", "", "([Lcom/example/pemesanantiket/model/ModelDatabase;)V", "app_debug"})
public abstract interface DatabaseDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM tbl_travel")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.pemesanantiket.model.ModelDatabase>> getAllData();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertData(@org.jetbrains.annotations.NotNull()
    com.example.pemesanantiket.model.ModelDatabase... modelDatabases);
    
    @androidx.room.Query(value = "DELETE FROM tbl_travel WHERE uid= :uid")
    public abstract void deleteDataById(int uid);
}