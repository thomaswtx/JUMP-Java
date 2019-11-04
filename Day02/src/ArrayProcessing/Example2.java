package ArrayProcessing;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double[] rainfall = new double[4];
		String[] monthName = new String[4];
		monthName[0] = "January";
		monthName[1] = "February";
		monthName[2] = "March";
		monthName[3] = "April";
		
		double annualAverage, sum = 0.0;
		
		for(int i = 0; i< rainfall.length; i++) {
			System.out.println("Rainfall for " + monthName[i] + ": ");
			rainfall[i] = sc.nextDouble();
			sum += rainfall[i];
		}
		
		annualAverage = sum/rainfall.length;
		System.out.println("Average rainfall is: " + annualAverage);
	}

}
