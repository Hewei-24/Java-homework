import java.util.Scanner;
public class Register {
	public static void main(String[] args) {
		String name;
		String password;
		String newPassword;
		Scanner input =new Scanner(System.in);
		System.out.print("�������û������������֤����\n");
		System.out.print("�û�����");
		name=input.nextLine();
		System.out.print("���룺");
		password=input.next();
		System.out.print("��֤���룺");
		newPassword=input.next();
		while (name.length()<3||(password.equals(newPassword)==false)||(password.length()<6)) {
		if(name.length()<3) {
			System.out.println("�û�������С��3");
		}
		if((password.equals(newPassword)==false)||(password.length()<6)) {
			System.out.println("�����������벻һ�»����벻��С��6λ");
		}
		String tmp=input.nextLine();
		System.out.println("\n"+"����������");
		System.out.print("�û�����");
		name=input.nextLine();
		System.out.print("���룺");
		password=input.next();
		System.out.print("��֤���룺");
		newPassword=input.next();
		}
		System.out.println("ע��ɹ���");
	}
}
