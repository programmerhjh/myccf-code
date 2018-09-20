package CCFTest;

import java.util.ArrayList;
import java.util.Scanner;

public class AutomaticRewindingMachine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> arrayList = new ArrayList<>();
		while (true) {
			int times = scanner.nextInt();
			if (times == 0) {
				break;
			}

			for (int i = 0; i < times; i++) {
				for (int j = 0; j < 5; j++) {
					arrayList.add(scanner.nextInt());
				}
				int valid = 0;
				int result = 0;
				for (int k = 1; k <= 5; k++) {
					if (arrayList.get(k-1) <= 127) {
						++ valid;
						result = k;
					}
				}
				if (valid == 1) {
					printResult(result);
				} else {
					System.out.println("*");
				}
				arrayList.clear();
			}
		}
	}

	public static void printResult(int i) {
		switch (i) {
			case 1:
				System.out.println("A");
				break;
			case 2:
				System.out.println("B");
				break;
			case 3:
				System.out.println("C");
				break;
			case 4:
				System.out.println("D");
				break;
			case 5:
				System.out.println("E");
				break;
			default:
				break;
		}
	}
}
