package CCFTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 超市结算员
 * @author acer
 *
 */
public class ClearingClerk {
	
	private static Scanner scanner = new Scanner(System.in);
	
	private static HashMap<Integer, Integer> map = new HashMap<>(); 
	
	private static HashMap<Integer, Integer> map2 = new HashMap<>();

	private static ArrayList<Integer> arrayList = new ArrayList<>();

	
	public static void main(String[] args) {
		
		int n = scanner.nextInt();
//		25 18 36 16 25  
		int m = scanner.nextInt();
		
		int resultTime = 0;
		
		for (int i = 1; i <= n; i++) {
			map.put(i, scanner.nextInt());
		}
		
		for (int i = 1; i <= m; i++) {
			map2.put(i, scanner.nextInt());
		}
		int map2Size = map2.size();
		for (int i = 1; i <= map.size(); i++) {
			int spend = map.get(i) * map2.get(i);
			arrayList.add(i-1,spend);
			
			map2.remove(i);
		}
		
		while(!map2.isEmpty()) {
			
			for (int i = n+1; i <= map2Size; i++) {
				Integer temp = arrayList.get(0);
				int index = 0;
				for (Iterator<Integer> iterator = arrayList.iterator();iterator.hasNext();) {
					Integer next = iterator.next();
					if (temp > next) {
						temp = next;
					}
					index = arrayList.indexOf(temp);
				}
				Integer num = map2.get(i);
				int spendTime = map.get(index+1) * num;
				arrayList.set(index, arrayList.get(index)+spendTime);
				
				map2.remove(i);
			}
		}
		
		
		int temp1 = 0;
		for (Iterator<Integer> iterator = arrayList.iterator();iterator.hasNext();) {
			Integer next = iterator.next();
			if (temp1 < next) {
				temp1 = next;
			}
		}
		resultTime += temp1;
		
		System.out.println(resultTime);
		scanner.close();
	}
	
	
}

