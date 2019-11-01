package lambdaExpressionExample;

interface DrawIt {
	void draw();
}

public class AfterLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width = 10;
		DrawIt d = () -> {
			System.out.println("Drawing with: " + width);
		};
		d.draw();
	}

}
