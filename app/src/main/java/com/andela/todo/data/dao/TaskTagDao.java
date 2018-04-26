package com.andela.todo.data.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.andela.todo.data.model.TaskTag;

import java.util.List;

@Dao
public interface TaskTagDao {
    @Insert
    void insert(TaskTag... taskTags);

    @Query("SELECT tag_id from task_tag WHERE task_id=:task_id")
    List<Integer> getTags(final int task_id);

}
