
public class Car20241576_2_2 {
	private double fuelConsumption;//�ͺ�
	private double fuelIntank;//��ǰ����
	
	//���췽��
	public Car20241576_2_2(double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
		this.fuelIntank = 0;
	}
	
	//ģ�⿪��
	public void drive(double distance) {
		double fuelUsed = (distance/100)*fuelConsumption;
		if(fuelUsed>=fuelIntank)
			System.out.println("not enough fuel to drive");
		else
			fuelIntank = fuelIntank - fuelUsed;
	}
	
	//����
	public void addGas(double amount) {
		fuelIntank = fuelIntank + amount;
	}
	
	//��������
	public double getGasIntank() {
		return fuelIntank;
	}
	
	public static void main(String[] args) {
		Car20241576_2_2 myCar = new Car20241576_2_2(7);
		myCar.addGas(30);;
		myCar.drive(50);
		double puelIntank = myCar.getGasIntank();
		System.out.println("puelIntank:"+puelIntank);
	}

}
