import java.util.Scanner;
import java.util.InputMismatchException;
public class FloatInputValidation20241576_4_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int attempts = 0;
		double number = 0;
		
		while(attempts <2) {
			try {
				System.out.println("������һ����������");
				number = scanner.nextDouble();
				System.out.println("������ĸ�����Ϊ��"+number);
				break;
			}catch(InputMismatchException e) {
				attempts++;
				System.out.println("����������������룺");
				scanner.nextLine();
			}
		}
		if(attempts==2) {
			System.out.println("����������������꣡");
		}
		scanner.close();
	}
}
