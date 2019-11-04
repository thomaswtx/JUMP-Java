package ArrayProcessing;

public class ArrayExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myArray = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] newArray = new int[10];
		
		for(int i = 0; i < myArray.length; i++) {
			newArray[i] = myArray[i];
		}
		
		System.out.print("Source Array: ");
		for(int j = 0; j < myArray.length; j++) {
			System.out.print(myArray[j] + " ");
		}
		System.out.println();
		System.out.print("New Array: ");
		for(int k = 0; k < newArray.length; k++) {
			System.out.print(newArray[k] + " ");
		}
		

	}

}
