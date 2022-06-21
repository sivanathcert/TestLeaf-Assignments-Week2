package stringProg;

public class ReverseString {

	public static void main(String[] args) {
		String test="feeling good";
		int testLen = test.length();
		char [] testArr=test.toCharArray();

		for(int i=testLen-1;i>=0;i--) {
			System.out.println(testArr[i]);
		}
	}
}

