package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Projects;


public interface ProjectRepo extends JpaRepository<Projects, Integer> {

}
