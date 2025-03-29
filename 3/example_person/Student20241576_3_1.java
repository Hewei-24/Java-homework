package example_person;

public class Student20241576_3_1 extends Person20241576_3_1{
	private String major;
	
	public Student20241576_3_1(String name, String sex, int birthYear,String major) {
		super(name, sex, birthYear);
		this.major = major;
	}

	public String getmajor() {
		return major;
	}
	
	public void setmajor(String major) {
		this.major = major;
	}
	
	public String toString() {
		return super.toString()+",רҵ:"+major;
		
	}

}
