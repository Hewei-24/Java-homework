package example_NumberQuestion;

import java.util.ArrayList;

public class ChoiceQuestion20241576_3_7 extends Question20241576_3_7{
	private ArrayList<String> choices;
	
	public ChoiceQuestion20241576_3_7() {
		choices = new ArrayList<String>();
	}
	
	public void addChoice(String choice,boolean correct) {
		choices.add(choice);
		if(correct) {
			String choiceString = ""+choices.size();
			setAnswer(choiceString);
		}
	}
	
	public void display() {
		super.display();
		for(int i=0;i<choices.size();i++) {
			int choiceNumber = i+1;
			System.out.println(choiceNumber + ":"+choices.get(i));
		}
	}
}
 