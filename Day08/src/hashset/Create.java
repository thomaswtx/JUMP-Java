package hashset;

import java.util.*;

public class Create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map books;
		books = new TreeMap<String, String>();
		
		books.put("Book1", "Intro Java Programming");
		books.put("Book2", "Database Design");
		books.put("Book3", "Software Design for Mobile Devices");
		
		if(books.containsKey("Book1")) {
			System.out.println("We shall Java with this Book");
		}
		else {
			System.out.println("No Java Book");
		}
		

	}

}
