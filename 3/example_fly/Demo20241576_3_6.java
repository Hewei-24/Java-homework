package example_fly;

public class Demo20241576_3_6 {
	public static void makeFly(Canfly20241576_3_6 obj) {
		obj.fly();
	}
	public static void main(String[] args) {
		makeFly(new Plane20241576_3_6());
		makeFly(new Bird20241576_3_6());
	}

}
