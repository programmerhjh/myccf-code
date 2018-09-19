package CCFTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Stock {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int times = scanner.nextInt();
		
		int result = 0;
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		for (int i = 0; i < times; i++) {
			arrayList.add(scanner.nextInt());
		}
		
		
		
		for (int i = 0; i < arrayList.size() - 1; i++) {
			int a = arrayList.get(i);
			int b = arrayList.get(i + 1);
			
			if (result < Math.abs(a - b)) {
				result = Math.abs(a - b);
			}
		}
		
		
		System.out.println(result);
	}
	
}
