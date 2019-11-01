package syncthreads;

public class YourThread extends Thread {

	Printer printRef;

	YourThread(Printer p) {
		printRef = p;
	}

	@Override
	public void run()	{
		synchronized(printRef) {
			printRef.printDocuments(10, "JimmysResume.pdf");
		}
	}
}
