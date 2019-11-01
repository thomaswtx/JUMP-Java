package oopQuestionTwo;

class X {
	int x = 111;
	
	static class Y extends X {
		int y = x + 222;
	}
	
	static class Z extends X.Y {
		int z = y + 333;
	}
}

public class InnerClassInheritance {

	public static void main(String[] args) {
		//B.Z z = new B().new Z();
		//B.Z z2 = new B().new Z();
		X.Z z = new X.Z();
		
		System.out.println(z.x);
		System.out.println(z.y);
		System.out.println(z.z);
	}
}
