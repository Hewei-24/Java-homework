
public class Java_3_20241576_2_6 {
	//点的坐标
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
	
	//以对象的形式返回当前点的位置
	public Java_3_20241576_2_6 getLocation() {
		//*********Found********
		Java_3_20241576_2_6 p = new Java_3_20241576_2_6(this.x,this.y);
		//*********Found********
		return p;
	}
	
	//返回点的横坐标
	public int getx() {
		return x;
	}
	
	//返回点的纵坐标
	public int gety() {
		return y;
	}
	
	//把当前点移到新的的位置
	public void move(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	//以（x,y）的格式返回点的位置
	public String tostring() {
		return "("+x+","+y+")";
	}
	
	//在原有坐标上分别增加x和y
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
