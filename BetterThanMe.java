package CCFTest;

import java.util.ArrayList;
import java.util.Scanner;

public class BetterThanMe {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int times = scanner.nextInt();
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		int result = 0;
		
		for (int i = 0; i < times; i++) {
			
			arrayList.add(scanner.nextInt());
			
		}
		
		int min = 0,max = 0;
		for (int i = 0; i < arrayList.size(); i++) {
			Integer integer1 = arrayList.get(i);
			for (int j = 0; j < arrayList.size(); j++) {
				if (arrayList.get(j) > integer1) {
					max ++;
				}else if (arrayList.get(j) < integer1) {
					min ++;
				}			
			}
			if (max == min) {
				result = integer1;
				break;
			}else {
				max = 0;
				min = 0;
			}
		}
		
		if (result == 0) {
			System.out.println(-1);
		}else {
			System.out.println(result);
		}
		
	}
	
}
