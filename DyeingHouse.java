package CCFTest;

import java.util.ArrayList;
import java.util.Scanner;

public class DyeingHouse {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ArrayList<Integer> result = new ArrayList<>();
		
		// 测试用例
		int times = scanner.nextInt();
		
		for (int i = 1; i <= times; i++) {
			// 房屋数
			int houses = scanner.nextInt();
			
			/**
			 * 存储类似房屋RGB信息
			 * 	13 23 12
			 *	77 36 64
			 *	44 89 76
			 *	31 78 45
			 */
			int[][] houseRGB = new int[houses][3];
			
			// 填充二维数组
			for (int j = 0; j < houses; j++) {
				for (int j2 = 0; j2 < 3; j2++) {
					houseRGB[j][j2] = scanner.nextInt();
				}
			}
			
			// 调用染色方法输出结果
			result.add(dyeing(houseRGB));
			
		}
		for (int i = 1; i <= result.size(); i++) {
			System.out.println("Case " + i + ": " + result.get(i-1));
		}
		
		scanner.close();
	}
	
	/**
	 * 房子开始染色
	 * @param houseRGB
	 * @return 返回一个最小成本价格
	 */
	static int dyeing(int[][] houseRGB) {
		
		// 最后总价格
		int totalPrice = 0;
		
		// 中间过渡的总价格
		int tempTotalPrice = 0;
		
		// 上个染色房子的颜色下标
		int beforeColorIndex = 0;

		// 循环次数为有多少座房子
		for (int i = 0; i < houseRGB.length; i++) {
			
			// 最便宜颜料的价格
			int mostInexpensive = 0;
			
			// 最便宜颜料的价格下标
			int mostInexpensiveIndex = 0;
			
			// 次便宜颜料的价格下标
			int minorInexpensiveIndex = 0;
			
			// 次便宜颜料的价格
			int minorInexpensive = 0;
			
			// 每次循环先比较每一行的最小价格的颜料，在比较与上一次染色是否相同，不相同则挑选最小价格的颜料，相同则挑选第二便宜的颜料
			
			for (int j = 0; j < 3; j++) {
				beforeColorIndex = j;
				tempTotalPrice += houseRGB[0][j];
				
				for (int j2 = 1; j2 < houseRGB.length; j2++) {
					int tempPrice = houseRGB[i][j];
					if (j2 == 0) {
						mostInexpensive = tempPrice;
						minorInexpensive = tempPrice;
					} else {
						// 进行最便宜价格和次便宜价格及下标赋值
						if (mostInexpensive > tempPrice) {
							minorInexpensive = mostInexpensive;
							minorInexpensiveIndex = mostInexpensiveIndex;
							mostInexpensive = tempPrice;
							mostInexpensiveIndex = j;
						} else if (minorInexpensive > tempPrice) {
							minorInexpensive = tempPrice;
							minorInexpensiveIndex = j;
						}
					}
					
					// 如果最后面最便宜和次便宜相等并且到了循环的最后一次的话，该行第一个数必定为最小，比较3个数中最后两个数的大小进行对次便宜价格的赋值
					if (j == houseRGB[i].length-1 && minorInexpensive == mostInexpensive) {
						if (houseRGB[i][j] > houseRGB[i][j-1]) {
							minorInexpensive = houseRGB[i][j-1];
							minorInexpensiveIndex = j-1;
						} else if(houseRGB[i][j] < houseRGB[i][j-1]){
							minorInexpensive = houseRGB[i][j];
							minorInexpensiveIndex = j;
						} else {
							minorInexpensive = houseRGB[i][j-1];
							minorInexpensiveIndex = j-1;
						}
					}
				}
				
				if (totalPrice == 0) {
					totalPrice = tempTotalPrice;
				}
			}
			
			
			for (int j = 0; j < houseRGB[i].length; j++) {
				int tempPrice = houseRGB[i][j];
				// 如果是第一次比较，则赋予初值
				if (j == 0) {
					mostInexpensive = tempPrice;
					minorInexpensive = tempPrice;
				} else {
					// 进行最便宜价格和次便宜价格及下标赋值
					if (mostInexpensive > tempPrice) {
						minorInexpensive = mostInexpensive;
						minorInexpensiveIndex = mostInexpensiveIndex;
						mostInexpensive = tempPrice;
						mostInexpensiveIndex = j;
					} else if (minorInexpensive > tempPrice) {
						minorInexpensive = tempPrice;
						minorInexpensiveIndex = j;
					}
				}
				
				// 如果最后面最便宜和次便宜相等并且到了循环的最后一次的话，该行第一个数必定为最小，比较3个数中最后两个数的大小进行对次便宜价格的赋值
				if (j == houseRGB[i].length-1 && minorInexpensive == mostInexpensive) {
					if (houseRGB[i][j] > houseRGB[i][j-1]) {
						minorInexpensive = houseRGB[i][j-1];
						minorInexpensiveIndex = j-1;
					} else if(houseRGB[i][j] < houseRGB[i][j-1]){
						minorInexpensive = houseRGB[i][j];
						minorInexpensiveIndex = j;
					} else {
						minorInexpensive = houseRGB[i][j-1];
						minorInexpensiveIndex = j-1;
					}
				}
			}
			
			// 如果是第一间房子染色
			if (i == 0) {
				totalPrice += mostInexpensive;
				beforeColorIndex = mostInexpensiveIndex;
			} else {
				// 如果与前面一间房子颜色一致，则换成次便宜的颜料
				if (beforeColorIndex == mostInexpensiveIndex) {
					totalPrice += minorInexpensive;
					beforeColorIndex = minorInexpensiveIndex;
				} else {
					totalPrice += mostInexpensive;
					beforeColorIndex = mostInexpensiveIndex;
				}
			}
			
			System.out.println("最便宜价格：　" + mostInexpensive);
			System.out.println("最便宜下标：　" + mostInexpensiveIndex);
			System.out.println("次便宜价格：　" + minorInexpensive);
			System.out.println("次便宜下标：　" + minorInexpensiveIndex);
			System.out.println("-----------");
			
		}
		
		return totalPrice;
	}
	
}
