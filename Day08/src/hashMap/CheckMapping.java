package hashMap;

import java.util.HashMap;

public class CheckMapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("Red", 1);
		hashMap.put("Green", 2);
		hashMap.put("Black", 3);
		hashMap.put("White", 4);
		hashMap.put("Blue", 5);

		System.out.println("The original map: " + hashMap);
		System.out.println("1. Does key 'Green' exist?");
		if(hashMap.containsKey("Green")) {
			System.out.println("Yes! - " + hashMap.get("Green"));
		} else {
			System.out.println("No!");
		}

		System.out.println("\n2. Does key 'Orange' exist?");
		if(hashMap.containsKey("Orange")) {
			System.out.println("Yes! - " + hashMap.get("Orange"));
		} else {
			System.out.println("No!");
		}
	}
}
