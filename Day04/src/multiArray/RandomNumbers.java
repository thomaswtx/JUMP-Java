package multiArray;

public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 10;
		int min = 1;
		int range = max - min + 1;
		
		for(int i = 0; i < 100; i++) {
			double rand = Math.random();
			
			System.out.println(rand);
		}

	}

}
