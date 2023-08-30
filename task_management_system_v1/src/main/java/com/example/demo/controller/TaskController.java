package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.Users;
import com.example.demo.service.TaskService;

@RestController
public class TaskController {
	@Autowired
	TaskService ts;
	
	@PostMapping("post")
	public Users save(@RequestBody Users  data) {
		return ts.save(data);
	}
	@GetMapping("id/{id}")
	public Users findById(@PathVariable int id) {
		return ts.findById(id);
	}
	@GetMapping("getem")
	public List<Users> findAll(){
		return ts.findAll();
	}
	@DeleteMapping("delete/{id}")
	public String deleteById(@PathVariable int id) {
		ts.deleteById(id);
		return "Deleted "+id+" successfully!";
	}
	@DeleteMapping("delete")
	public String deleteAll() {
		ts.deleteAll();
		return "Deleted all data successfully!";
	}
	@GetMapping("get/{pgno}/{pgsize}")
	public List<Users> page(@PathVariable int pgno, @PathVariable int pgsize){
		return ts.getbypage(pgno, pgsize);
	}
	@GetMapping("sort/{pgno}/{pgsize}/{s}")
	public List<Users> sortbypage(@PathVariable int pgno, @PathVariable int pgsize, @PathVariable String s){
		return ts.sortbyatr(pgno, pgsize, s);
	}
	@GetMapping("name/{firstname}")
	public List<Users> getbyfirstname(@PathVariable String firstname){
		return ts.findbyname(firstname);
	}
}
