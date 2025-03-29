package example3;

public class CellPhone implements ISoundControl{
	public void playSound() {
		System.out.println("手机铃声响了");
	}
	public void turnOffSound() {
		System.out.println("通话结束，再见！");
	}

}
