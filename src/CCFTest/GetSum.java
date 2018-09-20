package CCFTest;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class GetSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		ArrayList<BigInteger> arrayList = new ArrayList<>();
		BigInteger temp = null;
		for(int i = 0;i < times; i++) {
			temp = new BigInteger(scanner.next());
			arrayList.add(temp);
		}
		int count = 0;
		for (BigInteger num : arrayList) {
			if (count == 0) {
				count ++;
				System.out.print(num.add(num.multiply((num.subtract(new BigInteger("1")))).divide(new BigInteger("2"))));
				continue;
			}
			System.out.print("\n"+num.add(num.multiply((num.subtract(new BigInteger("1")))).divide(new BigInteger("2"))));
		}
		scanner.close();
	}
}
