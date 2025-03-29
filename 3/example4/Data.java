package example4;

public class Data {
	public static double average(IMeasurable[] objects) {//接口类型参数
		double sum = 0;
		for(IMeasurable obj : objects) {
			sum = sum + obj.getMeasure();
		}
		if(objects.length > 0) {
			return sum / objects.length;
		}else {
			return 0;
		}
	}
}
