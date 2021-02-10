package com.kalle.tasktrackerapi.repo;

import org.springframework.data.repository.CrudRepository;

import com.kalle.tasktrackerapi.model.Task;

public interface TaskRepository extends CrudRepository<Task, Integer> {

}
