import java.util.Scanner;
import java.util.InputMismatchException;
public class FloatInputValidation20241576_4_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int attempts = 0;
		double number = 0;
		
		while(attempts <2) {
			try {
				System.out.println("请输入一个浮点数：");
				number = scanner.nextDouble();
				System.out.println("您输入的浮点数为："+number);
				break;
			}catch(InputMismatchException e) {
				attempts++;
				System.out.println("输入错误，请重新输入：");
				scanner.nextLine();
			}
		}
		if(attempts==2) {
			System.out.println("两次输入机会已用完！");
		}
		scanner.close();
	}
}
