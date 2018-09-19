package CCFTest;

import java.util.ArrayList;
import java.util.Scanner;

public class JosephLegend {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		for (int i = 0; i < times; i++) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			ArrayList<Integer> arrayList = new ArrayList<>();
			for (int j = 1; j <= n; j++) {
				arrayList.add(j);
			}
			kill(arrayList,k,i);
			arrayList.clear();
		}
		scanner.close();
	}

	public static void kill(ArrayList<Integer> list,int k,int i) {
		int count = 1;
		int index = 0;
		while (list.size() != 1) {
			if(count == k) {
				if(index == list.size() - 1) {
					list.remove(index);
					index = 0;
					count = 1;
					continue;
				}
				list.remove(index);
				count = 1;
				continue;
			}else {
				count ++;
				if (index == list.size() - 1) {
					index = 0;
					continue;
				}
				index ++;
			}
		}
		System.out.println("Case " + (i + 1) + ": " + list.get(0));
	}
}
