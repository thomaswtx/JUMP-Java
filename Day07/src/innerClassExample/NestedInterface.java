package innerClassExample;

interface Showable {
	void show();
	
	interface Message{
		void message();
	}
}

public class NestedInterface implements Showable.Message{

	public void message() {
		System.out.println("Hello nested interface.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Showable.Message message = new NestedInterface();
		message.message();
		

	}

}
