package CCFTest;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Emulator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		DecimalFormat decimalFormat = new DecimalFormat("0.00");
		int times = scanner.nextInt();
		for (int i = 0; i < times; i++) {
			double speed = scanner.nextDouble();
			double second = scanner.nextDouble() * -1;
			System.out.println(decimalFormat.format(Math.round((speed / (double)second) * 100) / 100.0));
		}
		scanner.close();
		
	}
	
}
