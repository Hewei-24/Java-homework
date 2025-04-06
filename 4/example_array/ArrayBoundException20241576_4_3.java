package example_array;

public class ArrayBoundException20241576_4_3 {
	public static void method1() {
		int[] a = new int[3];
		try {
			System.out.println(a[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("数组越界异常："+e.getMessage());
		}
	}
	
	public static void method2() throws ArrayIndexOutOfBoundsException{
		int []a = new int[3];
		System.out.println(a[3]);
	}
	
	public static void main(String[] args) {
		//测试方法一
		System.out.println("方式一处理结果");
		method1();
		
		//测试方法二
		System.out.println("\n方法二处理结果");
		try {
			method2();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("捕获到数组越界异常："+e.getMessage());
		}
	}
}
