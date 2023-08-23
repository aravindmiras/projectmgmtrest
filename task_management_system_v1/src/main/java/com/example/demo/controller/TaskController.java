package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Task;
import com.example.demo.service.TaskService;

@RestController
public class TaskController {
	@Autowired
	TaskService ts;
	
	@PostMapping("post")
	public Task save(@RequestBody Task data) {
		return ts.save(data);
	}
	@GetMapping("id/{id}")
	public Task findById(@PathVariable int id) {
		return ts.findById(id);
	}
	@GetMapping("getem")
	public List<Task> findAll(){
		return ts.findAll();
	}
	@DeleteMapping("delete/{id}")
	public String deleteById(@PathVariable int id) {
		ts.deleteById(id);
		return "Deleted "+id+" successfully!";
	}
	@PutMapping("put/{id}")
	public Task saveAndFlush(@PathVariable int id, @RequestBody Task data) {
		return ts.saveAndFlush(new Task(id, data.getTaskName(), data.getTaskDescription(),data.getDueDate(),data.getAssignedTo(),data.getStatus(),data.getPriority(),data.getEstHrs(),data.getActHrs(),data.getNotes()));
	}
}
