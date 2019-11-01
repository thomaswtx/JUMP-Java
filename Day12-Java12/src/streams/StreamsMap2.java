package streams;

import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class StreamsMap2 {

	public static void main(String[] args) {
		Map<String, String> books = new HashMap<>();
		
		books.put("978-0201633610", "Design patterns");
		books.put("978-1617291999", "Java 8 in Action");
		books.put("978-0134685991", "Effective Java V1");
//		books.put("978-0134685981", "Effective Java V2");
//		books.put("978-0134685901", "Effective Java V3");
//		books.put("978-0134685911", "Effective Java V4");
//		books.put("978-0134685931", "Effective Java V5");
		
		// find the IBSN for the book title "Effective Java"
		Optional<String> optionalIsbn = books.entrySet().stream()
				.filter(s -> "Effective Java V1".equals(s.getValue()))
				.map(Map.Entry::getKey)
				.findAny();
		
		//System.out.println(optionalIsbn.toString());
		optionalIsbn.ifPresent(System.out::println);

	}

}
