package javaPractice;

public class DuplicateElementsInString {
	public static void main(String[] args) {

		String s = "DellD";
		int count=0;

		char ch[] = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					System.out.println("element found=  " + ch[j]);
                    count++;
				}
			}
			
		}System.out.println("count=  "+count);
	}
}
