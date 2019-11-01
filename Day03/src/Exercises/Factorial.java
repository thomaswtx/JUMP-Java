package Exercises;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer to see the factorial: ");
		int answer = sc.nextInt();
		
		System.out.println("Factorial of " + answer + " is: ");
		
		int factorial = 1;
		for(int i = answer; i > 0; i--) {
			factorial *= i;
			System.out.print(i);
			System.out.print("*");
		}
		
		System.out.println("Which is: " + factorial);
		
			
		
	}
}
