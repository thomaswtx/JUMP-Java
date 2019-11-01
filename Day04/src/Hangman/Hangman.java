package Hangman;

import java.util.Arrays;
import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char wordToUpdate[] = {'-', '-', '-', '-'};
		char secretWord[] = {'l', 'y', 'n', 'x'};
		char letterGuess;
		String stringGuess;
		boolean wordFlag = false;

		System.out.println("Hangman Game!");
		do {

			// First update
			for(int i = 0; i < wordToUpdate.length; i++) 
				System.out.print(wordToUpdate[i]);


			System.out.print("\nGuess a letter: ");
			stringGuess = sc.nextLine();
			letterGuess = stringGuess.charAt(0);

			for(int j = 0; j < wordToUpdate.length; j++) {
				if(letterGuess == secretWord[j]) {
					wordToUpdate[j] = letterGuess;
				}
			}
			
			wordFlag = Arrays.equals(wordToUpdate, secretWord);

		} while(!wordFlag);

		System.out.println("Congratulations, you won! The word was " + Arrays.toString(secretWord));

	}
}
