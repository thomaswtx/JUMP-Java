package threads;

public class MyTask {

		public void executeTask()	 {
			for(int doc = 1; doc <= 10; doc++) {
				System.out.println(" * Printing document #" + doc + " - Printer 2");
			}
		}
		

	//	* MyTask IS-A Thread
	//	* Version 2
	//	public void MyTask extends Thread{
	//	@Override
	//	public void run() {
	//		for(int doc = 1; doc <= 10; doc++) {
	//			System.out.println(" * Printing document #" + doc + " - Printer 2");
	//			}



	//	 * Version 3 - Run in a new thread (implementing RUnnable interface)
	//	 * class OtherClass{
	//	 * }
	//	 * 
	//	 * public class MyTask extends OtherClass implements Runnable {
	//	 * @Override
	//	 * public void run() {
	//	 * 	for(int doc = 1; doc <= 10; doc++) {
	//	 * System.out.println(" * Printing document #" + doc + " - Printer 2")
	//	 * }
	//	 * } 

}
