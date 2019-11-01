package hashset;
import java.util.*;
public class Iterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hashSet = new HashSet<String>();
		
		hashSet.add("Red");
		hashSet.add("Green");
		hashSet.add("Black");
		hashSet.add("White");
		hashSet.add("Pink");
		hashSet.add("Yellow");
		
		hashSet.remove("Pink");
		
		Iterator<String> p = hashSet.iterator();
		
		while(p.hasNext()) {
			System.out.println(p.next());
		}

	}

}
