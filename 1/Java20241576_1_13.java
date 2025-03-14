import java.text.DecimalFormat;

public class Java20241576_1_13 {

    public static void main(String[] args) {
        double principal = 1000000;
        int years = 10; 
        double annualInterestRate = 0.06;

        int months = years * 12;
        double monthlyInterestRate = annualInterestRate / 12; // ������

        double equalInstallmentMonthlyPayment = calculateEqualInstallmentMonthlyPayment(principal, monthlyInterestRate, months);
        System.out.println("�ȶϢ���ʽ:");
        printRepaymentSchedule(principal, monthlyInterestRate, months, equalInstallmentMonthlyPayment);

        System.out.println("\n�ȶ�𻹿ʽ:");
        printEqualPrincipalRepaymentSchedule(principal, monthlyInterestRate, months);
    }

    private static double calculateEqualInstallmentMonthlyPayment(double principal, double monthlyInterestRate, int months) {
        return (principal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, months)) / (Math.pow(1 + monthlyInterestRate, months) - 1);
    }

    private static void printRepaymentSchedule(double principal, double monthlyInterestRate, int months, double monthlyPayment) {
        DecimalFormat df = new DecimalFormat("#.00");
        double remainingPrincipal = principal;
        double totalInterest = 0;

        System.out.println("����\t�����ܶ�\t\t\t�����\t\t������Ϣ");
        for (int i = 1; i <= months; i++) {
            double interest = remainingPrincipal * monthlyInterestRate;
            double principalPayment = monthlyPayment - interest;
            remainingPrincipal -= principalPayment;
            totalInterest += interest;

            System.out.println(i + "\t" + df.format(monthlyPayment) + "\t\t" + df.format(principalPayment) + "\t\t" + df.format(interest));
        }
        System.out.println("����Ϣ: " + df.format(totalInterest));
    }

    private static void printEqualPrincipalRepaymentSchedule(double principal, double monthlyInterestRate, int months) {
        DecimalFormat df = new DecimalFormat("#.00");
        double monthlyPrincipalPayment = principal / months;
        double remainingPrincipal = principal;
        double totalInterest = 0;

        System.out.println("����\t�����ܶ�\t\t\t�����\t\t������Ϣ");
        for (int i = 1; i <= months; i++) {
            double interest = remainingPrincipal * monthlyInterestRate;
            double monthlyPayment = monthlyPrincipalPayment + interest;
            remainingPrincipal -= monthlyPrincipalPayment;
            totalInterest += interest;

            System.out.println(i + "\t" + df.format(monthlyPayment) + "\t\t" + df.format(monthlyPrincipalPayment) + "\t\t" + df.format(interest));
        }
        System.out.println("����Ϣ: " + df.format(totalInterest));
    }
}