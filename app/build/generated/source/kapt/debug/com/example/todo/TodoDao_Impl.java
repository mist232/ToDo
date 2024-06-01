package com.example.todo;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TodoDao_Impl implements TodoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<TodoModel> __insertionAdapterOfTodoModel;

  private final EntityDeletionOrUpdateAdapter<TodoModel> __updateAdapterOfTodoModel;

  private final SharedSQLiteStatement __preparedStmtOfFinishTask;

  private final SharedSQLiteStatement __preparedStmtOfDeleteTask;

  public TodoDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTodoModel = new EntityInsertionAdapter<TodoModel>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `TodoModel` (`title`,`category`,`date`,`time`,`isFinished`,`id`) VALUES (?,?,?,?,?,nullif(?, 0))";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final TodoModel entity) {
        if (entity.getTitle() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getTitle());
        }
        if (entity.getCategory() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getCategory());
        }
        statement.bindLong(3, entity.getDate());
        statement.bindLong(4, entity.getTime());
        statement.bindLong(5, entity.isFinished());
        statement.bindLong(6, entity.getId());
      }
    };
    this.__updateAdapterOfTodoModel = new EntityDeletionOrUpdateAdapter<TodoModel>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `TodoModel` SET `title` = ?,`category` = ?,`date` = ?,`time` = ?,`isFinished` = ?,`id` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final TodoModel entity) {
        if (entity.getTitle() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getTitle());
        }
        if (entity.getCategory() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getCategory());
        }
        statement.bindLong(3, entity.getDate());
        statement.bindLong(4, entity.getTime());
        statement.bindLong(5, entity.isFinished());
        statement.bindLong(6, entity.getId());
        statement.bindLong(7, entity.getId());
      }
    };
    this.__preparedStmtOfFinishTask = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "Update TodoModel Set isFinished = 1 where id=?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteTask = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "Delete from TodoModel where id=?";
        return _query;
      }
    };
  }

  @Override
  public Object insertTask(final TodoModel todoModel,
      final Continuation<? super Long> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      @NonNull
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          final Long _result = __insertionAdapterOfTodoModel.insertAndReturnId(todoModel);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object updateTask(final TodoModel todo, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfTodoModel.handle(todo);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public void finishTask(final long uid) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfFinishTask.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, uid);
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfFinishTask.release(_stmt);
    }
  }

  @Override
  public void deleteTask(final long uid) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteTask.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, uid);
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeleteTask.release(_stmt);
    }
  }

  @Override
  public LiveData<List<TodoModel>> getTask() {
    final String _sql = "Select * from TodoModel where isFinished == 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[] {"TodoModel"}, false, new Callable<List<TodoModel>>() {
      @Override
      @Nullable
      public List<TodoModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final int _cursorIndexOfIsFinished = CursorUtil.getColumnIndexOrThrow(_cursor, "isFinished");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<TodoModel> _result = new ArrayList<TodoModel>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final TodoModel _item;
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            final long _tmpDate;
            _tmpDate = _cursor.getLong(_cursorIndexOfDate);
            final long _tmpTime;
            _tmpTime = _cursor.getLong(_cursorIndexOfTime);
            final int _tmpIsFinished;
            _tmpIsFinished = _cursor.getInt(_cursorIndexOfIsFinished);
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            _item = new TodoModel(_tmpTitle,_tmpCategory,_tmpDate,_tmpTime,_tmpIsFinished,_tmpId);
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

  @Override
  public LiveData<TodoModel> getTask(final long uid) {
    final String _sql = "SELECT * FROM TodoModel WHERE id = ? AND isFinished = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, uid);
    return __db.getInvalidationTracker().createLiveData(new String[] {"TodoModel"}, false, new Callable<TodoModel>() {
      @Override
      @Nullable
      public TodoModel call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final int _cursorIndexOfIsFinished = CursorUtil.getColumnIndexOrThrow(_cursor, "isFinished");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final TodoModel _result;
          if (_cursor.moveToFirst()) {
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            final long _tmpDate;
            _tmpDate = _cursor.getLong(_cursorIndexOfDate);
            final long _tmpTime;
            _tmpTime = _cursor.getLong(_cursorIndexOfTime);
            final int _tmpIsFinished;
            _tmpIsFinished = _cursor.getInt(_cursorIndexOfIsFinished);
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            _result = new TodoModel(_tmpTitle,_tmpCategory,_tmpDate,_tmpTime,_tmpIsFinished,_tmpId);
          } else {
            _result = null;
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

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
