package example3;

public class Demo {

	public static void main(String[] args) {
		System.out.println("�������������㲥");
		ISoundControl theSound = new Radio();
		theSound.playSound();
		System.out.println("�Ҳ������������㲥");
		theSound.turnOffSound();
		
		System.out.println("���˸��Ҵ�绰��");
		theSound = new CellPhone();
		theSound.playSound();
		System.out.println("����������");
		theSound.turnOffSound();
	}

}
