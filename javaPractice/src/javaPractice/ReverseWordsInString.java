package javaPractice;

public class ReverseWordsInString {
	public static void main(String[] args) {

		String s = "welcome to java";

		String[] word = s.split(" ");

		String reverseword = "";

		for (String w : word) {

			String reversecount = "";

			for (int i = w.length() - 1; i >= 0; i--) {
				reversecount = reversecount + w.charAt(i);
			}
			reverseword = reverseword + reversecount + " ";

		}

		System.out.println(reverseword);

	}
}
