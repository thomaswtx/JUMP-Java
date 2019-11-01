package multiArray;

public class MatricCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = {
				{1,3,5}, 
				{2,4,6}, 
				{3,4,5}, 
				{1,4,7}};
		
		maxInRows(arr);
		System.out.println("----------------------------------");
		columnSum(arr);
	}
	
	public static void maxInRows(int[][] array) {
		
		int maxNum = 0;
		for(int i = 0; i < array.length; i++) {
			maxNum = 0;
			for(int j = 0; j < array[i].length; j++) {
				if(array[i][j] > maxNum) {
					maxNum = array[i][j];
				}
			}
			System.out.println("Max element of row " + i + " = " + maxNum);
		}
	}
	
	public static void columnSum(int[][] array) {
		int columnSum = 0;
		
		for(int i = 0; i < array[i].length; i++) {
			columnSum = 0;
			for(int j = 0; j < array.length; j++) {
					columnSum += array[j][i];
			}
			System.out.println("Sum of the column : " + i + " = " + columnSum);
		}
	}

}
