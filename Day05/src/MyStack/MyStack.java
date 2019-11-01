package MyStack;

import java.util.Arrays;

public class MyStack {

	private int stackSize;
	private String[] stackData = new String[10];
	private int topOfStack;
	
	public MyStack(int stackSize, int topOfStack) {
		super();
		this.stackSize = stackSize;
		this.topOfStack = topOfStack;
	}

	public int getStackSize() {
		return stackSize;
	}

	public void setStackSize(int stackSize) {
		this.stackSize = stackSize;
	}

	public String[] getStackData() {
		return stackData;
	}

	public void setStackData(String[] stackData) {
		this.stackData = stackData;
	}

	public int getTopOfStack() {
		return topOfStack;
	}

	public void setTopOfStack(int topOfStack) {
		this.topOfStack = topOfStack;
	}

	// Put element into the stack
	public void Push(String element) {
		
		stackData[topOfStack] = element;
		topOfStack += 1;
	}
	
	// Remove top element and return the top element
	public void Pop() {
		if(topOfStack > 0) {
			topOfStack -= 1;	
			System.out.println("POP: " + "[" + stackData[topOfStack] + "]"+ " has been removed from the stack.");
		}
		else if(topOfStack == 0) {
			System.out.println("The stack is empty!");
		}
	}
	
	//Look at the top element of the stack without removing it
	public void Peek() {
		if(topOfStack == 0) {
			System.out.println("The stack is empty!");
		}
		else {
		System.out.println("PEEK: " + "[" + stackData[topOfStack - 1] + "]"+ " is at the top of the stack.");
		}
	}

	@Override
	public String toString() {
		return "[" + Arrays.toString(stackData) + "]";
	}
	
	
}
