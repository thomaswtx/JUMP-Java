package questionExampleThree;

class A {
	void methodA1 (int i ) {
		System.out.print("Class A: MethodA1: ");
		System.out.println(i+++i);
	}
	
	void methodA2(int i) {
		System.out.print("Class A: MethodA2: ");
		System.out.println(--i-i--);
	}
}

class B {
	A a = new A() {
		void methodA1(int i) {
			System.out.print("Class B: MethodA1: ");
			System.out.println(++i+i++);
		}
		
		void methodA2(int i) {
			System.out.print("Class B: MethodA2: ");
			System.out.println(i---i);
		}
	};
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.methodA1(10);
		a.methodA2(10);
		B b = new B();
		b.a.methodA1(10);
		b.a.methodA2(10);

	}

}
