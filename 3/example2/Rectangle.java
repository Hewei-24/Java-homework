package example2;

public class Rectangle extends Shape{
	private double height,width;
	
	public Rectangle(double width,double height) {
		this.height = height;
		this.width = width;
	}
	
	public double getArea() {
		return this.height * this.width;
	}
}
