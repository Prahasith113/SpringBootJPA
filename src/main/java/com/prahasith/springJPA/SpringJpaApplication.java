package com.prahasith.springJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.prahasith.springJPA.dao.StudentRepository;
import com.prahasith.springJPA.entity.Student;

@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJpaApplication.class, args);

		StudentRepository studentRepository = context.getBean(StudentRepository.class);

		Student student = new Student();
		student.setName("sachin");
		student.setCity("mumbai");
		student.setHobbie("top order batsman");

		Student s1 = studentRepository.save(student);
		System.out.println(s1);

	}

}
