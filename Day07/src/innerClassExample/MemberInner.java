package innerClassExample;

public class MemberInner {
	private int data = 30;
	
	class Inner {
		void message() {
			System.out.println("data is: " + data);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberInner object = new MemberInner();
		MemberInner.Inner inObject = object.new Inner();
		inObject.message();

	}

}
