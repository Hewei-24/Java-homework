package example_bankaccount;

public class BankAccount20241576_4_4 {
	private double balance;
	public BankAccount20241576_4_4(double initialBalance) {
		this.balance = initialBalance;
	}
	
	public void deposit(double amount) throws NegativeAmountException20241576_4_4{
		if(amount <0) {
			throw new NegativeAmountException20241576_4_4("存款金额不能为负数");
		}
		balance +=amount;
		System.out.println("存款成功，当前余额："+balance);
	}
	
	public void withdraw(double amount)throws NegativeAmountException20241576_4_4,InsufficientFundsException20241576_4_4{
		if(amount < 0) {
			throw new NegativeAmountException20241576_4_4("取款金额不能为负数");
		}
		
		if(amount>balance) {
			throw new NegativeAmountException20241576_4_4("余额不足");
		}
		balance = balance - amount;
		System.out.println("取款成功，当前余额："+balance);
	}
	
	public double getBalance() {
		return balance;
	}
}
