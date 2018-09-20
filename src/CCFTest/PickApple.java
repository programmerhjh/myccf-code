package CCFTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PickApple {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int chairHeight = 30;
		List<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			arrayList.add(scanner.nextInt() - chairHeight);
		}
		final int playerHeight = scanner.nextInt();
		arrayList = arrayList.stream().filter(n -> n > playerHeight).collect(Collectors.toList());
		System.out.println(arrayList.size());
		scanner.close();
	}
}
