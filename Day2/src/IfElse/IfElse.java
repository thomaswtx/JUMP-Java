package IfElse;

public class IfElse {
	
	private double score = 0.0;
	
	public char getScore(double score) {
		this.score = score;
		
		if(score >= 90) {
			return 'A';
		}
		else if(score >= 80) {
			return 'B';
		}
		else if(score >= 70) {
			return 'C';
		}
		else if(score >= 60) {
			return 'D';
		}
		else return 'F';

	}

}
