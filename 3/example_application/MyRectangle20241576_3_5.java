package example_application;

public class MyRectangle20241576_3_5 implements IShape20241576_3_5{
	private double width,height;
	
	public MyRectangle20241576_3_5(double w,double h) {
		width = w;
		height = h;
	} 
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return 2*(width+height);
	}
	
	public String toString() {
		return String.format("width=%.1f, height=%.1f, perimeter=%.1f, area=%.1f",width, height, perimeter(), area());
	}

}
