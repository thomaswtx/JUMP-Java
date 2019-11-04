package ArrayProcessing;

import java.util.Scanner;

public class ProcessArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double[] rainfall = new double[12];
		
		double annualAverage, sum = 0.0;
		
		for(int i = 0; i < rainfall.length; i++) {
			System.out.println("Rainfall for month " + (i+1));
			rainfall[i] = sc.nextDouble();
			sum += rainfall[i];
		}

		annualAverage = sum/rainfall.length;
		sc.close();
	}

}
