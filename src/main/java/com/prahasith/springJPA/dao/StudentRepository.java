package com.prahasith.springJPA.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.prahasith.springJPA.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

	// custom methods these are automatically implemented by JPA as per our entity
	// values;
	public List<Student> findByName(String name);

	public List<Student> findByCity(String city);

	public List<Student> findByHobbie(String hobbie);

	// https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html

	// we use custom JPQL or native SQL query to access DB
	// annotations used @Query @Param

	// Uses ENTITY name: Student
	@Query("SELECT s FROM Student s")
	public List<Student> getAllStudents();

	@Query("SELECT s FROM Student s WHERE s.name = :n")
	public List<Student> getStudent(@Param("n") String name);

	@Query(value = "SELECT * FROM `student table`", nativeQuery = true)
	public List<Student> selectAllStudents();

}
