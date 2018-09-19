package CCFTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HTTPServer {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Map<String, Integer> map = new HashMap<>();
		
		String[] requestType = {"GET","POST","UPDATE","DELETE"};
		
		int times = scanner.nextInt();
		
		for (int i = 1; i <= times; i++) {
			
			int result = 0;
			
			for (int j = 0; j < 4; j++) {
				map.put(requestType[j], scanner.nextInt());
			}
			
			int requireTime = scanner.nextInt();
			
			
			int requestTimes = scanner.nextInt();

			String[] currentRequestType = new String[requestTimes];
			
			for (int j = 0; j < currentRequestType.length; j++) {
				currentRequestType[j] = scanner.next();
			}
			
			if (requireTime == 0) {
				System.out.println("Case " + i + ": " + result);
				continue;
			}

			int spend = 0;
			
			for (int j = 0; j < requestTimes; j++) {
				result ++;
				spend += map.get(currentRequestType[j]);
				if (spend >= requireTime) {
					break;
				}
			}

			System.out.println("Case " + i + ": " + result);
		}
		
		scanner.close();
		
	}
	
}
