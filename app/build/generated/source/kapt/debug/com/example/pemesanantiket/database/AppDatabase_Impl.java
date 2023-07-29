package com.example.pemesanantiket.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.example.pemesanantiket.database.dao.DatabaseDao;
import com.example.pemesanantiket.database.dao.DatabaseDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile DatabaseDao _databaseDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `tbl_travel` (`uid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `nama_penumpang` TEXT NOT NULL, `keberangkatan` TEXT NOT NULL, `tujuan` TEXT NOT NULL, `tanggal` TEXT NOT NULL, `harga_tiket` INTEGER NOT NULL, `anak_anak` INTEGER NOT NULL, `dewasa` INTEGER NOT NULL, `nomor_telepon` TEXT NOT NULL, `kelas` TEXT NOT NULL, `status` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6baf8f6032b9d2032dd358d40aacee7e')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `tbl_travel`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsTblTravel = new HashMap<String, TableInfo.Column>(11);
        _columnsTblTravel.put("uid", new TableInfo.Column("uid", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTblTravel.put("nama_penumpang", new TableInfo.Column("nama_penumpang", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTblTravel.put("keberangkatan", new TableInfo.Column("keberangkatan", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTblTravel.put("tujuan", new TableInfo.Column("tujuan", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTblTravel.put("tanggal", new TableInfo.Column("tanggal", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTblTravel.put("harga_tiket", new TableInfo.Column("harga_tiket", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTblTravel.put("anak_anak", new TableInfo.Column("anak_anak", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTblTravel.put("dewasa", new TableInfo.Column("dewasa", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTblTravel.put("nomor_telepon", new TableInfo.Column("nomor_telepon", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTblTravel.put("kelas", new TableInfo.Column("kelas", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTblTravel.put("status", new TableInfo.Column("status", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTblTravel = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTblTravel = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTblTravel = new TableInfo("tbl_travel", _columnsTblTravel, _foreignKeysTblTravel, _indicesTblTravel);
        final TableInfo _existingTblTravel = TableInfo.read(_db, "tbl_travel");
        if (! _infoTblTravel.equals(_existingTblTravel)) {
          return new RoomOpenHelper.ValidationResult(false, "tbl_travel(com.example.pemesanantiket.model.ModelDatabase).\n"
                  + " Expected:\n" + _infoTblTravel + "\n"
                  + " Found:\n" + _existingTblTravel);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "6baf8f6032b9d2032dd358d40aacee7e", "cf1a58ce977551dc63d4d0733d482f4f");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "tbl_travel");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `tbl_travel`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(DatabaseDao.class, DatabaseDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public DatabaseDao databaseDao() {
    if (_databaseDao != null) {
      return _databaseDao;
    } else {
      synchronized(this) {
        if(_databaseDao == null) {
          _databaseDao = new DatabaseDao_Impl(this);
        }
        return _databaseDao;
      }
    }
  }
}
