package hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hashSet = new HashSet<String>();
		
		hashSet.add("Red");
		hashSet.add("Green");
		hashSet.add("Black");
		hashSet.add("White");
		hashSet.add("Pink");
		hashSet.add("Yellow");
		
		System.out.println("Original Hash Set: " + hashSet);
		
		String[] newArray = new String[hashSet.size()];
		hashSet.toArray(newArray	);
		
		System.out.println("Array elements: ");
		for(String element : newArray) {
			System.out.println(element);
			
		}
		
		Set<String> treeSet = new TreeSet<String>(hashSet);
		
		System.out.println("TreeSet elements: ");
		for(String element : treeSet) {
			System.out.println(element);
		}
		
		List<String> list = new ArrayList<String>(hashSet);
		
		System.out.println("ArrayList contains: " + list);
	}
}
