package example4;
import java.util.Calendar;

public class Kid implements IMeasurable{
	String name;
	int birthYear;
	public Kid() {};
	public Kid(String name,int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	public double getMeasure() {
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		System.out.println(year-birthYear);
		return year-birthYear;
	}
}
