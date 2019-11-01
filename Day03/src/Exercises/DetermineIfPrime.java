package Exercises;

import java.util.Scanner;

public class DetermineIfPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to check if it's prime: ");
		int ans = sc.nextInt();
		
		int count = 0;
		
		for(int i = 1; i <= ans; i++) {
			if(ans == 1 || ans == 0) {
				System.out.println(ans + " is not a prime number.");
			}
			else if (ans % i == 0) {
				count++;

			}
		}
		if(count > 2) {
			System.out.println(ans + " is not a prime number.");
		}
		else if(count <= 2) {
			System.out.println(ans + " is a prime number.");
		}
	}
}
