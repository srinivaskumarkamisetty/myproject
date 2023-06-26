package javaPractice;

public class CountWordsWithSpacesInString2 {

	public static void main(String[] args) {

		String S = "This is a sample sentence";
		int count = 1;

		for (int i = 0; i < S.length() - 1; i++)
		{

			if ((S.charAt(i) == ' ') && (S.charAt(i + 1) != ' '))
			{
                count++;
			}
		}
		System.out.println("count="+count);
	}
}
