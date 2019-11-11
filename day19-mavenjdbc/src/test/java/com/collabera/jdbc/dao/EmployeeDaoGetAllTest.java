package com.collabera.jdbc.dao;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import com.collabera.jdbc.model.*;

public class EmployeeDaoGetAllTest {
	
	@Test
	public void testGetAllEmployees() {
		EmployeeDao employeeDao = new EmployeeDao();
		List<Employee> list  = new ArrayList<Employee>();
		try {
			list = employeeDao.getAllEmployees();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		for(Employee e : list) {
			System.out.println(e);
			System.out.println("--------------------------------------------------------");
			assertTrue(list.size()>0);
		}	
	}
}
