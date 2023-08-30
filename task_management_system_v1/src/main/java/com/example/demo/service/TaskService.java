package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Users;
import com.example.demo.repository.ProjectRepo;
import com.example.demo.repository.TaskRepo;
import com.example.demo.repository.UserRepo;

@Service
public class TaskService {
	@Autowired
	UserRepo ur;
	@Autowired
	TaskRepo tr;
	@Autowired
	ProjectRepo pr;
	
	
	public Users save(Users data) {
		return ur.save(data);
	}
	public List<Users> findAll(){
		return ur.findAll();
	}
	public Users findById(int id) {
		return ur.findById(id).orElse(null);
	}
	public void deleteById(int id) {
		ur.deleteById(id);
	}
	public Users saveAndFlush(Users data) {
		return ur.saveAndFlush(data);
	}
	public void deleteAll() {
		ur.deleteAll();
	}
	public List<Users> getbypage(int pgno, int pgsize){
		Page<Users>p=ur.findAll(PageRequest.of(pgno, pgsize));
		return p.getContent();
	}
	public List<Users> sortbyatr(int pgno, int pgsize, String s){
		PageRequest pageable= PageRequest.of(pgno, pgsize, Sort.by(Sort.Direction.ASC,s));
		Page<Users>childrenPage=ur.findAll(pageable);
		return childrenPage.getContent();
	}
	public List<Users> findbyname(String name){
		return ur.getbyfn(name);
	}
}
