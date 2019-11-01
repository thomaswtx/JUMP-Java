package rectangleExample;

public class Rectangle {
	
	private int width;
	private int height;
	
	public Rectangle() {
		width = 0;
		height = 0;
	}
	public Rectangle(int width) {
		this.width = width;
		this.height = width;
	}
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int area() {
		int area = getWidth() * getHeight();
		
		return area;
	}
	

}
