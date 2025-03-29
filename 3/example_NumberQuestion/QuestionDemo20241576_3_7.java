package example_NumberQuestion;
import java.util.Scanner;

public class QuestionDemo20241576_3_7 {
	public static void main(String[] args) {
		final int SIZE = 5;
		Question20241576_3_7[] quiz = new Question20241576_3_7[SIZE];
		Scanner reader = new Scanner(System.in);
		
		//简答题
		quiz[0] = new Question20241576_3_7("我国的国庆节是哪一天？");
		quiz[0].setAnswer("10月1日");
		
		//填空题
		FillInQuestion20241576_3_7 question1 = new FillInQuestion20241576_3_7("\"少年易学老难成，一寸光阴不可轻。\"出自(朱熹)的《劝学诗》。");
		quiz[1] = question1;
		
		//单选题
		ChoiceQuestion20241576_3_7 question2 = new ChoiceQuestion20241576_3_7();
		question2.setText("下列哪句名言不是出自《论语》？");
		question2.addChoice("厚德载物", true);
		question2.addChoice("敏而好学，不耻下问",false);
		question2.addChoice("三人行，必有我师焉",false);
		question2.addChoice("己所不欲，勿施于人",false);
		quiz[2] = question2;
		
		//多选题
		MultiChoiceQuestion20241576_3_7 question3 = new MultiChoiceQuestion20241576_3_7();
		question3.setText("下列节日中哪些是我国的传统节日?");
		question3.addChoice("中秋节", true);
		question3.addChoice("端午节", true);
		question3.addChoice("儿童节", false);
		question3.addChoice("重阳节", true);
		quiz[3] = question3;
		
		//计算题
		NumericQuestion20241576_3_7 question4 = new NumericQuestion20241576_3_7("3*1.5=?");
		question4.setAnswer("4.5");
		quiz[4] = question4;
		
		for (Question20241576_3_7 q : quiz) {
			q.display();
			System.out.println("你的答案:");
			String response = reader.nextLine();
			if(q.checkAnswer(response))
				System.out.println("回答正确");
			else
				System.out.println("回答错误");
		}
		reader.close();
	}
}
