package example1;

public class Demo {
	public static void main(String args[]) {
		Car myCar1 = new Car();
		myCar1.setBrand("BYD");
		myCar1.setLicensePlateNumber("À’E223344");
		myCar1.showInfo();
		
		Car myCar2 = new Car("Benz",4,"ª¶E112233");
		myCar2.showInfo();
		
		Bicycle myBicycle1 = new Bicycle();
		myBicycle1.setBrand("Giant");
		myBicycle1.setForPeople("kid");
		myBicycle1.showInfo();
		
		Bicycle myBicycle2 = new Bicycle("Forever",2,"Female");
		myBicycle2.showInfo();
	}

}
