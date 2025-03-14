
public class GetPrime {

	public static void main(String[] args) {
		final int n=100;
		int i,j;
		boolean flag;
		for(i=2;i<n;i++) {
			flag=true;
			for(j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					flag=false;
					break;
				}
			}
			if(flag==true)
				System.out.println(i);
		}

	}

}
