package multiArray;

import java.util.Arrays;

public class AddMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{1, 3, 4}, {3, 4, 5}};
		int b[][]= {{1,3,4}, {3,4,5}};
		
		addMatrices(a, b);

	}
	
	public static void addMatrices(int[][] firstMatrix, int[][] secondMatrix) {
		
		int tempMatrix[][] = new int[firstMatrix.length][firstMatrix.length];
		
		// First Matrix
		System.out.println("First Matrix: ");
		for(int i = 0; i < firstMatrix.length; i++) {
			for(int j = 0; j < firstMatrix[i].length; j++) {
				System.out.print(firstMatrix[i][j] + " ");
			}
			System.out.println();
		}
		
		// Second Matrix
		System.out.println("Second Matrix: ");
		for(int i = 0; i < secondMatrix.length; i++) {
			for(int j = 0; j < secondMatrix[i].length; j++) {
				System.out.print(firstMatrix[i][j] + " ");
			}
			System.out.println();
		}
		
		// Added Matrix
		System.out.println("Added Matrix: ");
		for(int i = 0; i < firstMatrix.length; i++) {
			for(int j = 0; j < firstMatrix[i].length; j++) {
				System.out.print(firstMatrix[i][j]+ secondMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
