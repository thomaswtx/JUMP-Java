package lambdaExpressionExample;

public class AnotherLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface myInterface;
		
		myInterface = () -> 3.1415;
		
		System.out.println("Value of PI : " + myInterface.getPiValue());

	}

}
