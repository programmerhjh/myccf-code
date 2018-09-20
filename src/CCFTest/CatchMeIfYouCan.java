package CCFTest;

import java.util.Scanner;

public class CatchMeIfYouCan {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int times = scanner.nextInt();
		
		for (int i = 0; i < times; i++) {
			int v1 = scanner.nextInt();
			int v2 = scanner.nextInt();
			int d = scanner.nextInt();
			int t = scanner.nextInt();
			if(d == 0 && t != 0) {
				System.out.println("Case " + (i + 1) + ": Abir will be arrested");
				continue;
			}
			if (v1 * t <= v2 * t + d) {
				System.out.println("Case " + (i + 1) + ": Abir will survive");
			}else {
				System.out.println("Case " + (i + 1) + ": Abir will be arrested");
			}
			
		}
		
	}
	
}
