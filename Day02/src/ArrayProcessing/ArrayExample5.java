package ArrayProcessing;

public class ArrayExample5 {

	public static void main(String[] args) {
		
		int[] myArray = {1, 2, 5, 5, 6, 6, 7, 2};
		
		int dupValue = 0;
		
		for(int i = 0; i < myArray.length; i++) {
			dupValue = myArray[i];
			for(int j = i + 1; j < myArray.length; j++) {
				if(dupValue == myArray[j]) {
					System.out.println("Duplicate element: " + dupValue);
				}
			}
		}
	}
}
