package CCFTest;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentsGame {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scanner.nextInt();
		int k = scanner.nextInt();

		ArrayList arrayList = new ArrayList<>();
		
		if(n>=1&&n<=1000&&k>=1&&k<=9) {
			for (int i = 1; i <= n; i++) {
				arrayList.add(i);
			}
			int count = 0;
			int currentIndex = 0;		
			int lastNum = 0;
			while(arrayList.size() > 1) {
				count ++;
				int size = arrayList.size();
				int countLen = String.valueOf(count).length();
				for (int i = countLen-1; i > 0; i--) {
					lastNum = (int) (count % Math.pow(10, i));
				}
				
				if(count % k == 0 || lastNum == k) {
					arrayList.remove(currentIndex);
					if(currentIndex >= size-1) {
						currentIndex = 0;
					}
					continue;
				}
				if(currentIndex >= size-1) {
					currentIndex = 0;
				}else {
					currentIndex ++;				
				}
			}
			
			System.out.println(arrayList.get(0));
		}
	
	}

}
