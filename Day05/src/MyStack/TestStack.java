package MyStack;
import java.util.Scanner;

public class TestStack {

	public static void main(String[] args) {
	
		String[] stringToPush = {"Dallas", "Fort Worth", "Grapevine", 
				"Colleyville", "Hurst", "Euless", "Bedford", 
				"Irving", "Plano", "Carrolton"};
		
		MyStack myStack = new MyStack(stringToPush.length, 0);
		
		for(int i = 0; i < stringToPush.length; i++) {
			System.out.println("PUSH: " + "[" + stringToPush[i] + "]" + " has been pushed onto the stack.");
			myStack.Push(stringToPush[i]);	
		}
		
		myStack.Peek();
		myStack.Pop();
		myStack.Peek();
		myStack.Pop();
		myStack.Peek();
		myStack.Pop();
		myStack.Peek();
		myStack.Pop();
		myStack.Peek();
		myStack.Pop();
		myStack.Peek();
		myStack.Pop();
		myStack.Peek();
		myStack.Pop();
		myStack.Peek();
		myStack.Pop();
		myStack.Peek();
		myStack.Pop();
		myStack.Peek();
		myStack.Pop();
		myStack.Pop();
		myStack.Peek();
		
	}
}
