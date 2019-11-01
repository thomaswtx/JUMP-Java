package innerClassExample;

public class StaticNested {
	
	public int x = 10;
	static int data = 50;
	
	static class Inner {
		static void message() {
			System.out.println("data is: " + data);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticNested.Inner.message();
		StaticNested sn = new StaticNested();
		System.out.println("X is: " + sn.x);
	}

}
