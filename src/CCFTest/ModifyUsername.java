package CCFTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ModifyUsername {

	private static Map<String,String> relationMap = new HashMap<>();
	private static ArrayList<String> username = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < times; i++) {
			String[] operators = scanner.nextLine().split(" ");
			String operator = operators[0];
			String name = operators[1];
			if (operator.equals("create")) {
				if (username.contains(name)) {
					System.out.println("ERROR");
				}else {
					if (name.length() > 10 || !name.trim().matches("[A-Za-z0-9]+")) {
						System.out.println("ERROR");						
					}else {
						username.add(name);
						System.out.println("OK");
					}
				}
			}else if (operator.equals("search")) {
				if (username.contains(name)) {
					String latestName = getLatestName(name);
					System.out.println(latestName);
				}else {
					System.out.println("ERROR");
				}
			}else {
				String newUsername = operators[2];
				if (username.contains(name) && !username.contains(newUsername) && newUsername.length() < 10 && newUsername.trim().matches("[A-Za-z0-9]+")) {
					if (relationMap.containsKey(name)) {
						System.out.println("ERROR");
					}else {
						username.add(newUsername);
						relationMap.put(name, newUsername);
						System.out.println("OK");
					}
				}else {
					System.out.println("ERROR");
				}
			}
		}
		scanner.close();
	}
	
	public static String getLatestName(String nameKey) {
		String nameValue = nameKey;
		if (relationMap.containsKey(nameKey)) {
			nameValue = relationMap.get(nameKey);
			getLatestName(nameValue);
		}
		return nameValue;
	}
	
}
