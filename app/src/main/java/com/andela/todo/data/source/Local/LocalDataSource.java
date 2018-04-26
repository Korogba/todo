package com.andela.todo.data.source.Local;

import com.andela.todo.data.Repo.DataAccess;
import com.andela.todo.data.dao.TagDao;
import com.andela.todo.data.dao.TaskDao;
import com.andela.todo.data.dao.UserDao;
import com.andela.todo.data.model.Tag;
import com.andela.todo.data.model.Task;

import java.util.List;

public class LocalDataSource implements DataAccess{
    TaskDao mtaskDao;
    UserDao mUserDao;
    TagDao mTagDao;


    @Override
    public Task getTask(int task_id) {
        return null;
    }

    @Override
    public Tag getTags(int task_id) {
        return null;
    }

    @Override
    public List<Task> getAllTaskByUser(int user_id) {
        return null;
    }

    @Override
    public boolean deleteTask(int task_id) {
        return false;
    }

    @Override
    public boolean deleteTag(int tag_id) {
        return false;
    }

    @Override
    public boolean deleteManyTags(List<Tag> tag) {
        return false;
    }

    @Override
    public boolean deleteManyTask(List<Task> tasks) {
        return false;
    }

    @Override
    public boolean updateTask(Task task) {
        return false;
    }

    @Override
    public boolean createTask(Task task) {
        return false;
    }

    @Override
    public boolean createTag(Tag tag) {
        return false;
    }
}
