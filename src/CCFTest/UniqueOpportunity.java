package CCFTest;

import java.util.Scanner;

public class UniqueOpportunity {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		for (int j = 0; j < times; j++) {
			int len = scanner.nextInt();
			char[] charArray = scanner.next().toCharArray();
			int temp = charArray[0], n1 = 0, n2 = 0, n3 = 0, n3Index = 0, rs = 0;
			for (int i = 1; i < charArray.length; i++) {
				int ch = charArray[i];
				if (ch-1 > temp) {
					n1 ++;
					if (n3Index == 0) {
						if (Math.abs(n3 - temp) == Math.abs((i-1) - n3Index)) {
							rs ++;
							n3 = 0;
							n3Index = 0;
							temp = ch;
							continue;
						}
					}
					if (n3 != 0) {
						if (Math.abs(n3 - ch) == Math.abs(i - n3Index)) {
							rs ++;
							n3 = 0;
							n3Index = 0;
							temp = ch;
							continue;
						}
					} else {
						n3 = ch;
					}
					n3Index = i;
				} else if (ch-1 < temp) {
					n2 ++;
					if (n3 != 0) {
						if (Math.abs(n3 - ch) == Math.abs(i - n3Index)) {
							rs ++;
							n3 = 0;
							n3Index = 0;
							temp = ch;
							continue;
						}
					} else {
						n3 = temp;
					}
					n3Index = i-1;
				} 
				temp = ch;
			}
			if ((rs == 1 && (n1 == n2 || (n1 == 0 && n2 == 2) || (n1 == 2 && n2 == 1)))) {
				System.out.println("There are the chance.");
			} else {
				if (n1 == 0 && len == 2 && n2 == 1) {
					if (Math.abs(charArray[0] - charArray[1]) == 1) {
						System.out.println("There are the chance.");
					} else {
						System.out.println("There aren't the chance.");
					}
				} else {
					System.out.println("There aren't the chance.");
				}
			}
		}
		scanner.close();
	}
	
}
