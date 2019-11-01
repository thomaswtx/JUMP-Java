package ArrayExamples;

import java.util.Arrays;

public class ArrayExample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrayOne = {1, 2, 5, 5, 8, 9, 7, 10};
		int[] arrayTwo = {1, 0, 6, 15, 6, 4, 7, 0};
		
		System.out.println("ArrayOne : " + Arrays.toString(arrayOne));
		System.out.println("ArrayTwo : " + Arrays.toString(arrayTwo));
		
		System.out.println();
		for(int i = 0; i < arrayOne.length; i++) {
			for(int j = 0; j < arrayTwo.length; j++) {
				if(arrayOne[i] == arrayTwo[j]) {
					System.out.println("Common element is : " + arrayOne[i]);
				}
			}
			
		}

	}

}
