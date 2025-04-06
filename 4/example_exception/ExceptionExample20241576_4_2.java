package example_exception;

public class ExceptionExample20241576_4_2 {
	public static void main(String[] args) {
		People20241576_4_2 people = new People20241576_4_2();
		
		for(int i = 0;i<128;i++) {
			try {
				people.printLetter((char)i);
			}catch(NoLowerLetter20241576_4_2 e) {
				e.print();
			}
		}
		
		for(int i = 0;i<128;i++) {
			try {
				people.printDigit((char)i);
			}catch(NoDigit20241576_4_2 e) {
				e.print();
			}
		}
	}
}
