
public class methonMatch20241576_3_2 {
	double x = 5,y = 6;
	void test(double y) {
		test(this);
	}
	
	public String toString() {
		return x+","+y;
	}
	
	void test(String a) {
		System.out.println(a);
	}
	
	void test(Object a) {
		System.out.println(a);
	}
	
	public static void main(String args[]) {
		methonMatch20241576_3_2 a = new methonMatch20241576_3_2();
		a.test(8);
		a.test("hello");
	}
}
