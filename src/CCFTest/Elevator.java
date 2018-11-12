package CCFTest;

import java.util.Scanner;

public class Elevator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int S=4, O=3, L=5;
		int times = scanner.nextInt();
		for (int i = 0; i < times; i++) {
			int cur = scanner.nextInt();
			int des = scanner.nextInt();
			if (cur<=des) {
				int arrive = 2*O + L + (des-cur)*S;
				int result = cur*S + arrive + O + L;
				System.out.println("Case "+ (i+1) +": "+result);
			}else {
				int arrive = 2*O + L + (cur-des)*S;
				int result = cur*S + arrive + O + L;
				System.out.println("Case "+ (i+1) +": "+result);
			}
		}
		scanner.close();
	}
	
	
	
}
