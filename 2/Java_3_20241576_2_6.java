
public class Java_3_20241576_2_6 {
	//�������
	int x,y;
	public Java_3_20241576_2_6() {}
	//*********Found********
	public Java_3_20241576_2_6(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	//*********Found********
	public Java_3_20241576_2_6(Java_3_20241576_2_6 p){
		this.x = p.x;
		this.y = p.y;
	}
	
	//�Զ������ʽ���ص�ǰ���λ��
	public Java_3_20241576_2_6 getLocation() {
		//*********Found********
		Java_3_20241576_2_6 p = new Java_3_20241576_2_6(this.x,this.y);
		//*********Found********
		return p;
	}
	
	//���ص�ĺ�����
	public int getx() {
		return x;
	}
	
	//���ص��������
	public int gety() {
		return y;
	}
	
	//�ѵ�ǰ���Ƶ��µĵ�λ��
	public void move(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	//�ԣ�x,y���ĸ�ʽ���ص��λ��
	public String tostring() {
		return "("+x+","+y+")";
	}
	
	//��ԭ�������Ϸֱ�����x��y
	public void translate(int x,int y){
		this.x += x;
		this.y += y;
	}

	public static void main(String[] args) {
		//*********Found********
		Java_3_20241576_2_6 p = new Java_3_20241576_2_6(5,5);
		System.out.println("x="+p.x+"y="+p.y);
		System.out.println("Location is"+ p.toString());
		//*********Found********
		p.translate(3, 4);
		System.out.println("x="+ p.x+" y="+ p.y);
		System.out.println("Location is"+ p.toString());
	}

}
