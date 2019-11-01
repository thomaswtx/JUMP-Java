package regex;

import java.util.regex.*;

public class FindCatRegex {
	
	private static final String REGEX = "\\bcat\\b";
	private static final String INPUT = "cat cat cat cattie cat";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile(REGEX);
		Matcher matcher = pattern.matcher(INPUT);
		int count = 0;
		
		while(matcher.find()) {
			count++;
			System.out.println("Match number " + count);
			System.out.println("start(): " + matcher.start());
			System.out.println("end(): " + matcher.end());
		}
		
		

	}

}
