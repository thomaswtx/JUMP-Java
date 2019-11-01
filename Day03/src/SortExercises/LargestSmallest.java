package SortExercises;

import java.util.Arrays;

public class LargestSmallest {

	public static void main(String[] args) {
		int[] myArray = {45, 12, 85, 32, 89, 39, 69, 44, 42, 1, 6, 8};
		System.out.println("The array is: " + Arrays.toString(myArray));
		System.out.println("The difference between the largest and smallest is: " + difference(myArray));
	}
	
	public static int difference(int[] array) {
		int largestValue = 0;
		int smallestValue = 100;
		for(int i =0; i < array.length; i++) {
			for(int j = 0; j< array.length; j++) {
				if(array[j] > largestValue) {
					largestValue = array[j];
				}
				else if (array[j] < smallestValue) {
					smallestValue = array[j];
				}
			}			
		}
		return largestValue - smallestValue;	
	}
}
