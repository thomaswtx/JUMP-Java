package SwitchTest;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your choice? ");
		int answer = sc.nextInt();
		switchTest(answer);

	}
	
	public static void switchTest(int month) {

		String monthString = "";
		
		switch(month) {
		case 10: 
		case 9: 
		case 8: System.out.println("Master");
			break;
		case 7: 
		case 6: System.out.println("Journeyman");
			break;
		case 5: 
		case 4: System.out.println("Apprentice");
			break;

			default: 
				System.out.println("Input Error.");
				break;
		}
		
		System.out.println(monthString);
	}

}
