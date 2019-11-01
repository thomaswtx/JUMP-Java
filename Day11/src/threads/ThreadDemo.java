package threads;

public class ThreadDemo {

	public static void main(String[] args) {

		// task 1
		System.out.println("App started");

		// task2 version 1 - sequential run
		//		if task2 is a long running operation
		//		OS/JVM will give a message that app is not responding
		//		solution: need a new thread ( child thread or worker thread)
		MyTask task2 = new MyTask();
		task2.executeTask();

		//		task2 version 2
		//		run in a new thread (extending thread class)
		//		
		//		MyTask task2 = new MyTask();
		//		task2.start(); // will call thread run() method

		//		task2 version 3 - run in a new thread implementing runnable interface
		//		Runnable r = new MyTask();
		//		Thread task2 = new Thread(r);
		//		task2.start();

		// task 3
		// print documents
		for(int doc = 1; doc <= 10; doc++) {
			System.out.println(" # Printing document #" + doc + " - Printer 1");
		}

	}

}
