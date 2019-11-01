package multiArray;

import java.util.Arrays;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{1, 1, 1}, {2, 2, 2},{3, 3, 3}};
		int b[][]= {{1, 1, 1}, {2, 2, 2},{3, 3, 3}};
		
		multiplyMatrices(a, b);

	}
	
	public static void multiplyMatrices(int[][] firstM, int[][] secondM) {
		
	int tempMatrix[][] = new int[firstM.length][firstM.length];
	int tempSum = 0;

		
		// First Matrix
		System.out.println("First Matrix: ");
		for(int i = 0; i < firstM.length; i++) {
			for(int j = 0; j < firstM[i].length; j++) {
				System.out.print(firstM[i][j] + " ");
			}
			System.out.println();
		}
		
		// Second Matrix
		System.out.println("Second Matrix: ");
		for(int i = 0; i < secondM.length; i++) {
			for(int j = 0; j < secondM[i].length; j++) {
				System.out.print(firstM[i][j] + " ");
			}
			System.out.println();
		}
		
		// Multiple Matrix
		System.out.println("Multiplied Matrix: ");
		for(int i = 0; i < firstM.length; i++) {	
			for(int j= 0; j < firstM[i].length; j++) {
				tempSum = 0;
				for(int k = 0; k < firstM[i].length; k++) {
					tempSum += firstM[j][k] * secondM[k][j];
				}	
				tempMatrix[i][j] = tempSum;
			}
		}	
		for(int i = 0; i < tempMatrix.length; i++)
			System.out.println(Arrays.toString(tempMatrix[i]));	
	}

}
