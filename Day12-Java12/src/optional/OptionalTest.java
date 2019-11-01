package optional;

import java.util.List;
import java.util.Optional;

/**
 * Optional is a single-value container that
 * either contains a value or doesn't
 * @author Shinigami
 *
 */

public class OptionalTest {
	public static void main(String[] args) {
		// create an empty optional
		Optional<Integer> possible = Optional.empty();
		
		// create optional with default non-null value
		Optional<Integer> possible2 = Optional.of(5);
		
		// check whether it holds any value inside it
		possible.ifPresent(System.out::println);
		possible2.ifPresent(System.out::println);
		
		/****** Default/absent values and actions ****/
		// Assume this value has returned from a method
		Optional<Company> companyOptional = Optional.empty();
		
		// Now check optional; if value is present than return it,
		// else create a new Company object and return it
		Company company = companyOptional.orElse(new Company());
		System.out.println("company = " + company.name);
		
		//OR you can throw an exception as well
		Company company2 = companyOptional.orElseThrow(IllegalStateException::new);
	}
}

class Company {
	String name;
	Company() {
		name = "ACME Inc";
	}
	
}
