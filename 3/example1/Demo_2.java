package example1;

public class Demo_2 {
	public static void main(String args[]) {
		
		Vehicle[] myVehicles = new Vehicle[4];
		
		Car myCar1 = new Car("Benz",4,"ª¶E12233");
		Car myCar2 = new Car();
		myCar2.setBrand("BYD");
		myCar2.setLicensePlateNumber("À’E233456");
		
		Bicycle mybike1 = new Bicycle("Giant",2,"children");
		Bicycle mybike2 = new Bicycle();
		mybike2.setBrand("Forever");
		mybike2.setForPeople("Famale");
		
		myVehicles[0] = myCar1;
		myVehicles[1] = myCar2;
		myVehicles[2] = mybike1;
		myVehicles[3] = mybike2;
		
		for (Vehicle t : myVehicles) {
			t.showInfo();
		}
	}

}
