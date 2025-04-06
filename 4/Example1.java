import java.util.*;
public class Example1 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double value = 0;
		boolean done = false;
		while(!done) {
			try {
				System.out.println("please input a double number");
				value = reader.nextDouble();
				done = true;
			}catch(InputMismatchException e){
				System.out.println("Input error.Try again");
				reader.next();
			}
		}
		System.out.println("this.number:"+ value);
	}

}
