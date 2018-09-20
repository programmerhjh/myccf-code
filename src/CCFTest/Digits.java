package CCFTest;

import java.util.Scanner;

public class Digits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < times; i++) {
			stringBuffer.delete(0, stringBuffer.length());
			Long temp = scanner.nextLong();
			if (temp == 0) {
				System.out.println(1);
				continue;
			}
			while(!(temp / 2 == 0 && temp % 2 == 1)) {
				stringBuffer = stringBuffer.insert(0, temp % 2);
				temp = temp / 2;
			}
			stringBuffer = stringBuffer.insert(0, temp % 2);
			System.out.println(stringBuffer.toString().length());
		}
		scanner.close();
	}
}
