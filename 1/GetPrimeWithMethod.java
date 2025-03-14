public class GetPrimeWithMethod {
	public static void main(String[] args) {
		final int n=100;
		int i,j;
		boolean flag;
		for(i=2;i<n;i++) {
			if(isPrime(i)==true)
				System.out.println(i);
		}
	}
	public static boolean isPrime(int n) {
		int i;
		boolean flag=true;
		for(i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				flag=false;
				break;
			}
		}
		return flag;
	}
}
