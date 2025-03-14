
public class CashRegister {
	//�����Ա����
	private double purchase;//�����۶�
	private double payment;//������
	private String history;//�������Ʒ�۸��嵥
	
	//���幹�췽��
	public CashRegister() {
		purchase=0;
		payment=0;
		history="";
	}
	
	public void recordPuchase(double amount) {
		purchase = purchase + amount;
		//�������ÿһ����Ʒ�۸��¼���ַ���history��
		history = history +String.valueOf(amount)+"\n";
	}
	
	public void receivePayment(double amount) {
		payment=payment+amount;
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
	
	//main
	public static void main(String[] args) {
		CashRegister register = new CashRegister();
		double change;
		//��һ�ι�����
		register.recordPuchase(30);		//��Ʒ1��30Ԫ
		register.recordPuchase(15.5);	//��Ʒ2��15.5Ԫ
		register.receivePayment(50);	//�˿�֧��50Ԫ
		register.printReceipt();		//��ӡ����۸��嵥
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
	}
}