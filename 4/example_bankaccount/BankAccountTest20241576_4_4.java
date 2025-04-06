package example_bankaccount;

public class BankAccountTest20241576_4_4 {
	public static void main(String[] args) {
		BankAccount20241576_4_4 account = new BankAccount20241576_4_4(1000);
		
		try {
			account.deposit(500);
			account.withdraw(200);
			account.withdraw(-100);
		}catch(NegativeAmountException20241576_4_4 e){
			System.out.println("发生异常："+e.getMessage());
		}catch(InsufficientFundsException20241576_4_4 e) {
			System.out.println("发生异常："+e.getMessage());
		}
		
		try {
			account.withdraw(2000);
		}catch(Exception e) {
			System.out.println("发生异常："+e.getMessage());
		}
	}
}
