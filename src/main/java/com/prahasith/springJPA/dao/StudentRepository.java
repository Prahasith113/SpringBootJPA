package com.prahasith.springJPA.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.prahasith.springJPA.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {
	
	// custom methods these are automatically implemented by JPA as per our entity values;
	public List<Student> findByName(String name);
	public List<Student> findByCity(String city);
	public List<Student> findByHobbie(String hobbie);
}
