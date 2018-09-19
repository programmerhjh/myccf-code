package CCFTest;

import java.util.Scanner;

public class BoysDanWithHisString {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int m = scanner.nextInt();
		
		StringBuffer s = new StringBuffer();
		s.append(scanner.next());
		
		scanner.nextLine();
		for (int i = 0; i < m; i++) {
			String temp = scanner.nextLine();
			String[] split = temp.split(" ");
			if (Integer.parseInt(split[0]) == 1) {
				char c = s.charAt(Integer.parseInt(split[1])-1);
				if(c == '1') {
					s = s.replace(Integer.parseInt(split[1])-1, Integer.parseInt(split[1]), "0");
				} else {
					s = s.replace(Integer.parseInt(split[1])-1, Integer.parseInt(split[1]), "1");
				}
			}else {
				String[] tp = s.substring(Integer.parseInt(split[1])-1, Integer.parseInt(split[2])).split("0");
				int result = tp.length;
				for (int j = 0; j < tp.length; j++) {
					if(tp[j] == null || tp[j] == "" || tp[j].equals("")) {
						--result;
					}
				}
				System.out.println(result);
			}
		}
	}
}
