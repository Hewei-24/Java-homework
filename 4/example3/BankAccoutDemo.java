package example3;

public class BankAccoutDemo {
public static void main(String[] args) {
	try {
		BankAccount harrysChecking = new BankAccount("harry",-500);
		System.out.println("account creat success");
	}catch(NegativeBalanceException e) {
		System.out.println(e.getMessage());
	}
}
}
