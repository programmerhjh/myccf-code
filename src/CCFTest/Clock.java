package CCFTest;

import java.util.Scanner;

public class Clock {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int H1 = scanner.nextInt();
			int M1 = scanner.nextInt();
			int H2 = scanner.nextInt();
			int M2 = scanner.nextInt();
			if (H1 == 0 && M1 == 0 && H2 == 0 && M2 == 0) {
				break;
			}
			if(H1 > H2 || ((H1 == H2) && (M1 > M2))) {
				int result = ((24 - H1) * 60 - M1) + H2 * 60 + M2;
				System.out.println(result);
			}else {
				int result = (H2 * 60 + M2) - (H1 * 60 + M1);
				System.out.println(result);
			}
		}
		
	}
	
	
}
