import java.util.InputMismatchException;
import java.util.Scanner;

public class CashRegister20241576_4_5 {
	// 定义成员变量
	private double purchase; // 总销售额
	private double payment; // 付款金额
	private String history; // 购买的商品价格清单
	private int SalesCount;
	private double SalesTotal;

	// 定义构造方法
	public CashRegister20241576_4_5() {
		purchase = 0;
		payment = 0;
		history = "";
		SalesCount = 0;
		SalesTotal = 0;
	}

	public void recordPuchase(double amount) throws IllegalArgumentException {
		if (amount < 0) {
			throw new IllegalArgumentException("商品金额不能为负数: " + amount);
		}
		purchase = purchase + amount;
		// 将购买的每一个商品价格记录在字符串history中
		history = history + String.format("%.2f", amount) + "\n";
		SalesTotal = SalesTotal + amount;
	}

	public void receivePayment(double amount) throws IllegalArgumentException, IllegalStateException {
		if (amount < 0) {
			throw new IllegalArgumentException("付款金额不能为负数: " + amount);
		}
		if (purchase <= 0) {
			throw new IllegalStateException("没有商品记录，不能付款");
		}
		payment = payment + amount;
		SalesCount++;
	}

	public double giveChange() throws IllegalStateException {
		if (payment < purchase) {
			throw new IllegalStateException(String.format("付款不足，还需 %.2f 元", purchase - payment));
		}
		double change = payment - purchase;
		// 本次购买完成，为下一次购买重置各个成员变量
		purchase = 0;
		payment = 0;
		history = "";
		return change;
	}

	public void printReceipt() {
		if (history.isEmpty()) {
			System.out.println("没有购买记录");
			return;
		}
		System.out.println("购物清单:\n" + history);
		System.out.printf("总计: %.2f 元\n", purchase);
	}

	// 总销售额
	public double getSalesTotal() {
		return SalesTotal;
	}

	// 订单数量
	public int getSalesCount() {
		return SalesCount;
	}

	// 主方法
	public static void main(String[] args) {
		// 自动测试
		try {
			CashRegister20241576_4_5 register = new CashRegister20241576_4_5();
			double change;

			System.out.println("第一次购买");
			register.recordPuchase(30);     // 商品1：30元
			register.recordPuchase(15.5);  // 商品2：15.5元
			register.receivePayment(50);    // 顾客支付50元
			register.printReceipt();        // 打印购物价格清单
			change = register.giveChange(); // 计算零钱
			System.out.printf("找零: %.2f 元\n", change);

			System.out.println("\n第二次购买");
			register.recordPuchase(60);
			register.recordPuchase(28);
			register.recordPuchase(2.2);
			register.receivePayment(100);
			register.printReceipt();
			change = register.giveChange();
			System.out.printf("找零: %.2f 元\n", change);

			System.out.println("\n销售统计");
			System.out.printf("总销售额: %.2f 元\n", register.getSalesTotal());
			System.out.println("订单数量: " + register.getSalesCount());

			// 测试异常情况
			System.out.println("\n测试异常情况");
			try {
				register.recordPuchase(-10); // 应该抛出异常
			} catch (IllegalArgumentException e) {
				System.out.println("捕获到预期异常: " + e.getMessage());
			}

			try {
				register.receivePayment(-50); // 应该抛出异常
			} catch (IllegalArgumentException e) {
				System.out.println("捕获到预期异常: " + e.getMessage());
			}

			try {
				register.giveChange(); // 应该抛出异常，因为没有商品记录
			} catch (IllegalStateException e) {
				System.out.println("捕获到预期异常: " + e.getMessage());
			}

		} catch (Exception e) {
			System.out.println("测试过程中发生意外错误: " + e.getMessage());
			e.printStackTrace();
		}
	}
}