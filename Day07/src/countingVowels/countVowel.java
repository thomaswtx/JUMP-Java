package countingVowels;

import javax.swing.*;
import optionPane.OptionPaneTest;

public class countVowel {

	public static void main(String[] args) {
		char letter;
		
		OptionPaneTest object = new OptionPaneTest();
		String name = JOptionPane.showInputDialog("Your input: ", "Enter your name here");
		
		int numberOfCharacters = name.length();
		int vowelCount = 0;
		
		for(int i = 0; i < numberOfCharacters; i++) {
			letter  = name.charAt(i);
					
					if( letter == 'a' || letter == 'A' ||
						letter == 'e' || letter == 'E' ||
						letter == 'i' || letter == 'I' ||
						letter == 'o' || letter == 'O' ||
						letter == 'u' || letter == 'U' 
																	) {
						vowelCount++;
						
					}
		}
		
		object.showMessage("Your name " + name+ " has " + vowelCount + " vowels.");

	}

}
