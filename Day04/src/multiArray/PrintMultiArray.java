package multiArray;

import java.util.Arrays;

public class PrintMultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = { 
				{1, 3, 5},
				{2, 4, 6},
				{3, 4, 5}
		};
		
		printMultiArray(arr);

	}
	
	public static void printMultiArray(int[][] array) {
		for(int i = 0; i < array.length; i++)
			System.out.println(Arrays.toString(array[i]));
	}

}
