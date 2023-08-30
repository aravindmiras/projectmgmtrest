package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Users;

public interface UserRepo extends JpaRepository<Users, Integer> {
	@Query(value="select * from usertable where firstname=:fn", nativeQuery = true)
	public List<Users> getbyfn(@Param("fn") String fn);
}
