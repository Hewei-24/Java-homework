import java.util.Scanner;
public class Java20241576_1_4 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double [] scores=new double[5];
		System.out.println("请依次输入《java语言编程》，《高等数学》，《大学英语》，《大学物理》，《体育》的成绩");
		for (int i=0;i<5;i++) {
			scores[i]=scanner.nextDouble();
		}
		double totalGradePoints=0;
		for(double score:scores) {
			if(score >=90 && score<=100) {
				totalGradePoints=totalGradePoints+4.0;
			}else if(score>=85 && score<=89) {
				totalGradePoints=totalGradePoints+3.7;
			}else if(score>=82 && score<=84) {
				totalGradePoints=totalGradePoints+3.0;
			}else if(score>=75 && score<=77) {
				totalGradePoints=totalGradePoints+2.7;
			}else if(score>=72 && score<=74) {
				totalGradePoints=totalGradePoints+2.3;
			}else if(score>=68 && score<=71) {
				totalGradePoints=totalGradePoints+2.0;
			}else if(score>=66 && score<=67) {
				totalGradePoints=totalGradePoints+1.7;
			}else if(score>=64 && score<=65) {
				totalGradePoints=totalGradePoints+1.5;
			}else if(score>=60 && score<=63) {
				totalGradePoints=totalGradePoints+1.0;
			}else totalGradePoints=totalGradePoints+0.0;
		}
		System.out.println("五门课程的绩点之和为："+totalGradePoints);
		scanner.close();
	}

}
