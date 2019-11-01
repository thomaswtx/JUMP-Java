package inputoutputexample;
import java.io.*;
import java.util.Scanner;
public class ReadNamesAndSort {

	public static void main(String[] args) {
		Scanner scanner;
		try {
			scanner = new Scanner(new File("data.txt"));
			
			while (scanner.hasNextLine()) {
				String name = scanner.nextLine()	;
				System.out.println("name: " + name);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
