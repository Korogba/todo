package com.andela.todo.data.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

@Entity(foreignKeys = {@ForeignKey(entity = Tag.class, parentColumns = "tag_id", childColumns = "tag_id"),
        @ForeignKey(entity = Task.class, parentColumns = "task_id", childColumns = "task_id")})

public class TaskTag {

    @PrimaryKey
    private int id;

    @ColumnInfo(name = "tag_id")
    private int tag_id;

    @ColumnInfo(name = "task_id")
    private int task_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTag_id() {
        return tag_id;
    }

    public void setTag_id(int tag_id) {
        this.tag_id = tag_id;
    }

    public int getTask_id() {
        return task_id;
    }

    public void setTask_id(int task_id) {
        this.task_id = task_id;
    }
}
