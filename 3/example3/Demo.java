package example3;

public class Demo {

	public static void main(String[] args) {
		System.out.println("我想听收音机广播");
		ISoundControl theSound = new Radio();
		theSound.playSound();
		System.out.println("我不想听收音机广播");
		theSound.turnOffSound();
		
		System.out.println("有人给我打电话了");
		theSound = new CellPhone();
		theSound.playSound();
		System.out.println("讲话结束了");
		theSound.turnOffSound();
	}

}
