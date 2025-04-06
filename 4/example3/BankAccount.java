package example3;

public class BankAccount {
	private String name;
	private double balance;
	public BankAccount() {
		balance = 0;
	}
	public BankAccount(String name,double initialBalance) throws NegativeBalanceException{
		this.name = name;
		if(initialBalance < 0) {
			throw new NegativeBalanceException("cann't create account:"+initialBalance+" is less than zero");
		}
		balance = initialBalance;
	}
	public double getBalance() {
		return balance;
	}
}
