
public class CashRegister20241576_2_3 {
	//�����Ա����
	private double purchase;//�����۶�
	private double payment;//������
	private String history;//�������Ʒ�۸��嵥
	private int SalesCount;
	double SalesTotal;
	
	//���幹�췽��
	public CashRegister20241576_2_3() {
		purchase=0;
		payment=0;
		history="";
		SalesCount=0;
		SalesTotal = 0;
	}
	
	public void recordPuchase(double amount) {
		purchase = purchase + amount;
		//�������ÿһ����Ʒ�۸��¼���ַ���history��
		history = history +String.valueOf(amount)+"\n";
		SalesTotal = SalesTotal+ amount;
	}
	
	public void receivePayment(double amount) {
		payment=payment+amount;
		SalesCount++;
	}
	
	public double giveChange() {
		double change =payment -purchase;
		//���ι�����ɣ�Ϊ��һ�ι������ø�����Ա����
		purchase =0;
		payment =0;
		history ="";
		return change;
	}
	
	public void printReceipt() {
		System.out.println("list:\n"+history);
		System.out.println("total:"+String.valueOf(purchase));
	}
	
	//�����۶�
	public double getSalesTotal() {
		return SalesTotal;
	}
	
	//��������
	public int getSalesCount() {
		return SalesCount;
		
	}
	
	//main
	public static void main(String[] args) {
		CashRegister20241576_2_3 register = new CashRegister20241576_2_3();
		double change;
		//��һ�ι�����
		register.recordPuchase(30);		//��Ʒ1��30Ԫ
		register.recordPuchase(15.5);	//��Ʒ2��15.5Ԫ
		register.receivePayment(50);	//�˿�֧��50Ԫ
		register.printReceipt();//��ӡ����۸��嵥
		change = register.giveChange();	//������Ǯ
		System.out.println("change:"+String.format("%.2f",change));
		//�ڶ��ι�����
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