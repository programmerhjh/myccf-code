package CCFTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class NumberOrdering {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<String> arrayListString = new ArrayList<>();
		int times = scanner.nextInt();
		for (int i = 0; i < times; i++) {
			int numberQuantity = scanner.nextInt();
			for (int j = 0; j < numberQuantity; j++) {
				String temp = "";
				temp = scanner.next();
				arrayListString.add(temp);
			}
			Collections.sort(arrayListString, new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					if (dealNumber(o1) > dealNumber(o2)) {
						return 1;
					} else if (dealNumber(o1) < dealNumber(o2)) {
						return -1;
					} else {
						return 0;
					}
				}
			});

			for (int w = 0; w < arrayListString.size(); w++) {
				if (w == arrayListString.size() - 1) {
					System.out.print(arrayListString.get(w));
					break;
				}
				System.out.print(arrayListString.get(w) + ",");
			}
			System.out.println();
			arrayListString.clear();
		}
		
		scanner.close();
	}

	public static double dealNumber(String num) {
		return Double.parseDouble(BigDecimal.valueOf(Double.parseDouble(num)).stripTrailingZeros().toPlainString());
	}

}
