
public class ComplexNumber {
	private double x,y;
	//���췽��
	public ComplexNumber(double real,double imaginary) {
		this.x = real;
		this.y = imaginary;
	}
	public String toString() {return "{" + x + "," + y + "}";	}
	
	//���������
	public static ComplexNumber add(ComplexNumber a,ComplexNumber b) {
		return new ComplexNumber(a.x + b.x, a.y + b.y);
	}
	
	//��������һ������
	public ComplexNumber add(ComplexNumber a) {
		return new ComplexNumber(this.x + a.x, this.y + a.y);
	}
	
	//���������
	public static ComplexNumber multiply(ComplexNumber a,ComplexNumber b) {
		return new ComplexNumber(a.x*b.x - a.y*b.y,a.x*b.y + a.y*b.x);
	}
	
	//�������ٳ��Ը�����
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
