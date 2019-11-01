package Loops;

public class StarLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pyramidOne();
		System.out.println();
		pyramidTwo();
	}
	
	public static void pyramidOne() {		
		for(int i = 1; i <= 6; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void pyramidTwo() {
		for(int i = 6; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}	
	}
}
