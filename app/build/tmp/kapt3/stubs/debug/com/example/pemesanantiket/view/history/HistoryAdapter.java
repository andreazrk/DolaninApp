package com.example.pemesanantiket.view.history;

import java.lang.System;

/**
 * Class adapter ini untuk menghubungkan database ke activity yang sudah kita buat
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0018B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u001c\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u0014\u0010\u0014\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016J\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000bR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006\u00a8\u0006\u0019"}, d2 = {"Lcom/example/pemesanantiket/view/history/HistoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/pemesanantiket/view/history/HistoryAdapter$ViewHolder;", "modelDatabase", "", "Lcom/example/pemesanantiket/model/ModelDatabase;", "(Ljava/util/List;)V", "getModelDatabase", "()Ljava/util/List;", "setModelDatabase", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setDataAdapter", "items", "", "setSwipeRemove", "ViewHolder", "app_debug"})
public final class HistoryAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.pemesanantiket.view.history.HistoryAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.pemesanantiket.model.ModelDatabase> modelDatabase;
    
    public HistoryAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.pemesanantiket.model.ModelDatabase> modelDatabase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.pemesanantiket.model.ModelDatabase> getModelDatabase() {
        return null;
    }
    
    public final void setModelDatabase(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.pemesanantiket.model.ModelDatabase> p0) {
    }
    
    public final void setDataAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.pemesanantiket.model.ModelDatabase> items) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.pemesanantiket.view.history.HistoryAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.pemesanantiket.view.history.HistoryAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.pemesanantiket.model.ModelDatabase setSwipeRemove(int position) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\"\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\"\u0010\u000f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR\"\u0010\u0012\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR\"\u0010\u0015\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR\"\u0010\u0018\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR\"\u0010\u001b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000bR\"\u0010\u001e\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010\u000b\u00a8\u0006!"}, d2 = {"Lcom/example/pemesanantiket/view/history/HistoryAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/example/pemesanantiket/view/history/HistoryAdapter;Landroid/view/View;)V", "tvDate", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getTvDate", "()Landroid/widget/TextView;", "setTvDate", "(Landroid/widget/TextView;)V", "tvHargaTiket", "getTvHargaTiket", "setTvHargaTiket", "tvKeberangkatan", "getTvKeberangkatan", "setTvKeberangkatan", "tvKelas", "getTvKelas", "setTvKelas", "tvKode1", "getTvKode1", "setTvKode1", "tvKode2", "getTvKode2", "setTvKode2", "tvNama", "getTvNama", "setTvNama", "tvTujuan", "getTvTujuan", "setTvTujuan", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private android.widget.TextView tvKelas;
        private android.widget.TextView tvDate;
        private android.widget.TextView tvNama;
        private android.widget.TextView tvHargaTiket;
        private android.widget.TextView tvKode1;
        private android.widget.TextView tvKode2;
        private android.widget.TextView tvKeberangkatan;
        private android.widget.TextView tvTujuan;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final android.widget.TextView getTvKelas() {
            return null;
        }
        
        public final void setTvKelas(android.widget.TextView p0) {
        }
        
        public final android.widget.TextView getTvDate() {
            return null;
        }
        
        public final void setTvDate(android.widget.TextView p0) {
        }
        
        public final android.widget.TextView getTvNama() {
            return null;
        }
        
        public final void setTvNama(android.widget.TextView p0) {
        }
        
        public final android.widget.TextView getTvHargaTiket() {
            return null;
        }
        
        public final void setTvHargaTiket(android.widget.TextView p0) {
        }
        
        public final android.widget.TextView getTvKode1() {
            return null;
        }
        
        public final void setTvKode1(android.widget.TextView p0) {
        }
        
        public final android.widget.TextView getTvKode2() {
            return null;
        }
        
        public final void setTvKode2(android.widget.TextView p0) {
        }
        
        public final android.widget.TextView getTvKeberangkatan() {
            return null;
        }
        
        public final void setTvKeberangkatan(android.widget.TextView p0) {
        }
        
        public final android.widget.TextView getTvTujuan() {
            return null;
        }
        
        public final void setTvTujuan(android.widget.TextView p0) {
        }
    }
}