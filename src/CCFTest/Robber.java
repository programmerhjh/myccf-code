package CCFTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Robber {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int times = scanner.nextInt();
		
		int[] houseMoney = new int[times];
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		int result = 0;
		
		for (int i = 0; i < times; i++) {
			houseMoney[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < 2; i++) {
			for (int j = i; j < houseMoney.length; j+=2) {
				
				result += houseMoney[j];
				
			}
			arrayList.add(result);
			result = 0;
		}
		
		Collections.sort(arrayList, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}
		});
		
		System.out.println(arrayList.get(0) + " ");
		scanner.close();
	}
}
