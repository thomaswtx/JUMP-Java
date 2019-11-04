package Loops;

import java.util.Scanner;

public class LoopHalf {

	public static void main(String[] args) {
		String name;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Your name");
			name = sc.nextLine();
			
			if(name.length() > 0) break;
			
			System.out.println("Invalid entry " + "You must enter at least one character.");
		}

	}

}
