package example1;

public class Vehicle {
	private String brand;
	private int numberOfTires;
	
	public Vehicle() {
		System.out.println("this is constructor without params");
	}
	
	public Vehicle(String brand,int numberOfTires){
		this.brand =brand;
		this.numberOfTires = numberOfTires;
		System.out.println("this is constructor with params");
	}

	public String getBrand() {
		return brand;
	}
	
	public int getNumberOfTires() {
		return numberOfTires;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setNumberOfTires(int newValue) {
		this.numberOfTires = newValue;
	}
	
	void showInfo() {
		System.out.println("(from parent)brand:" + brand);
		System.out.println("(from parent)wheels:" + numberOfTires);
	}
}
