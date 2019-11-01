package containerExample;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> friends = new ArrayList<Person>();
		
		Person person = new Person("jane", 10, 'F');
		friends.add(person);
		person = new Person("jack", 6, 'M');
		friends.add(person);
		
		Person p = friends.get(1);
		System.out.println(p.toString());

	}

}
