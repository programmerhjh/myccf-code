package CCFTest;

import java.util.Scanner;

public class FRC {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int afterSalary = scanner.nextInt();
		
		int resultSalary = 0;
		
		if (afterSalary <= 3500) {
			resultSalary = afterSalary;
			System.out.println(resultSalary);
			return;
		}else if (afterSalary <= 5000) {
			resultSalary = (int) ((afterSalary - 3500) / 0.97 * 0.03) + afterSalary;
			System.out.println(resultSalary);
			return;
		}else if (afterSalary <= 8000) {
			resultSalary = (int) ((afterSalary - 5000) / 0.9 * 0.1) + 45 + afterSalary;
			System.out.println(resultSalary);
			return;
		}else if (afterSalary <= 12500) {
			resultSalary = (int) ((afterSalary - 8000) / 0.8 * 0.2) + 300 + 45 + afterSalary;
			System.out.println(resultSalary);
			return;	
		}else if (afterSalary <= 38500) {
			resultSalary = (int) ((afterSalary - 12500) / 0.75 * 0.25) + 400 + 300 + 45 + afterSalary;
			System.out.println(resultSalary);
			return;
		}else if (afterSalary <= 58500) {
			resultSalary = (int) ((afterSalary - 38500) / 0.7 * 0.3) + 6500 + 400 + 300 + 45 + afterSalary;
			System.out.println(resultSalary);
			return;
		}else if (afterSalary <= 83500) {
			resultSalary = (int) ((afterSalary - 58500) / 0.65 * 0.35) + 6000 + 6500 + 400 + 300 + 45 + afterSalary;
			System.out.println(resultSalary);
			return;
		}else {
			resultSalary = (int) ((afterSalary - 83500) / 0.55 * 0.45) + 8750 + 6000 + 6500 + 400 + 300 + 45 + afterSalary;
			System.out.println(resultSalary);
		}
		
	}
	
}
