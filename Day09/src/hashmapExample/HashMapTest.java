package hashmapExample;

import java.util.*;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, String> userCityMapping = new HashMap<>();
		
		System.out.println("is userCityMapping empty? : " + userCityMapping.isEmpty());
		
		userCityMapping.put("John", "New York");
		userCityMapping.put("Rajeev", "Bengaluru");
		userCityMapping.put("Steve", "London");
		
		System.out.println("userCityMapping HashMap: " + userCityMapping);
		
		// Find the size of a HashMap
		System.out.println("We have the city information of " + userCityMapping.size() + " users");
		
		String userName = "Steve";
		//Check if a key exists in the HashMap
		if(userCityMapping.containsKey(userName)) {
			//Get the value assigned to a given key in the HasMap
			String city = userCityMapping.get(userName);
			System.out.println(userName + " lives in " + city);
		} else {
			System.out.println("City details not found for user " + userName);
		}
		
		// Check if a value exists in a HashMap
		if(userCityMapping.containsKey("New York")) {
			System.out.println("There is a user in the userCityMapping who lives in New York");
		} else {
			System.out.println("City details not found for user " + userName);
		}
		
		// Modify the value assigned to an existing key
		userCityMapping.put(userName, "California");
		System.out.println(userName + " moved to a new city :" + userCityMapping.get(userName));
		System.out.println("New userCityMapping : " + userCityMapping);
		
		//the get() method returns 'null' if the specified key was not found in the HashMap
		System.out.println("Lisa city : " + userCityMapping.get("Lisa"));

	}

}
