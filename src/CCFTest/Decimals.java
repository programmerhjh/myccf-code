package CCFTest;

import java.util.Scanner;

public class Decimals {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int times = scanner.nextInt();
		
		StringBuffer stringBuffer = new StringBuffer();
		
		for (int i = 0; i < times; i++) {
			int x = scanner.nextInt();
			System.out.println(stringBuffer.append(x).length());
			stringBuffer.delete(0, stringBuffer.length());
		}
		
	}
	
}
