package com.dd.service;


import com.dd.model.Task;

import java.util.List;


public interface TaskService {

    Task save(Task task);

    Boolean delete(int id);

    Task update(Task task);

    Task findById(int id);

    List<Task> findAll();

    List<Task> findByStatus(String status);

    List<Task> findByUserIdStatus(int userId, String status);


}
