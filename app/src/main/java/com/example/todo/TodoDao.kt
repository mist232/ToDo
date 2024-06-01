package com.example.todo
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface TodoDao {


    @Insert()
    suspend  fun insertTask(todoModel: TodoModel): Long

    @Query("Select * from TodoModel where isFinished == 0")
    fun getTask():LiveData<List<TodoModel>>

    @Query("Update TodoModel Set isFinished = 1 where id=:uid")
    fun finishTask(uid:Long)

    @Query("Delete from TodoModel where id=:uid")
    fun deleteTask(uid:Long)

    @Update
    suspend fun updateTask(todo: TodoModel)
    @Query("SELECT * FROM TodoModel WHERE id = :uid AND isFinished = 0")
    fun getTask(uid: Long): LiveData<TodoModel>



}