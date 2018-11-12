package CCFTest;

import java.util.Scanner;

public class SwapCoin {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = 8;
		int m = scanner.nextInt();
		int p = m-t;
		if (p < 0) {
			System.out.println(0);
		} else {
			int two = p/2;
			int five = p/5;
			int result = 0;
			for (int i = 1; i <= five; i++) {
				int p1 = p - i*5;
				result += p1/2 +1;
			}
			System.out.println(1 + two + result);
		}
		scanner.close();
	}
}
