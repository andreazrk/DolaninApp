package com.example.pemesanantiket.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004JV\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0019"}, d2 = {"Lcom/example/pemesanantiket/viewmodel/InputDataViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "databaseDao", "Lcom/example/pemesanantiket/database/dao/DatabaseDao;", "getDatabaseDao", "()Lcom/example/pemesanantiket/database/dao/DatabaseDao;", "setDatabaseDao", "(Lcom/example/pemesanantiket/database/dao/DatabaseDao;)V", "addDataPemesan", "", "nama_penumpang", "", "keberangkatan", "tujuan", "tanggal", "nomor_telepon", "anak_anak", "", "dewasa", "harga_tiket", "kelas", "status", "app_debug"})
public final class InputDataViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.Nullable()
    private com.example.pemesanantiket.database.dao.DatabaseDao databaseDao;
    
    public InputDataViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.pemesanantiket.database.dao.DatabaseDao getDatabaseDao() {
        return null;
    }
    
    public final void setDatabaseDao(@org.jetbrains.annotations.Nullable()
    com.example.pemesanantiket.database.dao.DatabaseDao p0) {
    }
    
    public final void addDataPemesan(@org.jetbrains.annotations.NotNull()
    java.lang.String nama_penumpang, @org.jetbrains.annotations.NotNull()
    java.lang.String keberangkatan, @org.jetbrains.annotations.NotNull()
    java.lang.String tujuan, @org.jetbrains.annotations.NotNull()
    java.lang.String tanggal, @org.jetbrains.annotations.NotNull()
    java.lang.String nomor_telepon, int anak_anak, int dewasa, int harga_tiket, @org.jetbrains.annotations.NotNull()
    java.lang.String kelas, @org.jetbrains.annotations.NotNull()
    java.lang.String status) {
    }
}