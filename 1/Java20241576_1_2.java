import java.util.Scanner;

public class Java20241576_1_2 {

    public static void calculateBMI(double weight, double height) {
        double bmi = weight / (height * height);
        System.out.println("����BMIָ��Ϊ: " + bmi);

        if (bmi < 18.5) {
            System.out.println("��������״��Ϊ: ����");
        } else if (bmi >= 18.5 && bmi < 24) {
            System.out.println("��������״��Ϊ: ����");
        } else {
            System.out.println("��������״��Ϊ: ����");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("�������������أ�ǧ�ˣ�: ");
        double weight = scanner.nextDouble();

        System.out.print("������������ߣ��ף�: ");
        double height = scanner.nextDouble();

        calculateBMI(weight, height);

        scanner.close();
    }
}