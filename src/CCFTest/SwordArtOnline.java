package CCFTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * 刀剑神域
 * @author acer
 *
 */
public class SwordArtOnline {

	private static Scanner scanner = new Scanner(System.in);
	private static LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
	
	
	public static void main(String[] args) {
		int s = scanner.nextInt();
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			int xi = scanner.nextInt();
			int yi = scanner.nextInt();
			if (map.containsKey(xi)) {
				Integer integer = map.get(xi);
				map.put(xi, yi+integer);
			} else {
				map.put(xi, yi);
			}
		}
		
		
		ArrayList<Integer> list = new ArrayList<>();
		while (!map.isEmpty()) {
			int size = map.size();
			Set<Integer> keySet = map.keySet();
			Iterator<Integer> iterator = keySet.iterator();
			for (Iterator<Integer> iter = iterator; iterator.hasNext();) {
				Integer next = iter.next();
				if (s >= next) {
					s += map.get(next);
					list.add(next);
				}
			}
			for (int i = 0; i < list.size(); i++) {
				Integer key = list.get(i);
				map.remove(key);
			}
			if (map.size() == size) {
				System.out.println("NO");
				return;
			}
			if (!list.isEmpty()) {
				list.clear();
			}
		}
		System.out.println("YES");
		scanner.close();
	}
	
}
