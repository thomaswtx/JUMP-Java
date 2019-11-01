package rectangleExample;

public class RectangleTest {

	public static void main(String[] args) {
		// Test Rectangle class
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(7);
		Rectangle r3 = new Rectangle(4, 3);
		
		System.out.println(r1.area());
		System.out.println(r2.area());
		System.out.println(r3.area());

	}

}
