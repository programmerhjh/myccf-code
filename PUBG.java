package CCFTest;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 绝地求生
 * @author acer
 *
 */
public class PUBG {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int times = scanner.nextInt();
		
		for (int i = 0; i < times; i++) {

			int people = scanner.nextInt();
			
			int out = scanner.nextInt(); // end
			
			int aliveTime = scanner.nextInt(); 
			
			int alivePeopleNum = 0; // 记录存活人数
			
			int m = scanner.nextInt(); 
				
			int[][] map = new int[people][people];

			for (int j = 0; j < map.length; j++) {
				for (int j2 = 0; j2 < map[j].length; j2++) {
					if (j == j2) {
						map[j][j2] = 0;
					} else {
						map[j][j2] = Short.MAX_VALUE;
					}			
				}
			}
			
			for (int j = 0; j < m; j++) {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				int dis = scanner.nextInt();
				if(dis < map[a-1][b-1]) {
					map[a-1][b-1] = dis;					
				}
			}
			
			for (int j = 0; j < people; j++) {
				int[] searchShortDist = searchShortDist(map, out-1, j);
				if (searchShortDist[out-1] <= aliveTime) {
					alivePeopleNum ++;
				}
			}
			
			System.out.println(alivePeopleNum);
			if (i != times - 1) {
				System.out.println();
			}
		}
		
	}
	
	
	public static int[] searchShortDist(int[][] map, int end, int vs) {
		
		// 记录每个顶点是否找到最短路径
		boolean[] nodeFlag = new boolean[map.length];
		
		int[] shortDist = new int[map.length];
		
		for (int i = 0; i < nodeFlag.length; i++) {
			shortDist[i] = map[vs][i];
		}
		
		
		while (true) {
			// 算出出口最短路径就退出
			if (nodeFlag[end]) {
				break;
			}
			
			// 一次循环下来index还为-1代表全部都以找到最短路径
			int index = -1;

			// 先定义一个整形最大数进行比较
			int min = Short.MAX_VALUE;
			
			for (int i = 0; i < shortDist.length; i++) {
				if (!nodeFlag[i] && shortDist[i] < min) {
					index = i;
					min = shortDist[i];
				}
			}
			
			// 如果循环后index的值未发生改变说明都为最短路径，直接跳出循环
			if (index == -1) {
				break;
			}
			
			// 被访问过后就赋值为true标识被访问过
			nodeFlag[index] = true;
		
			for (int i = 0; i < map.length; i++) {
				if (!nodeFlag[i] && min + map[index][i] < shortDist[i]) {
					shortDist[i] = min + map[index][i]; 
				}
			}
			
		}

		return shortDist;
	}
	
}
