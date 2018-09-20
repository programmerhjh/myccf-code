package CCFTest;

import java.util.Scanner;

public class MusicCycle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			int n = scanner.nextInt();
			if(n == 0) {
				break;
			}
			int peak = 0;
			int flag = 0;
			int next = 0,second = 0,init = 0; //0:low 1:high
			int temp = 0;
			for (int i = 0; i < n; i++) {
				if(i == 0) {
					init = scanner.nextInt();
					next = init;
				}else if (i == 1) {
					temp = scanner.nextInt();
					if (i == 1) {
						second = temp;
					}
					if(next < temp) {
						flag = 1;
						peak ++;
					}else if (next > temp) {
						flag = 0;
						peak ++;
					}
					next = temp;
				}else {
					temp = scanner.nextInt();
					if(next < temp && flag == 0) {
						flag = 1;
						peak ++;
					}else if (next > temp && flag == 1) {
						flag = 0;
						peak ++;
					}
					next = temp;
				}
			}
			if (flag == 1 && next > init && second > init) {
				peak ++;
				System.out.println(peak);
			}else if (flag == 0 && next < init && second < init) {
				peak ++;
				System.out.println(peak);
			}else {
				System.out.println(peak);
			}
			
		}
		
	}
	
}
