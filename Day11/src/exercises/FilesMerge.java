package exercises;

import java.io.*;

public class FilesMerge {
	
/**
	Program that reads lines from two text files,
	and writes them in a 3rd text file alternating
	one line from file1 and one line from file2
	Continue writing all the lines from the longer file
	
	This program makes use of :
		BufferedReader to read lines of text
		PrintWriter to write lines of text to a file
 * @throws IOException 
		*/

	public static void main(String[] args) throws IOException {
		// Create all the buffered reads and print writer
		BufferedReader bfOne = new BufferedReader(new FileReader("file1.txt"));
		BufferedReader bfTwo = new BufferedReader(new FileReader("file2.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("file3.txt"));
		
		String lineOne = "";
		String lineTwo = "";
		boolean flag = true;
		
		while(flag) {
				if((lineOne = bfOne.readLine()) != null && (lineTwo = bfTwo.readLine()) != null) {
					pw.println(lineOne);
					pw.println(lineTwo);
				} else if((lineOne = bfOne.readLine()) == null && (lineTwo = bfTwo.readLine()) != null) {
					pw.println(lineTwo);
				} else if((lineOne = bfOne.readLine()) != null && (lineTwo = bfTwo.readLine()) == null) {
					pw.println(lineOne);
				} else {
					flag = false;
				}
		}
		//Close all the streams
		bfOne.close();
		bfTwo.close();
		pw.close();
	}
}
