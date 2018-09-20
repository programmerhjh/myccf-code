package CCFTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SortAge {

	static Scanner scanner = new Scanner(System.in);
	
	static ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>(); 
	
	public static void main(String[] args) {
		
		while (true) {
			
			int numberCount = scanner.nextInt();
			ArrayList<Integer> tempList = new ArrayList<>();
			
			if (numberCount == 0) {
				break;
			}
			for (int i = 0; i < numberCount; i++) {
				tempList.add(scanner.nextInt());
			}

			Collections.sort(tempList, new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					
					if (o1 == 100 || o2 == 100) {
						if (o1 == 100) {
							return 1;
						} else {
							return -1;
						}
					}
					
					return o1 - o2;
				}
				
			});
			if (tempList.contains(100)) {
				int hundredPosition = tempList.indexOf(100);
				tempList.remove(hundredPosition);
				tempList.add(0,100);
			}
			arrayList.add(tempList);
			
		}
		
		for (ArrayList<Integer> arr : arrayList) {
			for (Integer integer : arr) {
				System.out.print(integer + " ");
			}
			System.out.println();
		}
		
		
	}
	
}
