
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
	
	//���
	public void deposit(double amount) {
		this.balance = this.balance + amount;
	}
	
	//ȡ��
	public void withdraw(double amount) {
		if(amount>balance)
			System.out.println("����");
		else
			this.balance = this.balance - amount;
	}
	
	//��ѯ���
	public double getBalance() {
		return balance;
	}
	
	//������Ϣ
	public void caculateInterest(double rate) {
		this.balance = this.balance *rate/100 + this.balance ;
	}
	
	//�ۼ���Ϣ
	public void cumulativeInterest(double rate,int year) {
		this.balance = balance * Math.pow(1+(rate/100),year);	
	}
	
	//�����Ϣ
	public void show() {
		System.out.println("�˺�"+accountNumber);
		System.out.println("��������"+accountHolder);
		System.out.println("��ַ"+address);
		System.out.println("������"+balance);
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
