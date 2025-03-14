import java.util.Random;
public class Java20241576_1_11 {
	public static void main(String[] args) {
		final int n=10;
		int i;
		int j;
		int array[][]=new int[n][n];
		Random random = new Random();
		System.out.println("原数组：");
		for( i=0;i<n;i++) {
			for( j=0;j<n;j++) {
				array[i][j]=random.nextInt(100);
				System.out.printf("%3d",array[i][j]);
			}
			System.out.print("\n");
		}
		
		int amax=array[0][0];
		int imax=0;
		int jmax=0;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(array[i][j]>amax) {
					amax=array[i][j];
					imax=i;
					jmax=j;
				}
			}
		}
		System.out.println("数组中最大的数为"+amax);
		System.out.printf("在数组的第%d行，第%d列\n",imax,jmax);
		
		for( i=0;i<n;i++) {
			for(j=0;j<i;j++) {
				array[i][j]=array[j][i];
			}
		}
		System.out.println("转置后的数组：");
		for(i=0;i<n;i++) {
			for( j=0;j<n;j++) {
				System.out.printf("%3d", array[i][j]);
			}
			System.out.print("\n");
		}
	}
}
