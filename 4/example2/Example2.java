package example2;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		try {
			Scanner reader= new Scanner(System.in);
			System.out.println("please input the raduis of the circle");
			double r = reader.nextDouble();
			Circle2 c = new Circle2(r);
			double thePerimeter = c.getPerimeter();
			System.out.println("the perimeter is "+String.format("%.2f",thePerimeter));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
