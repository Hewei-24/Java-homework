package example4;

public class Demo {
	public static void main(String[] args) {
		IMeasurable[] kids = new IMeasurable[3];
		kids[0] = new Kid("����",2019);
		kids[1] = new Kid("����",2018);
		kids[2] = new Kid("���",2021);
		double averageAge = Data.average(kids);
		System.out.println("ƽ�����䣺"+ String.format("%.2f", averageAge));
		IMeasurable[] provinces = new IMeasurable[3];
		provinces[0] = new Province("����ʡ",107200);
		provinces[1] = new Province("����ʡ",211800);
		provinces[2] = new Province("�㶫ʡ",129725);
		double averageArea = Data.average(provinces);
		System.out.println("ƽ�������"+ String.format("%.2f", averageArea));
	}

}
