package CCFTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Birthday {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int cutTimes = scanner.nextInt();

		int weight = scanner.nextInt();

		int result = 1;

		ArrayList<Integer> arrayList = new ArrayList<>();

		for (int i = 0; i < cutTimes; i++) {
			arrayList.add(scanner.nextInt());
		}

		Collections.sort(arrayList,new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});

		int temp = 0;
		while (arrayList.size() != 0) {
			temp += arrayList.get(0);
			if (temp >= weight) {
				result++;
				temp = 0;
				if (arrayList.size() == 1) {
					result++;
					break;
				}
			}
			arrayList.remove(0);
		}

		System.out.println(result);
	}

}
