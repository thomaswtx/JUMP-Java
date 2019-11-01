package oopQuestion5;

class A {
	int i = 1;
	class B {
		int i = 2;
		class C {
			void methodC() {
				System.out.println(i);
			}
		}
	}
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new A().new B().new C().methodC();

	}

}
