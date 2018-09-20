package CCFTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MyPELesson {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int people = scanner.nextInt();
		
		int testTimes = scanner.nextInt();
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		for (int i = 1; i <= people; i++) {
			arrayList.add(i);
		}
		
		for (int i = 0; i < testTimes; i++) {
			int removeIndex = arrayList.indexOf(scanner.nextInt());
			Integer purpose = arrayList.get(removeIndex);
			arrayList.remove(removeIndex);
			int move = scanner.nextInt();
			if (move >= 0) {
				int newIndex = removeIndex + move;
				arrayList.add(newIndex, purpose);
			}else {
				int newIndex = removeIndex - (Math.abs(move));
				arrayList.add(newIndex, purpose);
			}
		}
		
		for (int x = 0; x < arrayList.size(); x++) {
			System.out.print(arrayList.get(x) + " ");
		}

	}
	
}
