
public class ComplexNumber {
	private double x,y;
	//构造方法
	public ComplexNumber(double real,double imaginary) {
		this.x = real;
		this.y = imaginary;
	}
	public String toString() {return "{" + x + "," + y + "}";	}
	
	//两复数相加
	public static ComplexNumber add(ComplexNumber a,ComplexNumber b) {
		return new ComplexNumber(a.x + b.x, a.y + b.y);
	}
	
	//本复数加一个复数
	public ComplexNumber add(ComplexNumber a) {
		return new ComplexNumber(this.x + a.x, this.y + a.y);
	}
	
	//两复数相乘
	public static ComplexNumber multiply(ComplexNumber a,ComplexNumber b) {
		return new ComplexNumber(a.x*b.x - a.y*b.y,a.x*b.y + a.y*b.x);
	}
	
	//本复数再乘以个复数
	public ComplexNumber multiply(ComplexNumber a) {
		return new ComplexNumber(x*a.x - y*a.y,x*a.y + y*a.x);
	}
	public static void main(String[] args) {
		ComplexNumber x,y,z;
		x=new ComplexNumber(Double.parseDouble(args[1]),Double.parseDouble(args[2]));
		y=new ComplexNumber(Double.parseDouble(args[3]),Double.parseDouble(args[4]));
		
		if(args[0].equals("+"))
			z=add(x,y);
		else
			z=x.multiply(y);
		System.out.println("result="+z);
	}
}
