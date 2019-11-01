package overloadedConstructors;

public class TestConstructors {

	public static void main(String[] args) {
		// Test person class
		Person person = new Person();
		Person person1 = new Person("Smith");
		
		System.out.println("Person name: " + person.getName());
		System.out.println("Person name: " + person1.getName());

	}

}
