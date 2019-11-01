package ArrayOfObjects;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfObject {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person[] persons = new Person[3];
		
		String name;
		String gender;
		int age;
		
		for(int i = 0; i < persons.length; i++) {
			System.out.println("Enter the person's name: ");
			name = sc.next();
			System.out.println("Enter the person's age: ");
			age = sc.nextInt();
			System.out.println("Enter the person's gender: ");
			gender = sc.next();
			
			persons[i] = new Person();	
			
			persons[i].setName(name);
			persons[i].setAge(age);
			persons[i].setGender(gender);
		}
		
		for(int i = 0; i < persons.length; i++) {
			System.out.println(persons[i].toString());
		}
		
		sc.close();
	}
}
