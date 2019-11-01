package regexExamples;

import java.util.regex.*;

public class MatchOnlyAlpha {

	public static void main(String[] args) {
	
		System.out.println(Pattern.matches("[W]\\D{7}", "848slke8i"));
		System.out.println(Pattern.matches("[W]\\D{7}", "!!!!**8kdkdk*"));
		System.out.println(Pattern.matches("[W]\\D{7}", "WomasWhp"));
		System.out.println(Pattern.matches("[W]\\D{7}", "Wishomel"));

	}

}
