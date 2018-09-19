package CCFTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class FerrisWheel {

	static Scanner scanner = new Scanner(System.in);
	
	static ArrayList<BeRemovePeople> peopleList = new ArrayList<>();
	
	static ArrayList<BeRemovePeople> peopleSeatList = new ArrayList<>();
	
	static ArrayList<Integer> result = new ArrayList<>();
	
	public static void main(String[] args) {
		
		int times = scanner.nextInt();
		
		for (int i = 0; i < times; i++) {
			
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int resultTime = 0;
			
			for (int j = 1; j <= n; j++) {
				peopleList.add(new BeRemovePeople(new ArrayList<>(), j));
			}
			
			while (!(peopleList.isEmpty() && peopleSeatList.isEmpty())) {
				
				for (int j = 1; j <= m; j++) {
					
					if (peopleList.isEmpty() && peopleSeatList.isEmpty()) {
						break;
					}
					
					resultTime += 5;
					
					for (int j2 = 0; j2 < peopleSeatList.size(); j2++) {
						if (peopleSeatList.get(j2).getCurrentSeatNumber() == j) {
							peopleSeatList.get(j2).setCurrentSeatNumber(null);
							BeRemovePeople remove = peopleSeatList.remove(j2);
							if (remove.getRemovePeopleList().size() != m) {
								peopleList.add(remove);
							}
							break;
						}
					}
					
					for (int j2 = 0; j2 < peopleList.size(); j2++) {
						if (!(peopleList.get(j2).getRemovePeopleList().contains(j))) {
							peopleList.get(j2).getRemovePeopleList().add(j);
							peopleList.get(j2).setCurrentSeatNumber(j);
							BeRemovePeople remove = peopleList.remove(j2);
							peopleSeatList.add(remove);
							break;
						}
					}
					
				}
			}
			
			result.add(resultTime);
			peopleList.clear();
			peopleSeatList.clear();
			
		}
		
		for (int i = 0; i < result.size(); i++) {
			System.out.println("Case " + (i + 1) + ": " + result.get(i));
		}
		
	}
	
}

class BeRemovePeople{
	
	private ArrayList<Integer> removePeopleList;
	
	private Integer currentSeatNumber;
	
	public Integer getCurrentSeatNumber() {
		return currentSeatNumber;
	}

	public void setCurrentSeatNumber(Integer currentSeatNumber) {
		this.currentSeatNumber = currentSeatNumber;
	}

	public ArrayList<Integer> getRemovePeopleList() {
		return removePeopleList;
	}

	public void setRemovePeopleList(ArrayList<Integer> removePeopleList) {
		this.removePeopleList = removePeopleList;
	}

	public Integer getPeopleNumber() {
		return peopleNumber;
	}

	public void setPeopleNumber(Integer peopleNumber) {
		this.peopleNumber = peopleNumber;
	}

	private Integer peopleNumber;

	public BeRemovePeople(ArrayList<Integer> removePeopleList, Integer peopleNumber) {
		super();
		this.removePeopleList = removePeopleList;
		this.peopleNumber = peopleNumber;
	}

	public BeRemovePeople(ArrayList<Integer> removePeopleList, Integer currentSeatNumber, Integer peopleNumber) {
		super();
		this.removePeopleList = removePeopleList;
		this.currentSeatNumber = currentSeatNumber;
		this.peopleNumber = peopleNumber;
	}

	@Override
	public String toString() {
		return "BeRemovePeople [removePeopleList=" + removePeopleList + ", currentSeatNumber=" + currentSeatNumber
				+ ", peopleNumber=" + peopleNumber + "]";
	}
	
	
}


