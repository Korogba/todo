package com.andela.todo.data.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.andela.todo.data.model.Task;

import java.util.List;

@Dao
public interface TaskDao {
    @Insert
    void insertTask(Task... task);

    @Delete
    void deleteTask(int tag_id);

    @Update
    void updateTask(Task... tasks);

    //get all the task by a user
    @Query("SELECT * FROM user WHERE user_id=:user_id")
    List<Task> getTasksByUser(final int user_id);

    //get a single task detail
    @Query("SELECT * FROM task WHERE task_id=:task_id")
    Task getSingleTask(int task_id);

}
