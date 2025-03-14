
public class Car20241576_2_2 {
	private double fuelConsumption;//油耗
	private double fuelIntank;//当前油量
	
	//构造方法
	public Car20241576_2_2(double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
		this.fuelIntank = 0;
	}
	
	//模拟开车
	public void drive(double distance) {
		double fuelUsed = (distance/100)*fuelConsumption;
		if(fuelUsed>=fuelIntank)
			System.out.println("not enough fuel to drive");
		else
			fuelIntank = fuelIntank - fuelUsed;
	}
	
	//加油
	public void addGas(double amount) {
		fuelIntank = fuelIntank + amount;
	}
	
	//返回油量
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
