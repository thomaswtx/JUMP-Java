package containerExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list_Strings = new ArrayList<String>();
		List<Person>friends = new ArrayList<Person>();
		
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		
		System.out.println("Array list before Swap: ");
		for(String a: list_Strings) {
			System.out.println(a);
		}
		
		Collections.swap(list_Strings, 0, 2);
		System.out.println("Array list after swap: ");
		for(String b : list_Strings) {
			System.out.println(b);
		}

	}

}
