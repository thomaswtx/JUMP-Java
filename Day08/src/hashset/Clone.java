package hashset;

import java.util.*;

public class Clone {

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
		hashSet.remove(hashSet);
		
		hashSet.clear();
		System.out.println("Hash Set after removing all the elements " + hashSet);

	}

}
