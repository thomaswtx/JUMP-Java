package inputoutputexample;

import java.io.*;

public class FIleReaderExample {

	public static void main(String[] args) {

		File inFile = new File("data.txt");
		try {
			FileReader fileReader = new FileReader(inFile);
			BufferedReader buffReader = new BufferedReader(fileReader);
			String str;

			str = buffReader.readLine();
			while(str != null) {
				System.out.println(str);
				str = buffReader.readLine();
			} 

			buffReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException : " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException : " + e.getMessage());
		}

	}

}
