import java.util.Scanner;

public class Java20241576_1_2 {

    public static void calculateBMI(double weight, double height) {
        double bmi = weight / (height * height);
        System.out.println("您的BMI指数为: " + bmi);

        if (bmi < 18.5) {
            System.out.println("您的体型状况为: 消瘦");
        } else if (bmi >= 18.5 && bmi < 24) {
            System.out.println("您的体型状况为: 正常");
        } else {
            System.out.println("您的体型状况为: 超重");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入您的体重（千克）: ");
        double weight = scanner.nextDouble();

        System.out.print("请输入您的身高（米）: ");
        double height = scanner.nextDouble();

        calculateBMI(weight, height);

        scanner.close();
    }
}