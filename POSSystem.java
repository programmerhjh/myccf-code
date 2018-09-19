package CCFTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class POSSystem {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int times = scanner.nextInt();
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < times; i++) {
			double price = 0;
			int quantity = 0;
			double totalPrice = 0;
			int thingsNum = scanner.nextInt();
			for (int j = 0; j < thingsNum; j++) {
				price = scanner.nextDouble();
				quantity = scanner.nextInt();
				totalPrice += price * quantity;
			}
			int pay = scanner.nextInt();
			int change = (int) Math.floor((pay - totalPrice));
			result.add(change);
		}
		for (int i = 0; i < result.size(); i++) {
			System.out.println("Case " + (i+1) + ": " + result.get(i));
		}
		scanner.close();
	}
}
