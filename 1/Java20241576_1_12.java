import java.util.Scanner;
public class Java20241576_1_12 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String str=scanner.nextLine();
		if(IsPalindrome(str)==true) {
			System.out.println(str+"�ǻ���");
		}else {
			System.out.println(str+"���ǻ���");
		}
	}
	public static boolean IsPalindrome(String str) {
        int length=str.length();
        boolean yes=true;
        int i=0;
		char ch1 = str.charAt(i);
        char ch2 = str.charAt(length - 1 - i);
        for (i = 0; i < length / 2; i++) {
        if (ch1 != ch2) {
            yes = false;
            break;
        }	}
		return yes;
}
}
