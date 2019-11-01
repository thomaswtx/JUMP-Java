package syncthreads;

public class MyThread extends Thread {
	
	Printer printRef;
	
	MyThread(Printer p) {
		printRef = p;
	}

	@Override
	public void run()	{
		synchronized(printRef) {
			printRef.printDocuments(10, "JohnsResume.pdf");
		}
	}
}
