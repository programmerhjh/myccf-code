package CCFTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyGoodFriend {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		ArrayList<Map<String, Long>> arrayList = new ArrayList<>();
		for (int i = 0; i < times; i++) {
			Map<String, Long> map = new HashMap<>();
			map.put("N", scanner.nextLong());
			map.put("D", scanner.nextLong());
			map.put("M", scanner.nextLong());
			map.put("L", scanner.nextLong());
			arrayList.add(map);
		}
		for (int i = 0; i < arrayList.size(); i++) {
			Map map = arrayList.get(i);
			long N = Long.parseLong(map.get("N").toString());
			long D = Long.parseLong(map.get("D").toString());
			long M = Long.parseLong(map.get("M").toString());
			long L = Long.parseLong(map.get("L").toString());
			int n = 1;
			for (int j = 1; j <= N;) {
				if(n * D <= (j - 1) * M + L) {
					n ++;
					if (j == N) {
						System.out.println("Case " + (i + 1) + ": " + n * D);
						break;
					}
					continue;
				}else {
					++ j;
					if (n * D < (j - 1) * M) {
						System.out.println("Case " + (i + 1) + ": " + n * D);
						break;
					}
				}
			}
		}
		scanner.close();
	}
}
