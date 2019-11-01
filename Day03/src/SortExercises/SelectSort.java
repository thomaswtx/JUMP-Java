package SortExercises;

public class SelectSort {

	public static void main(String[] args) {
		int[] myArray = {5, 1, 12, -5, 16, 2, 12, 14};
		
		selectSort(myArray);
		

	}
	
	public static int[] selectSort(int[] array) {
		int lowValue = array[0];
		int temp;
		
		for(int i =0; i < array.length; i++) {
			for(int j = 1; j < array.length; j++) {
				if(array[j] < lowValue) {
					lowValue = array[j];
				}
			}
			array[i] = lowValue;
			
			
		}
		return array;
	}

}
