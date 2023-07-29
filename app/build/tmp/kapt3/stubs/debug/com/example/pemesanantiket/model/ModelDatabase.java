package com.example.pemesanantiket.model;

import java.lang.System;

/**
 * Berisikan databse seperti namaPenumpang, keberangkatan dan lainnya
 */
@androidx.room.Entity(tableName = "tbl_travel")
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001e\u0010\u0018\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001e\u0010\u001b\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\u001e\u0010\u001e\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u001e\u0010!\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0012\"\u0004\b#\u0010\u0014R\u001e\u0010$\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014R\u001e\u0010\'\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\b\u00a8\u0006*"}, d2 = {"Lcom/example/pemesanantiket/model/ModelDatabase;", "Ljava/io/Serializable;", "()V", "anakAnak", "", "getAnakAnak", "()I", "setAnakAnak", "(I)V", "dewasa", "getDewasa", "setDewasa", "hargaTiket", "getHargaTiket", "setHargaTiket", "keberangkatan", "", "getKeberangkatan", "()Ljava/lang/String;", "setKeberangkatan", "(Ljava/lang/String;)V", "kelas", "getKelas", "setKelas", "namaPenumpang", "getNamaPenumpang", "setNamaPenumpang", "nomorTelepon", "getNomorTelepon", "setNomorTelepon", "status", "getStatus", "setStatus", "tanggal", "getTanggal", "setTanggal", "tujuan", "getTujuan", "setTujuan", "uid", "getUid", "setUid", "app_debug"})
public final class ModelDatabase implements java.io.Serializable {
    @androidx.room.ColumnInfo(name = "uid")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int uid = 0;
    @androidx.room.ColumnInfo(name = "nama_penumpang")
    public java.lang.String namaPenumpang;
    @androidx.room.ColumnInfo(name = "keberangkatan")
    public java.lang.String keberangkatan;
    @androidx.room.ColumnInfo(name = "tujuan")
    public java.lang.String tujuan;
    @androidx.room.ColumnInfo(name = "tanggal")
    public java.lang.String tanggal;
    @androidx.room.ColumnInfo(name = "harga_tiket")
    private int hargaTiket = 0;
    @androidx.room.ColumnInfo(name = "anak_anak")
    private int anakAnak = 0;
    @androidx.room.ColumnInfo(name = "dewasa")
    private int dewasa = 0;
    @androidx.room.ColumnInfo(name = "nomor_telepon")
    public java.lang.String nomorTelepon;
    @androidx.room.ColumnInfo(name = "kelas")
    public java.lang.String kelas;
    @androidx.room.ColumnInfo(name = "status")
    public java.lang.String status;
    
    public ModelDatabase() {
        super();
    }
    
    public final int getUid() {
        return 0;
    }
    
    public final void setUid(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNamaPenumpang() {
        return null;
    }
    
    public final void setNamaPenumpang(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKeberangkatan() {
        return null;
    }
    
    public final void setKeberangkatan(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTujuan() {
        return null;
    }
    
    public final void setTujuan(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTanggal() {
        return null;
    }
    
    public final void setTanggal(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getHargaTiket() {
        return 0;
    }
    
    public final void setHargaTiket(int p0) {
    }
    
    public final int getAnakAnak() {
        return 0;
    }
    
    public final void setAnakAnak(int p0) {
    }
    
    public final int getDewasa() {
        return 0;
    }
    
    public final void setDewasa(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNomorTelepon() {
        return null;
    }
    
    public final void setNomorTelepon(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKelas() {
        return null;
    }
    
    public final void setKelas(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
}