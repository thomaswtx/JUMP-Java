package IfElse;

import java.util.Scanner;

public class IfElseNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your score? ");
		double answer = sc.nextDouble();
		
		calculateScore(answer);

	}
	
	public static void calculateScore(double score) {
		if(score >= 90) {
			System.out.println("Your grade is A");
		}
		else if(score >= 80) {
			System.out.println("Your grade is B");
		}
		else if(score >= 70) {
			System.out.println("Your grade is C");
		}
		else if(score >= 60) {
			System.out.println("Your grade is D");
		}
		else System.out.println("Your grade is F");
	}

}
