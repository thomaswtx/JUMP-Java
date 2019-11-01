package regex;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String source = "There are thirty_three big-apple";
		String[] tokens = source.split("\\s+|-");
		for(String token : tokens) {
			System.out.println(token);
		}

		String date = "12/13/2010";
		String dateTwo = "12-13-2010";
		// extract date, month, and year from this string

		String[] newDate = date.split("\\/");
		String[] newDateTwo = dateTwo.split("\\-");
		System.out.println(Arrays.toString(newDate));
		System.out.println(Arrays.toString(newDateTwo));

	}

}
