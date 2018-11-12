package CCFTest;

import java.util.Arrays;
import java.util.Scanner;

public class COBOL {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		char[] ch = new char[] {'C','O','B','O','L'};
		for (int i = 0; i < times; i++) {
			boolean flag = true;
			String[] split = scanner.next().split("-");
			for (int j = 0; j < split.length; j++) {
				char[] string = split[j].toUpperCase().toCharArray();
				if (!(string[0] == ch[j] || string[string.length-1] == ch[j])) {
					flag = false;
					break;
				} 
			}
			if (flag) {
				System.out.println("GRACE HOPPER");
			} else {
				System.out.println("BUG");
			}
		}
		scanner.close();
	}
	
}
