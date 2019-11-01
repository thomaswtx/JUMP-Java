package oopQuestions;

class OClass { 
	class InnerClass {
		int i = 10;
	}
}
class OClass2 {
	static class InnerClass {
		int i = 20;
	}
}
class OClass3 {
	static class InnerClass {
		static int i = 30;
	}
}

public class OuterClass {

	public static void main(String[] args) {
		// Access the i in the first OuterClass example
		System.out.println(new OClass().new InnerClass().i);
		
		// Access the i in the second OuterClass example
		System.out.println(new OClass2.InnerClass().i);
		
		// Access the i in the third OuterClass example
		System.out.println(new OClass3.InnerClass().i);

	}

}
