package exercises;

import java.io.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class FileIOTest {
	
	//	Program that reads lines from an input text file (inputfile.txt),
	//	then writes them to an output file(outputfile.txt), excluding dplicate lines
	//	Makes use of:
	//		BufferedReader - to read lines from input file
	// 		HashSet (add) method - to store lines without duplicates
	//		PrintWriter - to write lines of text to the output file

	public static void main(String[] args) throws IOException {

		String fileName = "inputfile.txt";
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		PrintWriter writer = new PrintWriter(new FileWriter("outputfile.txt"));
		HashSet<String> fileContent = new HashSet<>();
		String inputLine = "";
	
		//Add lines from the file to the HashSet
		System.out.println("Contents added to HashSet: ");
		while((inputLine = reader.readLine()) != null) {
			fileContent.add(inputLine);
			System.out.println(inputLine);
		}	

		// Write the contents of the HashSet to a file
		System.out.println("Contents written to output file: ");
		for(String element : fileContent) {
			writer.println(element);
			System.out.println(element);
		}
		writer.flush();
		writer.close();
		reader.close();
	}
}
