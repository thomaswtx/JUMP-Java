package com.collabera.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import com.collabera.dao.EmployeeDao;
import com.collabera.utils.JdbcUtils;
import com.collabera.model.Employee;

public class EmployeeDao {

	private static HashMap<Integer, Employee> cache = new HashMap<Integer, Employee>();

	public static List<Employee> getAllEmployees() throws SQLException {

		List<Employee> list = new ArrayList<Employee>();

		Connection connect = null;
		PreparedStatement pstmt = null;
		
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/week5", "root", "root");

		pstmt = connect.prepareStatement("SELECT * FROM employees");
		try {
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Employee e = resultSetToEmployee (rs);
				list.add(e);
			} 
		} catch (SQLException sqle) {
			System.out.println(sqle.getMessage());
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

	public static List<Employee> getList(int pageNo, int pageSize) throws SQLException {
		
		return getAllEmployees()
				.stream()
				.skip((pageNo-1)*pageSize)
				.limit(pageSize)
				.collect(Collectors.toList());

	}

	private static Employee resultSetToEmployee(ResultSet rs) throws SQLException {
		Employee employee = null;

		Integer id = rs.getInt("id");

		if(cache.containsKey(id)) {
			employee = cache.get(id);
		} else {
			employee = new Employee();
		}

		employee.setId(rs.getInt("id"));
		employee.setLastName(rs.getString("lastName"));
		employee.setFirstName(rs.getString("firstName"));		

		return employee;
	}

	public static boolean insert(Employee employee) throws SQLException {
		
		if(employee == null) {
			return false;
		}
		
		Connection connect = null;
		PreparedStatement pstmt = null;
		
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		connect = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/week5", "root", "root");

		pstmt = connect
				.prepareStatement("INSERT INTO employees(firstName, lastName) VALUES (?, ?);");
		
		pstmt.setString(1, employee.getFirstName());
		pstmt.setString(2, employee.getLastName());
		
		int count = 0;
		try {
			count = pstmt.executeUpdate();
			
		} catch (SQLException sqle) {
			System.out.println(sqle.getMessage());
		} finally {
			pstmt.close();
		}

		return count > 0;
	}
	
public static boolean update(Employee employee) throws SQLException {
		
		if(employee == null) {
			return false;
		}
		
		Connection connect = null;
		PreparedStatement pstmt = null;
		
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		connect = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/week5", "root", "root");

		pstmt = connect
				.prepareStatement("UPDATE employees "
						+ "SET firstName = ? , lastName = ? WHERE id = ?");
		
		pstmt.setString(1, employee.getFirstName());
		pstmt.setString(2, employee.getLastName());
		pstmt.setInt(3, employee.getId());
		
		int count = 0;
		try {
			count = pstmt.executeUpdate();
			
		} catch (SQLException sqle) {
			System.out.println(sqle.getMessage());
		} finally {
			pstmt.close();
		}

		return count > 0;
	}

		public static boolean delete(int id) throws SQLException {
			Connection connect = null;
			PreparedStatement pstmt = null;
			
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			connect = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/week5", "root", "root");

			pstmt = connect
					.prepareStatement("DELETE FROM employees WHERE id = ?");
			
			pstmt.setInt(1, id);
			
			int count = 0;
			try {
				count = pstmt.executeUpdate();
			} catch (SQLException sqle) {
				System.out.println(sqle.getMessage());
			} finally {
				pstmt.close();
			}
			
			return count > 0;
			
		}

	public static Employee getEmployee(int id) throws SQLException {
		
		for(Employee e : EmployeeDao.getAllEmployees()) {
			if(e.getId() == id) {
				return e;
			}			
		}
		
		return null;
		
	}

	public static int getTotalRecords() throws SQLException {
		return getAllEmployees().size();
	}
}