package inputoutputexample;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class PrintWriterExample {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("data.txt");

		FileOutputStream fos = new FileOutputStream(file);
		PrintWriter pw = new PrintWriter(fos);

		ArrayList<String> names = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			names.add("name " + i);
		}
		pw.println(names);
		
		HashMap<Integer, String> hashMapOfNames = new HashMap<Integer, String>();
		for(int i = 0; i < 10; i++) {
			hashMapOfNames.put(i, "name " + i);
		}
		pw.println(hashMapOfNames);
		pw.close();
	}

}
