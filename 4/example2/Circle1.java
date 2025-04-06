package example2;

import java.util.Scanner;

public class Circle1 {
	private double r;
	public Circle1(double r){
		try{
			if(r<0)
				throw new Exception("the radius is less than zero");
			else
				this.r = r;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.exit(1);//�����쳣�˳�
		}
		}
	public double getPerimeter() {
		return 2 * Math.PI * r;
	}
}
