//Adding comments

//Another change
public class Circle {

	private double radius = 0.0;
	private double circumference = 0.0;
	private double area = 0.0;
	final double PI = 3.14;
	
	public void Circle(){
		double radius;
		double circumference;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getCircumference() {
		circumference = 2*PI*getRadius();
		return circumference;
	}

	public void setCircumference(double circumference) {
		this.circumference = circumference;
	}
	
	public double getArea( ) {
		
		area = PI*(Math.pow(getRadius(), 2));
		return area;
	}
	
	
}
