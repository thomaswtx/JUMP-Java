package hashMap;

import java.util.HashMap;
import java.util.Map;

public class Create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1,  "Red");
		hashMap.put(2,  "Green");
		hashMap.put(3,  "Black");
		hashMap.put(4,  "White");
		hashMap.put(5,  "Blue");
		
		System.out.println("Size of the hash map: " + hashMap.size());
		
		for(Map.Entry x:hashMap.entrySet()) {
			System.out.println(x.getKey() + " " + x.getValue());
		}
		
		hashMap.clear();
		System.out.println("The New Map: " + hashMap);

	}
}
