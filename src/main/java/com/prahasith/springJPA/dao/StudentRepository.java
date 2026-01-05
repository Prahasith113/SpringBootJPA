package com.prahasith.springJPA.dao;

import org.springframework.data.repository.CrudRepository;

import com.prahasith.springJPA.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {
	
}
