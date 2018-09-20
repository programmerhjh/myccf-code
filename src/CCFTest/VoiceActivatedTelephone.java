package CCFTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class VoiceActivatedTelephone {

	private static Scanner scanner = new Scanner(System.in);
	
	private static HashMap<String, String> map = new HashMap<>();
	
	public static void main(String[] args) {
		
		String string = "";
		map.put("ABC","2");
		map.put("DEF","3");
		map.put("GHI","4");
		map.put("JKL","5");
		map.put("MNO","6");
		map.put("PQRS","7");
		map.put("TUV","8");
		map.put("WXYZ","9");
		map.put("1","1");
		map.put("2","2");
		map.put("3","3");
		map.put("4","4");
		map.put("5","5");
		map.put("6","6");
		map.put("7","7");
		map.put("8","8");
		map.put("9","9");
		map.put("0","0");
		map.put("*","*");
		map.put("#","#");
		
		
		while(!(string = scanner.nextLine()).equals("0")) {
			StringBuffer stringBuffer = new StringBuffer(string);
			String result = "";
			for (int i = 0; i < string.length(); i++) {
				Iterator<String> iterator = map.keySet().iterator();
				String substring = stringBuffer.substring(i, i+1);
				for (Iterator<String> iter = iterator; iterator.hasNext();) {
					String next = iter.next();
					if (next.contains(substring) || next.toLowerCase().contains(substring)) {
						result += map.get(next);
					}
				}
			
			}
			System.out.println(result);
		}
		
		scanner.close();
	}
	
}
