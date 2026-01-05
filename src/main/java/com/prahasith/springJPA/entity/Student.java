package com.prahasith.springJPA.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student table") // used to change the table name if not student is table name default.
public class Student {

	@Id // for primary key
	@GeneratedValue(strategy = GenerationType.AUTO) // for auto increment
	private int id;
	private String name;
	private String city;
	private String hobbie;

	// generate constructor, getters, setters and toString() methods

	public Student(int id, String name, String city, String hobbie) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.hobbie = hobbie;
	}

	public Student() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getHobbie() {
		return hobbie;
	}

	public void setHobbie(String hobbie) {
		this.hobbie = hobbie;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", hobbie=" + hobbie + "]";
	}

}