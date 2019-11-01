package inputoutputexample;

import java.io.*;

public class DataOutputStreamExample {

	public static void main(String[] args) {

		File file = new File("data.dat");

		try(FileOutputStream fos = new FileOutputStream(file);
				DataOutputStream dos = new DataOutputStream(fos);) {

			dos.writeInt(12345);
			dos.writeBoolean(true);
			dos.writeChar('w');

		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException: " + e.getMessage());
		}
		catch (IOException e) {
			e.printStackTrace();
		} 

	}

}
