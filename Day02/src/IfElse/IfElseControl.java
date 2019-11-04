package IfElse;

import java.util.Scanner;

public class IfElseControl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		IfElse ifElse = new IfElse();
		
		System.out.println("What is your score? ");
		double score = sc.nextDouble();
		
		System.out.println("Your grade is " + ifElse.getScore(score));
		
		
	}
}
