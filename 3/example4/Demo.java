package example4;

public class Demo {
	public static void main(String[] args) {
		IMeasurable[] kids = new IMeasurable[3];
		kids[0] = new Kid("张明",2019);
		kids[1] = new Kid("王华",2018);
		kids[2] = new Kid("周楠",2021);
		double averageAge = Data.average(kids);
		System.out.println("平均年龄："+ String.format("%.2f", averageAge));
		IMeasurable[] provinces = new IMeasurable[3];
		provinces[0] = new Province("江苏省",107200);
		provinces[1] = new Province("湖南省",211800);
		provinces[2] = new Province("广东省",129725);
		double averageArea = Data.average(provinces);
		System.out.println("平均面积："+ String.format("%.2f", averageArea));
	}

}
