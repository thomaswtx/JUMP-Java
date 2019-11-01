package lambdas;

public class MathTest {

	public static void main(String[] args) {
		MathTest tester = new MathTest();
		// With type declaration
		MathOperation addition = (int a, int b) -> a + b;
		// Without type declaration
		MathOperation subtraction = (a, b) -> a - b;
		// With return statement along with curly braces
		MathOperation multiplication = (int a, int b) -> {return a * b;};
		// Without return statement and without curly braces
		MathOperation division = (int a , int b) -> a / b;
		
		System.out.println("10 + 5 = "	+ tester.operate(10, 5, addition));
		System.out.println("10 - 5 = "	+ tester.operate(10, 5, subtraction));
		System.out.println("10 * 5 = "	+ tester.operate(10, 5, multiplication));
		System.out.println("10 / 5 = "	+ tester.operate(10, 5, division));
	}

	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}
}
