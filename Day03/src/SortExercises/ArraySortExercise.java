package SortExercises;

import java.util.Arrays;

public class ArraySortExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {45, 12, 85, 32, 89, 39, 69, 44, 42, 1, 6, 8};
		System.out.println("Unsorted Array: " + Arrays.toString(myArray));
		System.out.println("Sorted Array: " + Arrays.toString(sortArray(myArray)));
	}
	public static int[] sortArray(int[] array) {
		int temp;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length -1; j++) {
				if(array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j +1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}
}

