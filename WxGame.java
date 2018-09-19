package CCFTest;

import java.util.Scanner;

public class WxGame {

	public static void main(String[] args) {
		int result = 0;
		int temp = 0;
		Scanner scanner = new Scanner(System.in);
		String[] array = scanner.nextLine().split(" ");
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals("0")) {
				break;
			}else if (array[i].equals("1")) {
				result += 1;
				temp = 1;
			}else if (array[i].equals("2")) {
				if (i == 0 || temp == 1) {
					result += 2;
					temp = 2;
				}else {
					result += temp + 2;
					temp += 2;
				}
			}
		}
		System.out.println(result);
		scanner.close();
	}
	
}
