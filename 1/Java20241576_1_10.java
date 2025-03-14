import java.util.Arrays;
public class Java20241576_1_10 {

	public static void main(String[] args) {
		System.out.println("所有水仙花数：");
		int count=0;
		for(int i=100;i<=999;i++) {
			if(IsNNumber(i)==true) {
				count++;
				}
		}
		int[] array=new int[count];
		int index=0;
		for(int i=100;i<=999;i++) {
			if(IsNNumber(i)==true) {
				array[index]=i;
				index++;
				}
		}
		for(int j=0;j<count;j++)
			System.out.println(array[j]);
	}
	public static boolean IsNNumber(int i) {
		boolean flag=false;
			int a=i/100;
			int b=(i%100)/10;
			int c=i%10;
			if(i==Math.pow(a, 3)+Math.pow(b,3)+Math.pow(c, 3))
				flag=true;
		return flag;
	}

}
