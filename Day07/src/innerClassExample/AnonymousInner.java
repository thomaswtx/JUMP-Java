package innerClassExample;

abstract class Person {
	abstract void eat();
}

public class AnonymousInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person() {
			
			@Override
			void eat() {
				System.out.println("Nice fruits");
			}
		};

		p.eat();
	}

}
