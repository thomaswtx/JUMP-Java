package cloning;

public class TestApp {

	public static void main(String[] args) throws CloneNotSupportedException {
		Test2 t1 = new Test2();
		t1.a = 10;
		t1.b = 20;
		t1.c.x = 30;
		t1.c.y = 40;
		
		Test2 t3 = (Test2) t1.clone();
		t3.a = 100;
		
		t3.c.x = 300;
		
		System.out.println(t1.toString());
		System.out.println(t3.toString());

	}

}
