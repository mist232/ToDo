package com.example.todo;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\'J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0019\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/example/todo/TodoDao;", "", "deleteTask", "", "uid", "", "finishTask", "getTask", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/todo/TodoModel;", "insertTask", "todoModel", "(Lcom/example/todo/TodoModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTask", "todo", "app_debug"})
@androidx.room.Dao
public abstract interface TodoDao {
    
    @androidx.room.Insert
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertTask(@org.jetbrains.annotations.NotNull
    com.example.todo.TodoModel todoModel, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Query(value = "Select * from TodoModel where isFinished == 0")
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.todo.TodoModel>> getTask();
    
    @androidx.room.Query(value = "Update TodoModel Set isFinished = 1 where id=:uid")
    public abstract void finishTask(long uid);
    
    @androidx.room.Query(value = "Delete from TodoModel where id=:uid")
    public abstract void deleteTask(long uid);
    
    @androidx.room.Update
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateTask(@org.jetbrains.annotations.NotNull
    com.example.todo.TodoModel todo, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM TodoModel WHERE id = :uid AND isFinished = 0")
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<com.example.todo.TodoModel> getTask(long uid);
}