package regexExamples;

import java.util.regex.Pattern;

public class MatchAlphaNumOnly {

	public static void main(String[] args) {
		
		
		System.out.println(Pattern.matches("\\w{6}", "Hello World!"));
		System.out.println(Pattern.matches("\\w{6}", "54658484asdf6"));
		System.out.println(Pattern.matches("\\w{6}", "123b56"));
		System.out.println(Pattern.matches("\\w{6}", "ab6def"));
		
	}
}
