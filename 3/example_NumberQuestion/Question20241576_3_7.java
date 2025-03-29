package example_NumberQuestion;

public class Question20241576_3_7 {
	private String text;
	private String answer;
	
	public Question20241576_3_7(String questionText) {
		text = questionText;
		answer = "";
	}
	
	public Question20241576_3_7() {
		text = "";
		answer = "";
	}
	
	public void setAnswer(String correctResponse) {
		answer = correctResponse;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public boolean checkAnswer(String response) {
		return response.equals(answer);
	}
	
	public void display() {
		System.out.println(text); 
	}
	
	public String getAnswer() {
		return answer;
	}

}
