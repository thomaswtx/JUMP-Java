package employeeapp;

import java.util.TreeMap;

public class Employee {
	
	private int id;
	private String lastName;
	private String firstName;
	private Department department;
	
	
	public Employee() {
		super();
	}
	public Employee(int id, String lastName, String firstName, Department department) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	// Copy the employee object being passed into the method and add it to the list
		public void addEmployee(int id, String lastName, String firstName, int dept) {
			
		}

	@Override
	public String toString() {
		return "ID:" + id + " Last Name: " + lastName + " First Name: " + firstName + " Department: "
				+ department + ".";
	}
}
