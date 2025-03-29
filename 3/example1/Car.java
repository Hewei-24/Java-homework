package example1;

public class Car extends Vehicle {
	private String licensePlateNumber;
	public Car() {
		this.setNumberOfTires(4);
		this.licensePlateNumber = "12345";
		System.out.println("this is son constructor without params.");
	}
	
	public Car(String brand,int numberOfTires,String licensePlateNumber) {
		super(brand,numberOfTires);
		this.licensePlateNumber = licensePlateNumber;
		System.out.println("this is son constructor with params");
	}
	
	public String getLicensePlateNumber() {
		return this.licensePlateNumber ;
	}
	
	public void setLicensePlateNumber(String newValue) {
		this.licensePlateNumber = newValue;
	}
	
	void showInfo() {
	super.showInfo();
	System.out.println("license:"+this.getLicensePlateNumber());
	}

}
