package com.andela.todo.data.source;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.andela.todo.data.dao.UserDao;
import com.andela.todo.data.model.Tag;
import com.andela.todo.data.model.Task;
import com.andela.todo.data.model.TaskTag;
import com.andela.todo.data.model.User;

@Database(entities = {User.class, Task.class, Tag.class, TaskTag.class}, version = 1)
public abstract class LocalDatabase extends RoomDatabase {

    private static LocalDatabase instance;

    public abstract UserDao mUserDao();

    public static LocalDatabase getInstance(Context context){
        if(instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    LocalDatabase.class, "todo").build();
        }
        return instance;
    }

}
