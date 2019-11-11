package com.collabera.jdbc.dao;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;
import com.collabera.jdbc.model.Employee;
import com.collabera.jdbc.utils.JdbcUtils;

public class EmployeeDao {
	
	// Logger
	private static final Logger logger = Logger.getLogger(EmployeeDao.class.getName());
	// Cache
	private static HashMap<Integer, Employee> cache = new HashMap<Integer, Employee>();
	
	public List<Employee> getAllEmployees() throws SQLException {
		
		List<Employee> list = new ArrayList<Employee>();
		PreparedStatement pstmt = JdbcUtils.getConnection()
				.prepareStatement("SELECT * FROM employees");
		try {
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Employee e = resultSetToEmployee (rs);
				list.add(e);
			} 
			// Print all employees from list
			System.out.println("*********ALL EMPLOYEES*********");
			for(Employee l :  list) {
				System.out.println(l.toString());
			}
		} catch (SQLException sqle) {
			logger.error("error executing: " + sqle);
		} finally {
			if(pstmt!= null) 
				try {
					pstmt.close();
				} catch (SQLException e) {
					/*ignore it */
				}
		}
		return list;
	}
	
	public boolean insert (Employee emp) throws SQLException {
		
		if(emp == null) {
			return false;
		}
		PreparedStatement statement = JdbcUtils.getConnection()
				.prepareStatement("INSERT INTO employees(employee_id, lastName, firstName, department_id) VALUES(?, ?, ?, ?);");
			
		System.out.println(emp.toString());
		statement.setInt(1,  emp.getId());
		statement.setString(2,  emp.getLastName());
		statement.setString(3,  emp.getFirstName());
		statement.setInt(4, emp.getDepartment().getValue());
		
		int count = 0;
		try {
			count = statement.executeUpdate();
		} catch (SQLException sqle) {
			logger.debug(sqle.getMessage());
			logger.debug(sqle.getStackTrace());
			logger.error("error executing insert for employee: " + emp);
			System.out.println(sqle.getStackTrace().toString());
			
		} finally {
			statement.close();
		}
		return count > 0;
		
	}
	
	public boolean delete (int id) throws SQLException {

		PreparedStatement statement = JdbcUtils.getConnection().
				prepareStatement("DELETE FROM employees WHERE employee_id = ?");
		statement.setInt(1,  id);

		int count = 0;
		try {
			count = statement.executeUpdate();
		} catch (SQLException sqle) {
			logger.error("error executing delete for id: " + id);
			logger.debug(sqle.getMessage());
		} finally {
			statement.close();
		}
		return count > 0;
	}
	
	private Employee resultSetToEmployee(ResultSet rs) throws SQLException {
		Employee employee = null;

		Integer id = rs.getInt("employee_id");
		Department[] depts = Department.values();
		
		if (cache.containsKey(id)) {
			employee = cache.get(id);
		} else {
			employee = new Employee();
		}

		employee.setId(rs.getInt("employee_id"));
		employee.setLastName(rs.getString("lastName"));
		employee.setFirstName(rs.getString("firstName"));		
		employee.setDepartment(depts[rs.getInt("department_id")-1]);

		logger.info("Employee with id: " + employee.getId());

		return employee;
	}
	
	public static void main( String[] args ) throws IOException {
	
		// TESTING THE EMPLOYEEDAO
		logger.info("Testing EmployeeDao...");
		EmployeeDao employeeDao = new EmployeeDao();
		
		/** GET ALL EMPLOYEES TEST **/
		try {
			employeeDao = new EmployeeDao();
			employeeDao.getAllEmployees();
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		
		/** INSERT EMPLOYEE TEST **/
		try {
			Employee employee = new Employee(3, "Smith", "John", Department.ACCOUNTING);
			boolean success = employeeDao.insert(employee);
			if(success) {
				logger.info("SUCCESS: Employee inserted: " + employee.toString());
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		
		/** DELETE EMPLOYEE TEST **/
		try {
			Integer id = 3;
			boolean success = employeeDao.delete(id);
			if(success) {
				logger.info("SUCCESS: Employee deleted with id: " + id); 
			} else {
				logger.info("DELETE FAILED!");
			}
		} catch (Exception e) {
			logger.debug(e.getMessage());
		}
	}
}
