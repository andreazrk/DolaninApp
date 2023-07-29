package com.example.pemesanantiket.database.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.pemesanantiket.model.ModelDatabase;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class DatabaseDao_Impl implements DatabaseDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ModelDatabase> __insertionAdapterOfModelDatabase;

  private final SharedSQLiteStatement __preparedStmtOfDeleteDataById;

  public DatabaseDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfModelDatabase = new EntityInsertionAdapter<ModelDatabase>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `tbl_travel` (`uid`,`nama_penumpang`,`keberangkatan`,`tujuan`,`tanggal`,`harga_tiket`,`anak_anak`,`dewasa`,`nomor_telepon`,`kelas`,`status`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ModelDatabase value) {
        stmt.bindLong(1, value.getUid());
        if (value.namaPenumpang == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.namaPenumpang);
        }
        if (value.keberangkatan == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.keberangkatan);
        }
        if (value.tujuan == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.tujuan);
        }
        if (value.tanggal == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.tanggal);
        }
        stmt.bindLong(6, value.getHargaTiket());
        stmt.bindLong(7, value.getAnakAnak());
        stmt.bindLong(8, value.getDewasa());
        if (value.nomorTelepon == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.nomorTelepon);
        }
        if (value.kelas == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.kelas);
        }
        if (value.status == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.status);
        }
      }
    };
    this.__preparedStmtOfDeleteDataById = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM tbl_travel WHERE uid= ?";
        return _query;
      }
    };
  }

  @Override
  public void insertData(final ModelDatabase... modelDatabases) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfModelDatabase.insert(modelDatabases);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteDataById(final int uid) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteDataById.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, uid);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteDataById.release(_stmt);
    }
  }

  @Override
  public LiveData<List<ModelDatabase>> getAllData() {
    final String _sql = "SELECT * FROM tbl_travel";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"tbl_travel"}, false, new Callable<List<ModelDatabase>>() {
      @Override
      public List<ModelDatabase> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
          final int _cursorIndexOfNamaPenumpang = CursorUtil.getColumnIndexOrThrow(_cursor, "nama_penumpang");
          final int _cursorIndexOfKeberangkatan = CursorUtil.getColumnIndexOrThrow(_cursor, "keberangkatan");
          final int _cursorIndexOfTujuan = CursorUtil.getColumnIndexOrThrow(_cursor, "tujuan");
          final int _cursorIndexOfTanggal = CursorUtil.getColumnIndexOrThrow(_cursor, "tanggal");
          final int _cursorIndexOfHargaTiket = CursorUtil.getColumnIndexOrThrow(_cursor, "harga_tiket");
          final int _cursorIndexOfAnakAnak = CursorUtil.getColumnIndexOrThrow(_cursor, "anak_anak");
          final int _cursorIndexOfDewasa = CursorUtil.getColumnIndexOrThrow(_cursor, "dewasa");
          final int _cursorIndexOfNomorTelepon = CursorUtil.getColumnIndexOrThrow(_cursor, "nomor_telepon");
          final int _cursorIndexOfKelas = CursorUtil.getColumnIndexOrThrow(_cursor, "kelas");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final List<ModelDatabase> _result = new ArrayList<ModelDatabase>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ModelDatabase _item;
            _item = new ModelDatabase();
            final int _tmpUid;
            _tmpUid = _cursor.getInt(_cursorIndexOfUid);
            _item.setUid(_tmpUid);
            if (_cursor.isNull(_cursorIndexOfNamaPenumpang)) {
              _item.namaPenumpang = null;
            } else {
              _item.namaPenumpang = _cursor.getString(_cursorIndexOfNamaPenumpang);
            }
            if (_cursor.isNull(_cursorIndexOfKeberangkatan)) {
              _item.keberangkatan = null;
            } else {
              _item.keberangkatan = _cursor.getString(_cursorIndexOfKeberangkatan);
            }
            if (_cursor.isNull(_cursorIndexOfTujuan)) {
              _item.tujuan = null;
            } else {
              _item.tujuan = _cursor.getString(_cursorIndexOfTujuan);
            }
            if (_cursor.isNull(_cursorIndexOfTanggal)) {
              _item.tanggal = null;
            } else {
              _item.tanggal = _cursor.getString(_cursorIndexOfTanggal);
            }
            final int _tmpHargaTiket;
            _tmpHargaTiket = _cursor.getInt(_cursorIndexOfHargaTiket);
            _item.setHargaTiket(_tmpHargaTiket);
            final int _tmpAnakAnak;
            _tmpAnakAnak = _cursor.getInt(_cursorIndexOfAnakAnak);
            _item.setAnakAnak(_tmpAnakAnak);
            final int _tmpDewasa;
            _tmpDewasa = _cursor.getInt(_cursorIndexOfDewasa);
            _item.setDewasa(_tmpDewasa);
            if (_cursor.isNull(_cursorIndexOfNomorTelepon)) {
              _item.nomorTelepon = null;
            } else {
              _item.nomorTelepon = _cursor.getString(_cursorIndexOfNomorTelepon);
            }
            if (_cursor.isNull(_cursorIndexOfKelas)) {
              _item.kelas = null;
            } else {
              _item.kelas = _cursor.getString(_cursorIndexOfKelas);
            }
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _item.status = null;
            } else {
              _item.status = _cursor.getString(_cursorIndexOfStatus);
            }
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
