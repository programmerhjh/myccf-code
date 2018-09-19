package CCFTest;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		scanner.nextLine();
		StringBuffer temp = new StringBuffer();
		for (int i = 0; i < times; i++) {
			temp.delete(0, temp.length());
			String nextLine = scanner.nextLine();
			temp.append(nextLine);
			System.out.println(temp.reverse().toString());
		}
	}
}
