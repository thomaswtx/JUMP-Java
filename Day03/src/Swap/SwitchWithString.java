package Swap;

public class SwitchWithString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String levelString = "Expert";
		
		int level = 0;
		
		switch(levelString) {
		case "Beginner": level = 1;
		break;
		case "Intermediate": level = 2;
		break;
		case "Expert": level = 3;
		break;
		default: level = 0;
		break;
		}
		System.out.println("Your level is: " + level);

	}

}
