package com.andela.todo.data.Repo;

import com.andela.todo.data.model.Tag;
import com.andela.todo.data.model.Task;

import java.util.List;

public interface DataAccess {
    //get a single task
    Task getTask(int task_id);

    //get all tags for a part. task
    Tag getTags(int task_id);

    //get all task by a user
    List<Task> getAllTaskByUser(int user_id);

    boolean deleteTask(int task_id);

    boolean deleteTag(int tag_id);

    boolean deleteManyTags(List<Tag> tag);

    boolean deleteManyTask(List<Task> tasks);

    boolean updateTask(Task task);

    boolean createTask(Task task);

    boolean createTag(Tag tag);


}

