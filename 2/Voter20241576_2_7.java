
public class Voter20241576_2_7 {
	String name;
	static String[] candidates = {"Zhangsan","Lisi","Wangwu"};
	static int[] polls = {0,0,0};
	public Voter20241576_2_7(String name) {
		this.name = name;
		
	}
	
	public boolean voteFor(String name) {
		boolean flag = false;
		for(int i=0;i<candidates.length ;i++) {
			if(name.equalsIgnoreCase(candidates[i])) {
				polls[i]++;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public static void main(String[] args) {
		Voter20241576_2_7[] voters = new Voter20241576_2_7[4];
		//创建投票人对象
		voters[0] = new Voter20241576_2_7("Zhaofang");
		voters[1] = new Voter20241576_2_7("Sunhua");
		voters[2] = new Voter20241576_2_7("Zhangli");
		voters[3] = new Voter20241576_2_7("Lili");
		//投票人投票
		voters[0].voteFor("ZhangSan");
		voters[1].voteFor("Lisi");
		voters[2].voteFor("Wangwu");
		voters[3].voteFor("Wangwu");
		//查找票数得票最多的人选与票数
		int pollmax = 0;
		int indexMax = 0;
		for(int i=0 ; i<polls.length ; i++) {
			if(polls[i] > pollmax) {
				indexMax = i;
			}
		}
		System.out.println("the max polls is:"+polls[indexMax]);
		System.out.println("the name is:"+candidates[indexMax]);
	}

}
