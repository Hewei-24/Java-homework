import java.util.InputMismatchException;
import java.util.Scanner;

public class CashRegister20241576_4_5 {
	// �����Ա����
	private double purchase; // �����۶�
	private double payment; // ������
	private String history; // �������Ʒ�۸��嵥
	private int SalesCount;
	private double SalesTotal;

	// ���幹�췽��
	public CashRegister20241576_4_5() {
		purchase = 0;
		payment = 0;
		history = "";
		SalesCount = 0;
		SalesTotal = 0;
	}

	public void recordPuchase(double amount) throws IllegalArgumentException {
		if (amount < 0) {
			throw new IllegalArgumentException("��Ʒ����Ϊ����: " + amount);
		}
		purchase = purchase + amount;
		// �������ÿһ����Ʒ�۸��¼���ַ���history��
		history = history + String.format("%.2f", amount) + "\n";
		SalesTotal = SalesTotal + amount;
	}

	public void receivePayment(double amount) throws IllegalArgumentException, IllegalStateException {
		if (amount < 0) {
			throw new IllegalArgumentException("�������Ϊ����: " + amount);
		}
		if (purchase <= 0) {
			throw new IllegalStateException("û����Ʒ��¼�����ܸ���");
		}
		payment = payment + amount;
		SalesCount++;
	}

	public double giveChange() throws IllegalStateException {
		if (payment < purchase) {
			throw new IllegalStateException(String.format("����㣬���� %.2f Ԫ", purchase - payment));
		}
		double change = payment - purchase;
		// ���ι�����ɣ�Ϊ��һ�ι������ø�����Ա����
		purchase = 0;
		payment = 0;
		history = "";
		return change;
	}

	public void printReceipt() {
		if (history.isEmpty()) {
			System.out.println("û�й����¼");
			return;
		}
		System.out.println("�����嵥:\n" + history);
		System.out.printf("�ܼ�: %.2f Ԫ\n", purchase);
	}

	// �����۶�
	public double getSalesTotal() {
		return SalesTotal;
	}

	// ��������
	public int getSalesCount() {
		return SalesCount;
	}

	// ������
	public static void main(String[] args) {
		// �Զ�����
		try {
			CashRegister20241576_4_5 register = new CashRegister20241576_4_5();
			double change;

			System.out.println("��һ�ι���");
			register.recordPuchase(30);     // ��Ʒ1��30Ԫ
			register.recordPuchase(15.5);  // ��Ʒ2��15.5Ԫ
			register.receivePayment(50);    // �˿�֧��50Ԫ
			register.printReceipt();        // ��ӡ����۸��嵥
			change = register.giveChange(); // ������Ǯ
			System.out.printf("����: %.2f Ԫ\n", change);

			System.out.println("\n�ڶ��ι���");
			register.recordPuchase(60);
			register.recordPuchase(28);
			register.recordPuchase(2.2);
			register.receivePayment(100);
			register.printReceipt();
			change = register.giveChange();
			System.out.printf("����: %.2f Ԫ\n", change);

			System.out.println("\n����ͳ��");
			System.out.printf("�����۶�: %.2f Ԫ\n", register.getSalesTotal());
			System.out.println("��������: " + register.getSalesCount());

			// �����쳣���
			System.out.println("\n�����쳣���");
			try {
				register.recordPuchase(-10); // Ӧ���׳��쳣
			} catch (IllegalArgumentException e) {
				System.out.println("����Ԥ���쳣: " + e.getMessage());
			}

			try {
				register.receivePayment(-50); // Ӧ���׳��쳣
			} catch (IllegalArgumentException e) {
				System.out.println("����Ԥ���쳣: " + e.getMessage());
			}

			try {
				register.giveChange(); // Ӧ���׳��쳣����Ϊû����Ʒ��¼
			} catch (IllegalStateException e) {
				System.out.println("����Ԥ���쳣: " + e.getMessage());
			}

		} catch (Exception e) {
			System.out.println("���Թ����з����������: " + e.getMessage());
			e.printStackTrace();
		}
	}
}