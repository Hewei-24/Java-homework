import java.util.Scanner;

public class Java20241576_1_3 {
    public static double calculateGPA(int score) {
        if (score >= 90 && score <= 100) {
            return 4.0;
        } else if (score >= 85 && score < 90) {
            return 3.7;
        } else if (score >= 82 && score < 85) {
            return 3.3;
        } else if (score >= 78 && score < 82) {
            return 3.0;
        } else if (score >= 75 && score < 78) {
            return 2.7;
        } else if (score >= 72 && score < 75) {
            return 2.3;
        } else if (score >= 68 && score < 72) {
            return 2.0;
        } else if (score >= 66 && score < 68) {
            return 1.7;
        } else if (score >= 64 && score < 66) {
            return 1.5;
        } else if (score >= 60 && score < 64) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入您的《JAVA语言编程》成绩（百分制）: ");
        int score = scanner.nextInt();

        double gpa = calculateGPA(score);
        System.out.println("您的绩点为: " + gpa);

        scanner.close();
    }
}