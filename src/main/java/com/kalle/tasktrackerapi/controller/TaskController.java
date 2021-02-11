package com.kalle.tasktrackerapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kalle.tasktrackerapi.model.Task;
import com.kalle.tasktrackerapi.repo.TaskRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/task_api")
public class TaskController {
	
	@Autowired
	TaskRepository repo;
	
	/*
	 * Hae tehtävät
	 */
	@GetMapping(path = "/getTasks", produces="application/json")
	public Iterable<Task> getTasks() {
		return repo.findAll();
	}
	
	/*
	 * Lisää tehtävä
	 */
	@PostMapping(path = "/saveTask")
	public void saveTask(String task) {
		System.out.println(task);
	}
	
	/*
	 * Poista tehtävä
	 */
}
