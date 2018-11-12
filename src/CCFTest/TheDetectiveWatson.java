package CCFTest;

import java.util.Scanner;

public class TheDetectiveWatson {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int time = 0, mid = 0, max = 0, result = 1, maxIndex = 0;
		while ((time = scanner.nextInt()) != 0) {
			int a[] = new int[time];
			for (int i = 0; i < time; i++) {
				a[i] = scanner.nextInt();
			}
			if (a[0] > a[1]) {
				mid = a[1];
				max = a[0];
				maxIndex = 1;
				result = 2;
			} else {
				mid = a[0];
				max = a[1];
				maxIndex = 2;
				result = 1;
			}
			for (int i = 2; i < a.length; i++) {
				int temp = a[i];
				if (temp > max) {
					mid = max;
					result = maxIndex;
					max = temp;
					maxIndex = i + 1;
				} else if (temp < max) {
					if (temp > mid) {
						mid = temp;
						result = i + 1;
					}
				}
			}
			System.out.println(result);
			result = 1;
			mid = 0;
			max = 0;
			maxIndex = 0;
		}
		scanner.close();
	}
	
}
