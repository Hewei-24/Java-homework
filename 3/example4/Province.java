package example4;

public class Province implements IMeasurable{
	private String name;
	private double area;
	
	public Province(String nme,double area) {
		this.name = name;
		this.area = area;
	}
	
	public double getMeasure() {
		return area;
	}
}
