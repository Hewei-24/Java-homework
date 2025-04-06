package example_exception;

public class People20241576_4_2 {
	void printLetter(char c) throws NoLowerLetter20241576_4_2{
		if(c<'a' ||c>'z') {
			NoLowerLetter20241576_4_2 noLowerLetter = new NoLowerLetter20241576_4_2();
			throw noLowerLetter;
		}else {
			System.out.print(c);
		}
	}
	void printDigit(char c) throws NoDigit20241576_4_2{
		if(c<'1' ||c>'9') {
			NoDigit20241576_4_2 noDigit= new NoDigit20241576_4_2();
			throw noDigit;
		}else {
			System.out.print(c);
		}
	}
}
