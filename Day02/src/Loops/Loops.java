package Loops;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = 0;
		int result2 = 0;
		double count = 1.0;
		double count2 = 0.0;
		/*
		while (count <= 10) {
			count += 1.0;
			result++;
		}
		
		System.out.println(result);
		
		while(count2 <= 1.0) {
			count2 += 0.1;
			result2++;
		}
		System.out.println(result2);
		*/
		
		int count3 = 0;
		
		while(count3 < 10) {
			
			System.out.print(count3);
			count3++;
		}
		System.out.println("\nFor loop:");
		for(int i =0; i < 10; i++) {
			System.out.print(i);
		}
		
		System.out.println("/nDo-while loop: ");
		
		int count4 = 0;
		do {
			System.out.print(count4);
			count4++;
		} while(count4 < 10);

	}

}
