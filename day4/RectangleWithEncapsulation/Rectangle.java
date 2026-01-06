package day4.RectangleWithEncapsulation;

public class Rectangle {
	private double width;
	private double height;
	
	public double area() {
		return height * width;
	}
	
	public double perimeter() {
		return 2 * (width + height);
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		if (width > 0) this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		if (height > 0) this.height = height;
	}
	
	
}
