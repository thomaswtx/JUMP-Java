package questionExampleTwo;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		
		System.out.println(a.s);
		
		A.B b = a.new B();
		
		System.out.println(b.s);
		
		b.methodB();

	}

}
