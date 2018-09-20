package CCFTest;

import java.util.Scanner;

public class AllShootingGames {
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
				while ((beginNumber = 4 * beginNumber + 2) <= end) {
					result++;
				}
				System.out.println("Case " + i + ": " + result);
				continue;
			} else {
				int pow = 1;
				long temp = 0;
				while (Math.pow(2, pow) < start) {
					pow++;
				}
				if (pow % 2 == 0) {
					int tempPow = pow - 1;
					int tempSum = 0;
					while (true) {
						tempSum += Math.pow(2, tempPow);
						if (tempPow == 1) {
							break;
						}
						tempPow -= 2;
					}
					if (tempSum == start) {
						result = 1;
						beginNumber = start;
						while ((beginNumber = 4 * beginNumber + 2) <= end) {
							result++;
						}
						System.out.println("Case " + i + ": " + result);
						continue;
					} else {
						int tempSum2 = 0;
						if (tempSum > start) {
							pow = pow - 1;
						} else {
							pow = pow + 1;
						}
						while (true) {
							tempSum2 += Math.pow(2, pow);
							if (pow == 1) {
								break;
							}
							pow -= 2;
						}
						beginNumber = tempSum2;
						while (beginNumber <= end) {
							beginNumber = 4 * beginNumber + 2;
							result++;
						}
						System.out.println("Case " + i + ": " + result);
						continue;
					}
				} else {
					while (true) {
						temp += Math.pow(2, pow);
						if (pow == 1) {
							break;
						}
						pow -= 2;
					}
					if (temp == start) {
						result = 1;
					}
					beginNumber = temp;
					while ((beginNumber = 4 * beginNumber + 2) <= end) {
						result++;
					}
					System.out.println("Case " + i + ": " + result);
					continue;
				}
			}
		}

	}
}
