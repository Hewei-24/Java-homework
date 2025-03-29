package example3;

public class Radio implements ISoundControl{
	public void playSound() {
		System.out.println("您现在正在收听中国之声节目！");
	}
	public void turnOffSound() {
		System.out.println("您正在退出收音机广播节目，再见！");
	}

}
