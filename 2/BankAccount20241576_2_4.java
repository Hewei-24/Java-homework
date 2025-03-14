
public class BankAccount20241576_2_4 {
	private String accountNumber;
	private String accountHolder;
	private String address;
	private double balance;
	
	public BankAccount20241576_2_4(String accountNumber,String accountHolder,String address,double balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.address = address;
		this.balance = balance;
	}
	
	//存款
	public void deposit(double amount) {
		this.balance = this.balance + amount;
	}
	
	//取款
	public void withdraw(double amount) {
		if(amount>balance)
			System.out.println("余额不足");
		else
			this.balance = this.balance - amount;
	}
	
	//查询余额
	public double getBalance() {
		return balance;
	}
	
	//计算利息
	public void caculateInterest(double rate) {
		this.balance = this.balance *rate/100 + this.balance ;
	}
	
	//累加利息
	public void cumulativeInterest(double rate,int year) {
		this.balance = balance * Math.pow(1+(rate/100),year);	
	}
	
	//输出信息
	public void show() {
		System.out.println("账号"+accountNumber);
		System.out.println("储户姓名"+accountHolder);
		System.out.println("地址"+address);
		System.out.println("存款余额"+balance);
	}
	//main
	public static void main(String[] args) {
		BankAccount20241576_2_4 account=new BankAccount20241576_2_4("123456","jim","123 Main",1000);
		account.deposit(50000);
		account.withdraw(35000);
		account.caculateInterest(26);
		account.cumulativeInterest(26, 3);
		account.getBalance();
		account.show();
		
	}
	

}
