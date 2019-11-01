package lambdaExpressionExample;

public class LambdaExampleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addable addOne = (a, b) -> (a + b);
		System.out.println("a+b = " + addOne.add(5, 7));
		
		Addable addTwo = (a, b) -> (a + b);
		System.out.println("a+b = " + addTwo.add(50, 70));

	}

}
