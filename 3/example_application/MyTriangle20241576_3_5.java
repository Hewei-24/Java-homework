package example_application;

public class MyTriangle20241576_3_5 implements IShape20241576_3_5{
	private double x,y,z,s;
	public MyTriangle20241576_3_5(double x,double y,double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double area() {
		s = (x+y+z)/2;
		return Math.sqrt(s*(s-x)*(s-y)*(s-z));
	}
	
	public double perimeter() {
		return s*2;
	}
	
	public String toString() {
		return String.format("three sides:"+x+","+y+","+z+",perimeter="+s*2+",area"+area());
	}

}
