package example_NumberQuestion;
import java.util.Scanner;

public class QuestionDemo20241576_3_7 {
	public static void main(String[] args) {
		final int SIZE = 5;
		Question20241576_3_7[] quiz = new Question20241576_3_7[SIZE];
		Scanner reader = new Scanner(System.in);
		
		//�����
		quiz[0] = new Question20241576_3_7("�ҹ��Ĺ��������һ�죿");
		quiz[0].setAnswer("10��1��");
		
		//�����
		FillInQuestion20241576_3_7 question1 = new FillInQuestion20241576_3_7("\"������ѧ���ѳɣ�һ����������ᡣ\"����(����)�ġ�Ȱѧʫ����");
		quiz[1] = question1;
		
		//��ѡ��
		ChoiceQuestion20241576_3_7 question2 = new ChoiceQuestion20241576_3_7();
		question2.setText("�����ľ����Բ��ǳ��ԡ������");
		question2.addChoice("�������", true);
		question2.addChoice("������ѧ����������",false);
		question2.addChoice("�����У�������ʦ��",false);
		question2.addChoice("������������ʩ����",false);
		quiz[2] = question2;
		
		//��ѡ��
		MultiChoiceQuestion20241576_3_7 question3 = new MultiChoiceQuestion20241576_3_7();
		question3.setText("���н�������Щ���ҹ��Ĵ�ͳ����?");
		question3.addChoice("�����", true);
		question3.addChoice("�����", true);
		question3.addChoice("��ͯ��", false);
		question3.addChoice("������", true);
		quiz[3] = question3;
		
		//������
		NumericQuestion20241576_3_7 question4 = new NumericQuestion20241576_3_7("3*1.5=?");
		question4.setAnswer("4.5");
		quiz[4] = question4;
		
		for (Question20241576_3_7 q : quiz) {
			q.display();
			System.out.println("��Ĵ�:");
			String response = reader.nextLine();
			if(q.checkAnswer(response))
				System.out.println("�ش���ȷ");
			else
				System.out.println("�ش����");
		}
		reader.close();
	}
}
