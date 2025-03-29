package example_person;

public class Person20241576_3_1 {
	private String name;
	private String sex;
	private int birthYear;
	
	public Person20241576_3_1(String name,String sex,int birthYear) {
		this.name = name;
		this.sex = sex;
		this.birthYear = birthYear;
	}
	
	public String getname() {
		return name;
	}

	public String getsex() {
		return sex;
	}
	
	public int getbirthYear() {
		return birthYear;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public void stesex(String sex) {
		this.sex = sex;
	}
	
	public void setbirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public String toString() {
		return "姓名："+name+",性别："+sex+",出生年份："+birthYear;
	}
}
