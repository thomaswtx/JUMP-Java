package Exercises;

import java.util.Scanner;

public class FactorialRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to get it's factorial: ");
		int answer = sc.nextInt();
		
		System.out.println("\nThe factorial is: " + Factorial(answer));
	}
	
	public static int Factorial(int ans) {
		
		System.out.print(ans + "*");
		if(ans <= 1) {
			return 1;
		}
		else {
			return ans * Factorial(ans - 1);
		}		
	}
}
