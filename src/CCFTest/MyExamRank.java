package CCFTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyExamRank {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		List<String> keyList = new ArrayList<>();
		List<String> valueList = new ArrayList<>();
		for (int i = 0; i < times; i++) {
			String key = scanner.next();
			String value = scanner.next();
			if(valueList.contains(value)) {
				int indexOf = valueList.indexOf(value);
				int lastIndexOf = valueList.lastIndexOf(value);
				int compareTimes = lastIndexOf - indexOf + 1;
				int resultIndex = 0;
				for (int j = 0; j < compareTimes; j++) {
					String k = keyList.get(indexOf);
					if(key.compareTo(k) > 0) {
						if(indexOf == lastIndexOf) {
							resultIndex = indexOf + 1;
							break;
						}
						indexOf ++;
					}else {
						resultIndex = indexOf;
						break;
					}
				}
				keyList.add(resultIndex, key);
				valueList.add(resultIndex,value);
			}else {
				int resultIndex = 0;
				for (int j = 0; j < valueList.size(); j++) {
					String v = valueList.get(j);
					if (j == valueList.size() - 1) {
						if(value.compareTo(v) > 0) {
							resultIndex = j;
							break;
						}else {
							resultIndex = -1;
							break;
						}
					}
					if(value.compareTo(v) > 0) {
						resultIndex = j;
						break;
					}
				}
				if(resultIndex != -1) {
					keyList.add(resultIndex,key);
					valueList.add(resultIndex,value);
				}else {
					keyList.add(key);
					valueList.add(value);
				}
			}
			
		}
		
		String value = "";
		int repeatNum = 0;
		int count = 0;
		for (int i = 0; i < keyList.size(); i++) {
			if(i == 0) {
				value = valueList.get(i);
				repeatNum = 1;
				System.out.println(repeatNum + "." + keyList.get(i));
			}else {
				if(value.compareTo(valueList.get(i)) == 0 && count == 0) {
					value = valueList.get(i);
					System.out.println(repeatNum + "." + keyList.get(i));
					count ++;
				}else if(value.compareTo(valueList.get(i)) == 0 && count != 0) {
					value = valueList.get(i);
					System.out.println(repeatNum + "." + keyList.get(i));
				}else {
					count = 0;
					repeatNum += 1;
					value = valueList.get(i);
					System.out.println(repeatNum + "." + keyList.get(i));
				}
			}
		}
		
//		int count = 1;
//		String value = "";
//		boolean flag = false;
//		for (int j = 1; j <= keyList.size(); j++) {
//			if(j == 1) {
//				System.out.println(count + "." + keyList.get(j - 1));
//				value = keyList.get(j - 1);
//				count ++;
//				continue;
//			}
//			if (value.compareTo(keyList.get(j - 1)) == 0) {
//				-- count;
//				flag = true;
//				System.out.println(count + "." + keyList.get(j - 1));
//				continue;
//			}
//			value = keyList.get(j - 1);
//			if(flag) {
//				count ++;
//				flag = false;
//				System.out.println(count + "." + keyList.get(j - 1));
//			}else {
//				System.out.println(count + "." + keyList.get(j - 1));
//				count ++;
//			}
//		}
		
	}

	
}
