package com.andela.todo.data.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;

import com.andela.todo.data.model.Tag;

@Dao
public interface TagDao {
    @Insert
    void createTag(Tag... tag);

    @Delete
    void deleteTag(int tag_id);

}
