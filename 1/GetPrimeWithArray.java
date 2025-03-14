public class GetPrimeWithArray {
	public static void main(String[] args) {
		final int n=100;
		int i,j;
		int count=0;
		boolean flag;
		for(i=2;i<n;i++) {
			if(isPrime(i)==true)
				count++;
		}
		int[] primeArray=new int[count];
		int index=0;
		for(i=2;i<n;i++) {
			if(isPrime(i)==true)
				primeArray[index++]=i;
		}
		for(i=2;i<primeArray.length;i++) {
			System.out.println(primeArray[i]);
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