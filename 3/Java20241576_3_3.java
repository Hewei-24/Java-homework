
public class Java20241576_3_3 {
	public static void main(String[] args){
	Person p = new Student("王甜甜", "计算机科学");
	System.out.println(p.getName() + ", "+ p.getDescription());
	}
}

	abstract class Person{
		public Person(String n){
			name = n;
		}
	//*********Found********
	public abstract String getDescription();
		public String getName(){
			return name;
		}
		private String name;
	}
	//*********Found********
	class Student extends Person{
	public Student(String n, String m){
		super(n);
		major = m;
}
	//*********Found********
	public String getDescription(){
		return "学生专业是:" + major;
}
private String major;

}
