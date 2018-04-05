package com.andela.todo.data.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;

import com.andela.todo.data.model.User;

@Dao
public interface UserDao {
    @Insert
    void insertAll(User... users);
}
