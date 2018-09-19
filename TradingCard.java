package CCFTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TradingCard {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		List<Integer> result = new ArrayList<>();
		List<Integer> tempAResultList = new ArrayList<>();
		List<Integer> tempBResultList = new ArrayList<>();
		List<Integer> compareResult = new ArrayList<>();
		while (true) {
			compareResult.clear();
			tempAResultList.clear();
			tempBResultList.clear();
			int aCards = scanner.nextInt();
			int bCards = scanner.nextInt();
			if (aCards == 0 && bCards == 0) {
				break;
			}
			for (int i = 0; i < aCards; i++) {
				int tempInt = scanner.nextInt();
				if (tempAResultList.contains(tempInt)) {
					continue;
				}
				tempAResultList.add(tempInt);
			}
			for (int i = 0; i < bCards; i++) {
				int tempInt = scanner.nextInt();
				if (tempBResultList.contains(tempInt)) {
					continue;
				}
				tempBResultList.add(tempInt);
			}
			if(tempAResultList.size() <= tempBResultList.size()) {
				for (int i = 0; i < tempAResultList.size(); i++) {
					int count = 0;
					for (int j = 0; j < tempBResultList.size(); j++) {
						if (tempAResultList.get(i).compareTo(tempBResultList.get(j)) == 0) {
							++count;
						}
					}
					if (count == 0) {
						compareResult.add(tempAResultList.get(i));
					}
				}
				result.add(compareResult.size());
			}else {
				for (int i = 0; i < tempBResultList.size(); i++) {
					int count = 0;
					for (int j = 0; j < tempAResultList.size(); j++) {
						if (tempBResultList.get(i).compareTo(tempAResultList.get(j)) == 0) {
							++count;
						}
					}
					if (count == 0) {
						compareResult.add(tempBResultList.get(i));
					}
				}
				result.add(compareResult.size());
			}
		}

		for (Integer integer : result) {
			System.out.println(integer);
		}

	}
}
