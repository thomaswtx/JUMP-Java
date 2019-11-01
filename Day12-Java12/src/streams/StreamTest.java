package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		List<String> items = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		
		List<String> filtered = items.stream().filter(item -> !item.isEmpty()).collect(Collectors.toList());
		
		filtered.forEach(System.out::println);
		List.of("This", "is ", "created ", "by ", "stream()")
		.stream().forEach(System.out::println);
		//Stream.of("This ", "is ", "created ", "by ", "stream()").forEach(System.out::print);
		
	}

}
