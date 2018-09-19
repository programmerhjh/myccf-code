package CCFTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MaxAndMin {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < times; i++) {
			List<String> numbers = Arrays.asList(scanner.nextLine().split(" "));
			Collections.sort(numbers,new Comparator<String>() {
				@Override
				public int compare(String o1, String o2) {
					return o1.hashCode() - o2.hashCode();
				}
			});
			System.out.println("Case " + (i+1) +": Among " + numbers.size() + " numbers " + numbers.get(numbers.size() - 1) + " is maximum and " + numbers.get(0) + " is minimum");
		}
		scanner.close();
	}
}
