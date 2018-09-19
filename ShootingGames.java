package CCFTest;

import java.util.Scanner;

public class ShootingGames {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		for (int i = 1; i <= times; i++) {
			long start = scanner.nextLong();
			long end = scanner.nextLong();
			int result = 0;
			long beginNumber;
			if (end == start) {
				System.out.println("Case " + i + ": " + result);
				continue;
			}

			if (start == 1) {
				beginNumber = 2;
				result = 1;
				while((beginNumber = 4 * beginNumber + 2) <= end) {
					result ++;
				}
				System.out.println("Case " + i + ": " + result);
				continue;
			}
		}
		scanner.close();
	}
}
