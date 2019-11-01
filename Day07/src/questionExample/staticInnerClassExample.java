package questionExample;

class X {
	static int x = 3131;
	
	static class Y {
		static int y = x++;
		
		static class Z {
			static int z = y++;
		}
	}
}

public class staticInnerClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(X.x);
		System.out.println(X.Y.y);
		System.out.println(X.Y.Z.z);

	}

}
