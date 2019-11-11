package com.collabera.jdbc.dao;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import com.collabera.jdbc.model.Employee;

public class EmployeeDaoInsertTest {
	
	@Test
	public void testInsert() {
		EmployeeDao employeeDao = new EmployeeDao();
		boolean inserted = false;
		try {
			inserted = employeeDao
					.insert(new Employee(46, "Jon6", "Snow6", Department.DEVELOPMENT));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		assertTrue(inserted);
	}
}
