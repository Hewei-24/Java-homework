class point{
	private int x;
	private int y;
	public point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public int getx() {
		return x;
	}
	public int gety() {
		return y;
	}
	
}

public class Circle20241576_2_5 {
	private point center;
	private double radius;
	
	//构造方法
	public Circle20241576_2_5(point center,double radius) {
		this.center= center;
		this.radius = radius;
	}
	//求面积
	public double area() {
		return 3.14*radius*radius;
	}
	
	//表示信息
	public void show() {
		System.out.println("圆的半径："+radius);
		System.out.println("圆的面积："+area());
		System.out.println("圆的圆心："+center.getx()+","+center.gety());
	}
	
	//main
	public static void main(String[] args) {
		point center=new point(0,0);
		Circle20241576_2_5 circle=new Circle20241576_2_5(center,3.5);
		circle.area();
		circle.show();
		
	}
}
