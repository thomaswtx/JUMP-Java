package ioexamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadLocal {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("test.txt");
		FileInputStream input = new FileInputStream(file);
		
		int data = input.read();
		
		while((data!=-1)) {
			System.out.print((char)data);
			data = input.read();
		}
		
		input.close();
	
		
		
		
		

	}

}
