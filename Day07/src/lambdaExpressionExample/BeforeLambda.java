package lambdaExpressionExample;

interface Drawable {
	void draw();
}

public class BeforeLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width = 10;
		Drawable draw = new Drawable() {
			
			@Override
			public void draw() {
				System.out.println("Drawing width: " + width);
			}
		};
		
		draw.draw();

	}

}
