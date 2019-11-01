package methodrefs;

import java.util.*;

public class MethodReferenceTest {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("John");
		names.add("Jack");
		names.add("Jill");
		//names.forEach(System.out::println);
//		names.forEach(p -> {
//			System.out.println(p.toString());
//		}
//		);
		names.forEach(p -> System.out.println(p.toString()));
		

	}

}
