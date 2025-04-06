package example2;

import java.util.Scanner;

class Circle2 {
	private double r;
	public Circle2(double r) throws Exception{
		if(r<0)
			throw new Exception("the radius is less than zero");
		else 
			this.r = r;
	}
	public double getPerimeter() {
		return 2*Math.PI*r;
	}
}
