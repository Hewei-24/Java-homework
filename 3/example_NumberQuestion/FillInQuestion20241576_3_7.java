package example_NumberQuestion;

public class FillInQuestion20241576_3_7 extends Question20241576_3_7{
	public FillInQuestion20241576_3_7(String text) {
		int start = text.indexOf("(");
		int end = text.lastIndexOf(")");
		String questionText = text.substring(0,start+1)+"____"+text.substring(end);
		setText(questionText);
		setAnswer(text.substring(start+1,end));
	}

}
