package example2;

import java.util.Scanner;

public class Example1{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("please input the radius of circle:");
		double r = reader.nextDouble();
		Circle1 c = new Circle1(r);
		double thePerimeter = c.getPerimeter();
		System.out.println("the perimeter is " + String.format("%.2f", thePerimeter));
		
	}
} 