package example1;

public class Bicycle extends Vehicle{
	private String forPeople;
	public Bicycle() {
		this.setNumberOfTires(2);
	}
	
	public Bicycle(String brand,int numberOfTires,String forPeople) {
		super(brand,numberOfTires);
		this.forPeople = forPeople;
	}
	
	public String getForPeople() {
		return forPeople;
	}
	
	public void setForPeople(String foePeople) {
		this.forPeople = forPeople;
	}
	
	void showInfo() {
	super.showInfo();
	System.out.println("license:"+this.forPeople );
	}

}
