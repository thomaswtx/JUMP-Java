package questionExampleTwo;

public class AA {

	void methodOne() {
		class B {
			void methodTwo() {
				System.out.println("Method Two");
				B b = new B();
				b.methodTwo();
			}
		}
	}
}
