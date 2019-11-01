package innerClassExample;

public class LocalInner {
	
	private int data = 40;
	void display() {
		class Local {
			void message() {
				System.out.println("data is: " + data);
			}
		}
		Local local = new Local();
		local.message();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInner object = new LocalInner();
		System.out.println("Hello");
		object.display();
		

	}

}
