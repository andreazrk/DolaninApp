package com.example.pemesanantiket.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0017"}, d2 = {"Lcom/example/pemesanantiket/viewmodel/HistoryViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "dataList", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/pemesanantiket/model/ModelDatabase;", "getDataList", "()Landroidx/lifecycle/LiveData;", "setDataList", "(Landroidx/lifecycle/LiveData;)V", "databaseDao", "Lcom/example/pemesanantiket/database/dao/DatabaseDao;", "getDatabaseDao", "()Lcom/example/pemesanantiket/database/dao/DatabaseDao;", "setDatabaseDao", "(Lcom/example/pemesanantiket/database/dao/DatabaseDao;)V", "deleteDataById", "", "uid", "", "app_debug"})
public final class HistoryViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.example.pemesanantiket.model.ModelDatabase>> dataList;
    @org.jetbrains.annotations.Nullable()
    private com.example.pemesanantiket.database.dao.DatabaseDao databaseDao;
    
    public HistoryViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.pemesanantiket.model.ModelDatabase>> getDataList() {
        return null;
    }
    
    public final void setDataList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.pemesanantiket.model.ModelDatabase>> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.pemesanantiket.database.dao.DatabaseDao getDatabaseDao() {
        return null;
    }
    
    public final void setDatabaseDao(@org.jetbrains.annotations.Nullable()
    com.example.pemesanantiket.database.dao.DatabaseDao p0) {
    }
    
    public final void deleteDataById(int uid) {
    }
}