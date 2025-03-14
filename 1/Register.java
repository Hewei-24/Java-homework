import java.util.Scanner;
public class Register {
	public static void main(String[] args) {
		String name;
		String password;
		String newPassword;
		Scanner input =new Scanner(System.in);
		System.out.print("请输入用户名，密码和验证密码\n");
		System.out.print("用户名：");
		name=input.nextLine();
		System.out.print("密码：");
		password=input.next();
		System.out.print("验证密码：");
		newPassword=input.next();
		while (name.length()<3||(password.equals(newPassword)==false)||(password.length()<6)) {
		if(name.length()<3) {
			System.out.println("用户名不能小于3");
		}
		if((password.equals(newPassword)==false)||(password.length()<6)) {
			System.out.println("两次输入密码不一致或密码不能小于6位");
		}
		String tmp=input.nextLine();
		System.out.println("\n"+"请重新输入");
		System.out.print("用户名：");
		name=input.nextLine();
		System.out.print("密码：");
		password=input.next();
		System.out.print("验证密码：");
		newPassword=input.next();
		}
		System.out.println("注册成功！");
	}
}
