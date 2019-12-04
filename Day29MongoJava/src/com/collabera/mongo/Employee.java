package com.collabera.mongo;

import org.bson.types.ObjectId;

public class Employee {
	
	private ObjectId id;
	private String firstName;
	private String lastName;
	private int age;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(ObjectId id, String firstName, String lastName, int age) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public Employee(String firstName, String lastName, int age) {
		this(new ObjectId(), firstName, lastName, age);
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
	
	

}
