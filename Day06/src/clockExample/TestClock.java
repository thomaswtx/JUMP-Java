package clockExample;

public class TestClock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Test Clock class
		Clock clockOne = new Clock();
		Clock clockTwo = new Clock(3);
		Clock clockThree = new Clock(2, 30);
		Clock clockFour = new Clock(4, 5, 6);
		
		System.out.println("Clock One: " + clockOne.toString());
		System.out.println("Clock Two: " + clockTwo.toString());
		System.out.println("Clock Three: " + clockThree.toString());
		System.out.println("Clock Four: " + clockFour.toString());

	}

}
