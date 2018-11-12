package CCFTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class KarateCompetition {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		ArrayList<Integer> rs = new ArrayList<>();
		for (int i = 0; i < times; i++) {
			int skillNums = scanner.nextInt(), result = 0, x = 0, y = 0, m = skillNums-1, n = skillNums - 1;
			boolean flag = true;
			int[] a = new int[skillNums];
			int[] b = new int[skillNums];
			for (int j = 0; j < skillNums; j++) {
				a[j] = scanner.nextInt();
			}
			for (int j = 0; j < skillNums; j++) {
				b[j] = scanner.nextInt();
			}
			Arrays.sort(a);
			Arrays.sort(b);
			while (flag) {
				if (m == x) {
					flag = false;
				}
				if (a[m] > b[n]) {
					m --;
					n --;
					result += 2;
				} else if (a[x] > b[y]) {
					x ++;
					y ++;
					result += 2;
				} else if (a[x] == b[n]) {
					x ++;
					n --;
					result ++;
				} else if (a[x] < b[n]) {
					x ++;
					n --;
				}
			}
			rs.add(result);
		}
		for (int j = 0; j < rs.size(); j++) {
			System.out.println("Case " + (j+1) + ": " + rs.get(j));
		}
		scanner.close();
	}
}
