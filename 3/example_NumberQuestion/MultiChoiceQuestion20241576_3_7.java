package example_NumberQuestion;

import java.util.ArrayList;

public class MultiChoiceQuestion20241576_3_7 extends Question20241576_3_7 {
	private ArrayList<String> choices;
	private String choiceString = "";
	private int numberOfChoices = 0;

	public MultiChoiceQuestion20241576_3_7() {
		choices = new ArrayList<String>();
	}

	public void addChoice(String choice, boolean correct) {
		choices.add(choice);
		numberOfChoices++;

		if (correct) {
			if (choiceString.length() == 0) {
				choiceString = "" + numberOfChoices;
			} else {
				choiceString = choiceString + " " + numberOfChoices;
			}
		}
		setAnswer(choiceString);
	}

	public void display() {
		super.display();
		for (int i = 0; i < choices.size(); i++) {
			int choiceNumber = i + 1;
			System.out.println(choiceNumber + ": " + choices.get(i));
		}
		System.out.println("请输入正确答案的编号，多个答案用空格分隔：");
	}
}