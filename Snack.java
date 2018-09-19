package CCFTest;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Snack {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Map<Integer,Double> map = new HashMap<>();
		map.put(1, 4.00);
		map.put(2, 4.50);
		map.put(3, 5.00);
		map.put(4, 2.00);
		map.put(5, 1.50);
		DecimalFormat decimalFormat = new DecimalFormat("#.00");
		while(true) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			if(x == y && x == 0) {
				break;
			}
			System.out.println("Total: R$ " + decimalFormat.format(map.get(x) * y) );
		}
		
	}
	
}
