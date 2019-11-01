package cloning;

public class Test2 implements Cloneable{
	int a, b;
	
	Test c = new Test();
	
	public Object clone() throws CloneNotSupportedException {
		// Super clone handles the copying of the members of the Test2 class
		Test2 d = (Test2) super.clone();
		
		// Creating a new instance for the Test composite
		d.c = new Test();
		
		// Assigning a new reference in the deep copy
		d.c.x = c.x;
		d.c.y = c.y;
	
		return d;
	}

	@Override
	public String toString() {
		return "Test2 [a=" + a + ", b=" + b + ", c=" + c.toString() + "]";
	}
	
}
