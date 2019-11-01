package threads;

import java.io.*;

public class ThreadNaming extends Thread {

	ThreadNaming(String name) {
		super(name);
	}

	@Override
	public void run()	{
		System.out.println("Thread [" + getName() + "] is running...");
	}

}
