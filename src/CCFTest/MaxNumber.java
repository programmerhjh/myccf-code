package CCFTest;

import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int times = scanner.nextInt();
		
		for (int i = 1; i <= times; i++) {
			char[] N = scanner.next().toCharArray();
			int P = scanner.nextInt();
			int count = 0;
			while(P != 0) {
				if(N[count] != '9') {
					N[count] = '9';
					P --;
				}
				if (count == N.length - 1) {
					break;
				}
				count ++;
			}
			String result = "";
			for (int j = 0; j < N.length; j++) {
				result += N[j];
			}
			System.out.println("Case " + i + ":" + result);
		}
		
		scanner.close();
		
	}
	
}
