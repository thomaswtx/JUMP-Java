package ArrayProcessing;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] quarterAverage = new double[4];
		double[] rainfall = new double[12];
		int sum = 0;
		
		for(int i = 0; i < 4; i++) {
			sum = 0;
			for(int j = 0; j< 3; j++) {
				sum += rainfall[3*i + j];
				
			}
			quarterAverage[i] = sum/3.0;
		}
		
		for(int k = 0; k < 4; k++) {
			System.out.println("Quarter average" + (k+1) + " " + quarterAverage[k]);
		}
	}
}
