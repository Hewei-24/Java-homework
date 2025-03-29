package example2;

public class Demo {
	public static void main(String[] args) {
		Shape s[] = new Shape[3];
		s[0] = new Circle(5);
		s[1] = new Rectangle(4,5);
		s[2] = new Triangle(44,22,55);
		for(int i=0;i<s.length ;i++)
			System.out.println(String.format("%.2f", s[i].getArea()));
	}

}
