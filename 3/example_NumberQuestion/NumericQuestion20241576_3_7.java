package example_NumberQuestion;

public class NumericQuestion20241576_3_7 extends Question20241576_3_7 {

	public NumericQuestion20241576_3_7(String text) {
		setText(text);
	}

	public boolean checkAnswer(String response) {
		try {
			double studentAnswer = Double.parseDouble(response);
			double expectedAnswer = Double.parseDouble(getAnswer());
			return Math.abs(studentAnswer - expectedAnswer) <= 0.005;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}