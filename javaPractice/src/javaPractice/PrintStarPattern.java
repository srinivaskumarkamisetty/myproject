package javaPractice;

public class PrintStarPattern {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int j = i; j <= i - 1; j--) {
				System.out.println("*");
			}
		}

	}
}
 