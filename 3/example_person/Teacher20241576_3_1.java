package example_person;

public class Teacher20241576_3_1 extends Person20241576_3_1{
	public double salary;
	
	public Teacher20241576_3_1(String name, String sex, int birthYear,double salary) {
		super(name, sex, birthYear);
		this.salary = salary;
	}

	public double getsalary() {
		return salary;
	}
	
	public void setsalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return super.toString()+",¹¤×Ê:"+salary;
	}

}
