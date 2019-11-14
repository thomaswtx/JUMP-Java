package com.collabera.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.collabera.model.Employee;

public class EmployeeDao {
	static Map<Integer, Employee> employeeMap = new TreeMap<Integer, Employee>();
	static {
		for(int i = 0; i < 50; i++) {
			employeeMap.put(i, new Employee(i, "Fname" + i, "Lname" + i));
			System.out.println("employeeMap size:" + employeeMap.size());
		}
	}
 
	public static List<Employee> getList(int pageNo, int pageSize) {
		
		int fromIdx = (pageNo - 1)*pageSize + 1;
		int toIdx = (pageNo*pageSize) + 1;
		
		return new ArrayList<Employee>(employeeMap.values()).subList(fromIdx, toIdx);
	}

	public static boolean insert(Employee emp) {
		boolean ret = false;

		if(!employeeMap.containsKey(emp.getId())) {
			employeeMap.put(emp.getId(), emp);
			ret = true;
		} 
		return ret;

	}

	public static boolean delete(Employee emp) {
		boolean ret = false;
		
		if(employeeMap.containsKey(emp.getId())) {
			employeeMap.remove(emp.getId());
			ret = true;
		} 
		
		return ret;
	}
}