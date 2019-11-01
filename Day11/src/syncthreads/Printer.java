package syncthreads;

public class Printer {
	void printDocuments(int numOfCopies, String docName) {
		for(int i = 1; i <=10; i++) {
			System.out.println(" * Printing " + docName + " " + i);
		}
	}

}
