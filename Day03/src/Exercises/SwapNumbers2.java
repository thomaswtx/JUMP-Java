package Exercises;

import java.util.Scanner;

public class SwapNumbers2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x, y;
		System.out.println("Enter x and y: ");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		
		System.out.println("Before Swapping: ");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		System.out.println("After Swapping: ");
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		sc.close();

	}

}
