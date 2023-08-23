package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Task;
import com.example.demo.repository.TaskRepo;

@Service
public class TaskService {
	@Autowired
	TaskRepo tr;
	public Task save(Task data) {
		return tr.save(data);
	}
	public List<Task> findAll(){
		return tr.findAll();
	}
	public Task findById(int id) {
		return tr.findById(id).orElse(null);
	}
	public void deleteById(int id) {
		tr.deleteById(id);
	}
	public Task saveAndFlush(Task data) {
		return tr.saveAndFlush(data);
	}
}
