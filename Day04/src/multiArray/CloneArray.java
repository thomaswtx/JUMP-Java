package multiArray;

public class CloneArray {

	public static void main(String[] args) {
		
		int arr[] = {33, 3, 4, 5};
		
		System.out.print("Printing original array: ");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.print("\nPrinting clone of the array: ");
		int carr[] = arr.clone();
		
		for(int i = 0; i < carr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.print("\nAre both equal? ");
		System.out.print(arr == carr);
	}

}
