package CCFTest;

import java.util.ArrayList;
import java.util.Scanner;

public class DiscardedCard {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int number = 0;
		while ((number = scanner.nextInt()) != 0) {
			
			ArrayList<Integer> arrayList = new ArrayList<>();
			
			for (int i = number; i >= 1; i--) {
				arrayList.add(i);
			}
			
			String discard = "";
			String remained = "";
			while (arrayList.size() != 1) {
				Integer discardNumber = arrayList.remove(arrayList.size() - 1);
				discard += discardNumber + ", ";
				Integer top = arrayList.remove(arrayList.size() - 1);
				arrayList.add(0, top);
				
			}
			remained = arrayList.get(0).toString();
			if (discard != "") {
				discard = discard.substring(0, discard.lastIndexOf(","));
				System.out.println("Discarded cards: " + discard);
			} else {
				System.out.println("Discarded cards:");
			}
			
			System.out.println("Remaining card: " + remained);
			
		}
		
		scanner.close();
	}
	
}
