package multiArray;

import java.util.Scanner;

public class RandomNumberGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int randomNumber = (int)(Math.random() * 100) + 1;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int guess = 0;
		
		do {
			System.out.println("Guess a number between 1 to 100: ");
			guess = sc.nextInt();
			
			if(randomNumber > guess) {
				System.out.println("Higher, try again!");
				count++;
			}
			else if(randomNumber < guess) {
				System.out.println("Lower, try again!");
				count++;
			}
			
		} while(randomNumber != guess);
		
		System.out.println("Congratulations you got it!");
		System.out.println("Number of tries: " + count);
		
		

	}

}
