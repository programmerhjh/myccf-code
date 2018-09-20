package CCFTest;

import java.util.Scanner;

public class WhereIsTheGold {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int times = scanner.nextInt();
		
		for (int i = 1; i <= times; i++) {
			int line = scanner.nextInt();
			int row = scanner.nextInt();
			int count = 0;
			System.out.println("Case " + i + ":");
			for (int j = 1; j <= line; j++) {
				char[] str = scanner.next().toCharArray();
				for (int k = 1; k <= str.length; k++) {
					if(str[k-1] == '$') {
						count ++;
						System.out.println(j + "," + k);
					}					
				}
			}
			if (count == 0) {
				System.out.println("No Gold Found");
			}
			
		}
		
		scanner.close();
		
	}
	
}
