package CCFTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoinPuzzle {

	public static void main(String[] args) {
		Map<String, ArrayList<String>> map = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		for (int i = 0; i < times; i++) {
			map.clear();
			int N = scanner.nextInt();
			int Q = scanner.nextInt();
			ArrayList<String> beforeList = new ArrayList<>();
			ArrayList<String> afterList = new ArrayList<>();
			for (int j = 0; j < Q; j++) {
				String expression = scanner.next();
				String before = expression.substring(0, 1);
				String operator = expression.substring(1, 2);
				String after = expression.substring(2);
				if (operator.equals(">")) {
					if (map.containsKey(before)) {
						map.get(before).add(after);
					} else {
						map.put(before, new ArrayList<String>());
						map.get(before).add(after);
					}
					beforeList.add(before);
					afterList.add(after);
				} else {
					if (map.containsKey(after)) {
						map.get(after).add(before);
					} else {
						map.put(after, new ArrayList<String>());
						map.get(after).add(before);
					}
					beforeList.add(after);
					afterList.add(before);
				}
			}
			String result = "";
			String latest = "";
			int count = 0;
			int bingo = 0;
			ArrayList<Object> words = new ArrayList<>();
			int ascii = 65; // A
			for (int j = 0; j < N; j++) {
				words.add((char) ascii++);
			}
			while (result.length() != N - 1) {
				if (afterList.containsAll(beforeList)) {
					count++;
					break;
				}
				for (int j = 0; j < words.size();) {
					if (beforeList.size() == 1) {
						result += beforeList.get(0);
						latest = beforeList.get(0);
						break;
					} else {
						for (int j2 = 0; j2 < words.size(); j2++) {
							if (j2 == j) {
								continue;
							} else {
								if (map.get(words.get(j2).toString()) != null) {
									if (map.get(words.get(j2).toString()).contains(words.get(j).toString())) {
										bingo ++;
										break;
									}
								}
							}
						}
						int removeCount = 0;
						if (bingo == 0) {
							result += words.get(j);
							latest = words.get(j).toString();
							for (int j2 = 0; j2 < beforeList.size();) {
								if (beforeList.get(j2).equals(latest)) {
									beforeList.remove(j2);
									afterList.remove(j2);
									++removeCount;
								} else {
									j2++;
								}
							}
							if (removeCount == 0) {
								j++;
							} else {
								words.remove(j);
								map.remove(latest);
								j = 0;
							}
						} else {
							j++;
							bingo = 0;
						}
					}
				}
				if (count != 0) {
					break;
				}
			}
			if (count == 0) {
				result += map.get(latest).get(0);
				System.out.println(new StringBuffer(result).reverse().toString());
			} else {
				System.out.println("Impossible");
			}
		}
		scanner.close();
	}
}
