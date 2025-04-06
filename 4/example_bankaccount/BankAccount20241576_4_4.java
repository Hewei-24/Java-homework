package example_bankaccount;

public class BankAccount20241576_4_4 {
	private double balance;
	public BankAccount20241576_4_4(double initialBalance) {
		this.balance = initialBalance;
	}
	
	public void deposit(double amount) throws NegativeAmountException20241576_4_4{
		if(amount <0) {
			throw new NegativeAmountException20241576_4_4("������Ϊ����");
		}
		balance +=amount;
		System.out.println("���ɹ�����ǰ��"+balance);
	}
	
	public void withdraw(double amount)throws NegativeAmountException20241576_4_4,InsufficientFundsException20241576_4_4{
		if(amount < 0) {
			throw new NegativeAmountException20241576_4_4("ȡ�����Ϊ����");
		}
		
		if(amount>balance) {
			throw new NegativeAmountException20241576_4_4("����");
		}
		balance = balance - amount;
		System.out.println("ȡ��ɹ�����ǰ��"+balance);
	}
	
	public double getBalance() {
		return balance;
	}
}
