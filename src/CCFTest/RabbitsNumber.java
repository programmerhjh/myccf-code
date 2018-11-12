package CCFTest;

import java.util.Scanner;

public class RabbitsNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nextInt = scanner.nextInt();
		if (nextInt <= 2) {
			System.out.println(1);
			return;
		}
		int a[] = new int[nextInt];
		a[0] = 1;
		a[1] = 1;
		for (int i = 2; i < a.length; i++) {
			a[i] = a[i-1] + a[i-2];
		}
		System.out.println(a[nextInt-1]);
		scanner.close();
	}
}
