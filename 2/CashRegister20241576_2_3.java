
public class CashRegister20241576_2_3 {
	//定义成员变量
	private double purchase;//总销售额
	private double payment;//付款金额
	private String history;//购买的商品价格清单
	private int SalesCount;
	double SalesTotal;
	
	//定义构造方法
	public CashRegister20241576_2_3() {
		purchase=0;
		payment=0;
		history="";
		SalesCount=0;
		SalesTotal = 0;
	}
	
	public void recordPuchase(double amount) {
		purchase = purchase + amount;
		//将购买的每一个商品价格记录在字符串history中
		history = history +String.valueOf(amount)+"\n";
		SalesTotal = SalesTotal+ amount;
	}
	
	public void receivePayment(double amount) {
		payment=payment+amount;
		SalesCount++;
	}
	
	public double giveChange() {
		double change =payment -purchase;
		//本次购买完成，为下一次购买重置各个成员变量
		purchase =0;
		payment =0;
		history ="";
		return change;
	}
	
	public void printReceipt() {
		System.out.println("list:\n"+history);
		System.out.println("total:"+String.valueOf(purchase));
	}
	
	//总销售额
	public double getSalesTotal() {
		return SalesTotal;
	}
	
	//订单数量
	public int getSalesCount() {
		return SalesCount;
		
	}
	
	//main
	public static void main(String[] args) {
		CashRegister20241576_2_3 register = new CashRegister20241576_2_3();
		double change;
		//第一次购买处理
		register.recordPuchase(30);		//商品1：30元
		register.recordPuchase(15.5);	//商品2：15.5元
		register.receivePayment(50);	//顾客支付50元
		register.printReceipt();//打印购物价格清单
		change = register.giveChange();	//计算零钱
		System.out.println("change:"+String.format("%.2f",change));
		//第二次购买处理
		register.recordPuchase(60);
		register.recordPuchase(28);
		register.recordPuchase(2.2);
		register.receivePayment(100);
		register.printReceipt();
		change = register.giveChange();
		System.out.println("change:"+String.format("%.2f",change));
		System.out.println("Sales total:"+register.getSalesTotal());
		System.out.println("Sales total:"+register.getSalesCount());
	}
}