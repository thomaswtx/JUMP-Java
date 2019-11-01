package employeeapp;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Menu {

	public Menu() {
		super();
	}
	
	public void menu() {
		// Initialize the choice variable along with Employee attributes
				int choice = 0;
				int id = 0;
				int dept = 0;
				String lastName = "";
				String firstName = "";
				int saveId = 0;

				// Instantiate a new TreeMap that will use int as id and Employee as value
				TreeMap<Integer, Employee> employeeMap = new TreeMap<>();

				// Instantiate and initialize the Department object
				Department department = Department.ACCOUNTING;
				// Create a scanner for the user input
				Scanner sc = new Scanner(System.in);

				try {
				do {

					System.out.println("Choose a menu option from below: ");
					System.out.println("1. ADD");
					System.out.println("2. REMOVE");
					System.out.println("3. MODIFY");
					System.out.println("4. PRINT");
					System.out.println("5. EXIT");
					choice = sc.nextInt();

					// Switch statement for the menu
					switch (choice) {
					case 1: 
						System.out.println("Enter the employee id: ");
						id = sc.nextInt();
						System.out.println("Enter the employee's first name: ");
						firstName = sc.next();
						System.out.println("Enter the employee's last name: ");
						lastName = sc.next();
						System.out.println("Enter the employee's department: ");
						System.out.println("1. ACCOUNTING");
						System.out.println("2. HR");
						System.out.println("3. DEVELOPMENT");
						System.out.println("4. SALES");
						dept = sc.nextInt();

						// Switch for the Department ENUM
						switch(dept) {
						case 1:
							department = Department.ACCOUNTING;
							break;
						case 2:
							department = Department.HR;
							break;
						case 3:
							department = Department.DEVELOPMENT;
							break;
						case 4:
							department = Department.SALES;
							break;
						}

						// Instantiate new employee object and add it to the employeeMap
						Employee employee = new Employee(id, firstName, lastName, department);
						employeeMap.put(id, employee);
						break;
					case 2: 
						// Ask user for the ID of the employee to remove
						System.out.println("Enter ID of employee to remove: ");
						id = sc.nextInt();

						// Find the ID of the employee to remove and remove the mapping
						for(Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
							if(entry.getKey().equals(id)) {
								saveId = id;
								System.out.println(id + " Found!");
							}
						}

						System.out.println("Employee removed: " + employeeMap.get(saveId).toString());
						employeeMap.remove(saveId);

						break;
					case 3: 
						// Ask user for the ID of the employee to modify
						System.out.println("Enter ID of employee to modify: ");
						id = sc.nextInt();

						// Find the ID of the employee to modify and ask which department
						for(Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
							if(entry.getKey().equals(id)) {
								System.out.println(id + " Found!");
								System.out.println();
								// Ask for department that needs to be modified
								System.out.println("Enter a department: ");
								System.out.println("1. ACCOUNTING");
								System.out.println("2. HR");
								System.out.println("3. DEVELOPMENT");
								System.out.println("4. SALES");
								dept = sc.nextInt();

								// Switch for the Department ENUM
								switch(dept) {
								case 1:
									department = Department.ACCOUNTING;
									break;
								case 2:
									department = Department.HR;
									break;
								case 3:
									department = Department.DEVELOPMENT;
									break;
								case 4:
									department = Department.SALES;
									break;
								}

								// Save the id value so that it can be modified later to avoid ConcurrentException
								saveId = id;

							} 
							
							// Modify the department of the selected Employee
							employeeMap.get(id).setDepartment(department);
						}
						break;
					case 4: 
						// print the list of employees
						System.out.println("Employee List");
						System.out.println("--------------------------------------------------------");
						for(Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
							System.out.println(entry.toString());
							System.out.println();
						}
						break;
					case 5: 
						System.out.println("Program is closing!");
						sc.close();
						System.exit(0);
						break;
					}
				} while(true);
				} catch (InputMismatchException e) {
					System.out.println("InputMismatch Exception thrown!");
				} catch (Exception e) {
					System.out.println("An exception has been thrown!");
				}
			}
	}

