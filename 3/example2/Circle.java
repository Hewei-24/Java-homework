package example2;

public class Circle extends Shape{
	private double r;
	public Circle(double r) {
		this.r = r;
	}
	public double getArea() {
		return Math.PI*Math.pow(r, 2);
	}

}
