package com.dd.repository;

import org.springframework.data.repository.CrudRepository;

import com.dd.model.Task;

import java.util.List;

public interface TaskRepository extends CrudRepository<Task, Integer> {

    List<Task> findByStatus(String status);

    List<Task> findByUserIdAndStatus(int userId,  String status);

}