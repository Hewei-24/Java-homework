package example_array;

public class ArrayBoundException20241576_4_3 {
	public static void method1() {
		int[] a = new int[3];
		try {
			System.out.println(a[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("����Խ���쳣��"+e.getMessage());
		}
	}
	
	public static void method2() throws ArrayIndexOutOfBoundsException{
		int []a = new int[3];
		System.out.println(a[3]);
	}
	
	public static void main(String[] args) {
		//���Է���һ
		System.out.println("��ʽһ������");
		method1();
		
		//���Է�����
		System.out.println("\n������������");
		try {
			method2();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("��������Խ���쳣��"+e.getMessage());
		}
	}
}
