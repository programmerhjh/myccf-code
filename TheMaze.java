package CCFTest;

import java.util.ArrayList;
import java.util.Scanner;

public class TheMaze {

	private static Scanner scanner = new Scanner(System.in);
	
	static ArrayList<String> foot = new ArrayList<>();
	
	public static void main(String[] args) {
		
		int times = scanner.nextInt();
		
		
		for (int i = 0; i < times; i++) {
			int row = scanner.nextInt();
			int col = scanner.nextInt();
			int[][] nodes = new int[row][col];
			int[][] flag = new int[row][col];
			for (int j = 0; j < nodes.length; j++) {
				for (int j2 = 0; j2 < nodes[j].length; j2++) {
					nodes[j][j2] = scanner.nextInt();
				}
			}
			
			String start = scanner.nextInt() + "," + scanner.nextInt();
			
			String purpose = scanner.nextInt() + "," + scanner.nextInt();
			
			search(nodes, start, flag);
			
			if (foot.contains(purpose)) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		}
		
		
		scanner.close();
	}
	
	static void search(int[][] arr, String start, int[][] flag) {
		
		String[] strings = start.split(",");
		int rowIndex = Integer.parseInt(strings[0]);
		int colIndex = Integer.parseInt(strings[1]);
		flag[rowIndex][colIndex] = 1;
		boolean stop = true;
		
		if (rowIndex == arr.length - 1 && colIndex != arr[0].length - 1 && colIndex != 0) {
			
			if (arr[rowIndex-1][colIndex] == 0 && flag[rowIndex-1][colIndex] == 0) {
				stop = false;
				String newStart = (rowIndex-1) + "," + colIndex;
				search(arr, newStart, flag);
			} 
			
			if (arr[rowIndex][colIndex+1] == 0 && flag[rowIndex][colIndex+1] == 0) {
				stop = false;
				String newStart = rowIndex + "," + (colIndex+1);
				search(arr, newStart, flag);
			}
			
			if (arr[rowIndex][colIndex-1] == 0 && flag[rowIndex][colIndex-1] == 0) {
				stop = false;
				String newStart = rowIndex + "," + (colIndex-1);
				search(arr, newStart, flag);
			}
			
			if (stop) {
				foot.add(start);
			}
			
			
		} else if(rowIndex == 0 && colIndex != 0 && colIndex != arr[0].length - 1) {
			
			if (arr[rowIndex+1][colIndex] == 0 && flag[rowIndex+1][colIndex] == 0) {
				stop = false;
				String newStart = (rowIndex+1) + "," + colIndex;
				search(arr, newStart, flag);
			} 
			
			if (arr[rowIndex][colIndex+1] == 0 && flag[rowIndex][colIndex+1] == 0) {
				stop = false;
				String newStart = rowIndex + "," + (colIndex+1);
				search(arr, newStart, flag);
			}
			
			if (arr[rowIndex][colIndex-1] == 0 && flag[rowIndex][colIndex-1] == 0) {
				stop = false;
				String newStart = rowIndex + "," + (colIndex-1);
				search(arr, newStart, flag);
			}
			if (stop) {
				foot.add(start);
			}
			
		} else if(colIndex == arr[0].length - 1 && rowIndex != arr.length - 1 && rowIndex != 0) {
			
			if (arr[rowIndex][colIndex-1] == 0 && flag[rowIndex][colIndex-1] == 0) {
				stop = false;
				String newStart = rowIndex + "," + (colIndex-1);
				search(arr, newStart, flag);
			} 
			
			if (arr[rowIndex+1][colIndex] == 0 && flag[rowIndex+1][colIndex] == 0) {
				stop = false;
				String newStart = (rowIndex+1) + "," + colIndex;
				search(arr, newStart, flag);
			}
			
			if (arr[rowIndex-1][colIndex] == 0 && flag[rowIndex-1][colIndex] == 0) {
				stop = false;
				String newStart = (rowIndex-1) + "," + colIndex;
				search(arr, newStart, flag);
			}
			if (stop) {
				foot.add(start);
			}
			
		} else if(colIndex == 0 && rowIndex != 0 && rowIndex != arr.length - 1) {
			
			if (arr[rowIndex][colIndex+1] == 0 && flag[rowIndex][colIndex+1] == 0) {
				stop = false;
				String newStart = rowIndex + "," + (colIndex+1);
				search(arr, newStart, flag);
			} 
			
			if (arr[rowIndex+1][colIndex] == 0 && flag[rowIndex+1][colIndex] == 0) {
				stop = false;
				String newStart = (rowIndex+1) + "," + colIndex;
				search(arr, newStart, flag);
			}
			
			if (arr[rowIndex-1][colIndex] == 0 && flag[rowIndex-1][colIndex] == 0) {
				stop = false;
				String newStart = (rowIndex-1) + "," + colIndex;
				search(arr, newStart, flag);
			}
			if (stop) {
				foot.add(start);
			}
			
		} else if (colIndex == 0 && rowIndex == 0) {
			
			if (arr[rowIndex][colIndex+1] == 0 && flag[rowIndex][colIndex+1] == 0) {
				stop = false;
				String newStart = rowIndex + "," + (colIndex+1);
				search(arr, newStart, flag);
			} 
			
			if (arr[rowIndex+1][colIndex] == 0 && flag[rowIndex+1][colIndex] == 0) {
				stop = false;
				String newStart = (rowIndex+1) + "," + colIndex;
				search(arr, newStart, flag);
			}
			
			if (stop) {
				foot.add(start);
			}
			
		} else if (colIndex == arr[0].length - 1 && rowIndex == arr.length - 1) {
			
			if (arr[rowIndex][colIndex-1] == 0 && flag[rowIndex][colIndex-1] == 0) {
				stop = false;
				String newStart = rowIndex + "," + (colIndex-1);
				search(arr, newStart, flag);
			} 
			
			if (arr[rowIndex-1][colIndex] == 0 && flag[rowIndex-1][colIndex] == 0) {
				stop = false;
				String newStart = (rowIndex-1) + "," + colIndex;
				search(arr, newStart, flag);
			}
			
			if (stop) {
				foot.add(start);
			}
			
		} else if (rowIndex == 0 && colIndex == arr[0].length - 1) {
			
			if (arr[rowIndex][colIndex-1] == 0 && flag[rowIndex][colIndex-1] == 0) {
				stop = false;
				String newStart = rowIndex + "," + (colIndex-1);
				search(arr, newStart, flag);
			} 
			
			if (arr[rowIndex+1][colIndex] == 0 && flag[rowIndex+1][colIndex] == 0) {
				stop = false;
				String newStart = (rowIndex+1) + "," + colIndex;
				search(arr, newStart, flag);
			}
			
			if (stop) {
				foot.add(start);
			}
			
		} else if (rowIndex == arr.length - 1 && colIndex == 0) {
			
			if (arr[rowIndex][colIndex+1] == 0 && flag[rowIndex][colIndex+1] == 0) {
				stop = false;
				String newStart = rowIndex + "," + (colIndex+1);
				search(arr, newStart, flag);
			} 
			
			if (arr[rowIndex-1][colIndex] == 0 && flag[rowIndex-1][colIndex] == 0) {
				stop = false;
				String newStart = (rowIndex-1) + "," + colIndex;
				search(arr, newStart, flag);
			}
			
			if (stop) {
				foot.add(start);
			}
			
		} else {
			
			if (arr[rowIndex][colIndex+1] == 0 && flag[rowIndex][colIndex+1] == 0) {
				stop = false;
				String newStart = rowIndex + "," + (colIndex+1);
				search(arr, newStart, flag);
			} 
			
			if (arr[rowIndex][colIndex-1] == 0 && flag[rowIndex][colIndex-1] == 0) {
				stop = false;
				String newStart = rowIndex + "," + (colIndex-1);
				search(arr, newStart, flag);
			} 
			
			if (arr[rowIndex+1][colIndex] == 0 && flag[rowIndex+1][colIndex] == 0) {
				stop = false;
				String newStart = (rowIndex+1) + "," + colIndex;
				search(arr, newStart, flag);
			}
			
			if (arr[rowIndex-1][colIndex] == 0 && flag[rowIndex-1][colIndex] == 0) {
				stop = false;
				String newStart = (rowIndex-1) + "," + colIndex;
				search(arr, newStart, flag);
			}
			
			if (stop) {
				foot.add(start);
			}
		}
		
	}
	
	
}
