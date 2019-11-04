package Interview;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer to find the next Fibonacci number: ");
		int answer = sc.nextInt();
		
		System.out.println(Fibonacci(answer));
	}
	
	public static int Fibonacci(int n) {
		
		if(n == 1) {
			return 1;
		}
		if(n == 2) {
			return 1;
		}
		else return Fibonacci(n - 1) + Fibonacci(n - 2);
	}

}
