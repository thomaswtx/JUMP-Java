package constructorExample;

public class TestFraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction(5);
		Fraction f3 = new Fraction(9, 3);
		Fraction f4 = new Fraction(f3);
		
		System.out.println(f1.divide());
		System.out.println(f2.divide());
		System.out.println(f3.divide());
		System.out.println(f4.divide());

	}

}
