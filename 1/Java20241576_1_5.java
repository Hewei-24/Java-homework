public class Java20241576_1_5 {

    public static void main(String[] args) {
        double initialBalance = 1000000.0; 
        double annualInterestRate = 0.03; 
        double monthlyInterestRate = annualInterestRate / 12; 
        double monthlyWithdrawal = 5000.0;
        double balance = initialBalance;
        int months = 0;

        while (balance > 0) {
            balance += balance * monthlyInterestRate; 
            balance -= monthlyWithdrawal; 
            months++;

            if (balance < monthlyWithdrawal) {
                balance = 0;
            }
        }

        int years = months / 12;
        int remainingMonths = months % 12;

        System.out.println("账户余额将在 " + years + " 年 " + remainingMonths + " 个月后变为0。");
    }
}