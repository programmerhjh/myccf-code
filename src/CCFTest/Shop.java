package CCFTest;

import java.util.Scanner;

public class Shop {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int times = scanner.nextInt();
		
		for (int i = 1; i <= times; i++) {
			int money = scanner.nextInt();
			int quantity = scanner.nextInt();
			scanner.nextLine();
			String[] price = scanner.nextLine().split(" ");
			int kind = 1;
			for (int j = 1; j <= quantity; j++) {
				kind *= j;
			}
			kind = kind / 6;
			
			int one = 0;
			int two = 1;
			int three = 2;
			int count = 0;
			for (int j = 0; j < kind; j++) {
				if (Integer.parseInt(price[one]) + Integer.parseInt(price[two]) + Integer.parseInt(price[three]) == money) {
					count ++;
					break;
				}else {
					if (three == price.length - 1) {
						if (two == price.length - 2) {
							if (one == price.length -3) {
								break;
							}else {
								++ one;
								two = one + 1;
								three = two + 1;
							}
						}else {
							++ two;
							three = two + 1;
						}
					}else {
						three ++;
					}
				}
			}
			
			if (count != 0) {
				System.out.println("Case " + i + ": " + (one + 1) + " " + (two + 1) + " " + (three + 1));
			}else {
				System.out.println("Case " + i + ": You are out of your luck!");
			}			
			
		}
		scanner.close();
	}
}
