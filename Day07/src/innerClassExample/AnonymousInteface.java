package innerClassExample;

interface Eatable {
	void eat();
}

public class AnonymousInteface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Eatable eat = new Eatable() {
			public void eat() {
				System.out.println("Nice fruits!");
			}
		};
		
		eat.eat();

	}
}
