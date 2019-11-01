package methodrefs;
import java.util.*;
public class SortEmployees {
	public static void main(String[] args) {
		Employee[] employees = {
				new Employee("David"),
				new Employee("Naveen"),
				new Employee("Alexandra"),
				new Employee("Richard")};
		System.out.println("Before Sorting Names: " +  Arrays.toString(employees));
		//Arrays.sort(employees, Employee::nameCompare);
		Arrays.sort(employees,Employee::lengthCompare);
		//Collections.sort(employees, Comparator.comparing(Employee :: getName).reversed());
		System.out.println("After Sorting Names " + Arrays.toString(employees));
		}
	}
class Employee {
	String name;
	Employee(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public static int nameCompare(Employee a1, Employee a2) {
		return -(a1.name.compareTo(a2.name));
	}
	public static int lengthCompare(Employee a1, Employee a2) {
		return -(a1.name.length() - a2.name.length());
	}
	public String toString() {
		return name;
	}
}