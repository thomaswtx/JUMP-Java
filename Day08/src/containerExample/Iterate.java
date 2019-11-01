package containerExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Iterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list_Strings = new ArrayList<String>();
		List<Person>friends = new ArrayList<Person>();
		
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		
		friends.add(new Person("John" , 30, 'M'));
		friends.add(new Person("Mary", 32, 'F'));
		friends.add(new Person("Steve", 38, 'M'));
		friends.add(new Person("Roger", 35, 'M'));
		friends.add(new Person("Susan", 25, 'F'));
		
		for(String element : list_Strings) {
			System.out.print(element + " ");
		}
		
		Collections.shuffle(list_Strings);
		System.out.println();
		
		for(String element : list_Strings) {
			System.out.print(element + " ");
		}
		
		

	}

}
