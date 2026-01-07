package com.prahasith.springJPA;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

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

//		Student student = new Student();
//		student.setName("sachin");
//		student.setCity("mumbai");
//		student.setHobbie("top order batsman");
//
//		Student s1 = studentRepository.save(student);
//		System.out.println(s1);
//
//		Student s2 = new Student();
//		s2.setName("rahul");
//		s2.setCity("bangalore");
//		s2.setHobbie("opening batsman");
//		
//		Student s3 = new Student();
//		s3.setName("hardik");
//		s3.setCity("mumbai");
//		s3.setHobbie("super striker");
//		
//		List<Student> ls = List.of(s2, s3);
//		
//		List<Student> resultList =  (List<Student>) studentRepository.saveAll(ls);
//		
//		resultList.forEach(res->{
//			System.out.println(res);
//		});

//  reading data from database
//		Optional<Student> option = studentRepository.findById(1);
//		Student stud = option.get();
//		System.out.println(stud);
//
//		Iterable<Student> students = studentRepository.findAll();
//		Iterator<Student> itr = students.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		
		
		
// deleting data
//		Optional<Student> option = studentRepository.findById(2);
//		Student stud = option.get();
//		studentRepository.delete(stud);
		
//		studentRepository.deleteAll();
		
//update data
//		Optional<Student> option = studentRepository.findById(3);
//		Student stud = option.get();
//		stud.setName("bumrah");
//		stud.setCity("ahmedabad");
//		stud.setHobbie("pace bowler");
//		
//		studentRepository.save(stud);
//	
		
		
//using @Query		
//		List<Student> selectAllStudents = studentRepository.selectAllStudents();
//		selectAllStudents.forEach(s->{
//			System.out.println(s);
//		});
		
//using @Query and @Param
//		List<Student> selectAllStudents = studentRepository.getStudent("virat");
//		selectAllStudents.forEach(s->{
//			System.out.println(s);
//		});
	}
}
