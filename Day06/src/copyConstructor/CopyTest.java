package copyConstructor;

public class CopyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex complexOne = new Complex(10, 15);
		
		Complex complexTwo = new Complex(complexOne);
		
		Complex complexThree = complexTwo;
		
		if(complexOne.equals(complexTwo)) {
			System.out.println("ComplexOne equals ComplexTwo");
		} else {
			System.out.println("ComplexOne is not equal to ComplexTwo");
		}
		
		if(complexOne == complexTwo) {
			System.out.println("ComplexOne == ComplexTwo");
		} else {
			System.out.println("ComplexOne != ComplexTwo");
		}
		
		System.out.println(complexTwo); // toString() of complexTwo is called here

	}

}
