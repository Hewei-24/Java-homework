import java.util.Scanner;
public class Java20241576_1_6 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("������һ����������");
		int n;
		n=scanner.nextInt();
		double sum=add(n);
		System.out.println("��Ϊ��"+ sum);
	}
	public static double add(int n) {
		double sum=0.0;
		int i;
		for(i=1;i<=n;i++) {
			double t=1.0/i;
			if(i%2!=0) 
				sum=sum+t;
			else
				sum=sum-t;
		}
		return sum;
	}
}
