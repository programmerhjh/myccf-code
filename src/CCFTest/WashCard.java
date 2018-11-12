package CCFTest;

import java.util.Arrays;
import java.util.Scanner;

public class WashCard {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int result = 0;
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = i+1;
		}
		System.arraycopy(a, 0, b, 0, a.length);
		System.arraycopy(a, 0, c, 0, a.length);
		for (int i = 0,x=0,j = (a.length)/2; x < a.length/2; i+=2,x++,j++) {
			a[i] = b[j];
			a[i+1] = b[x];
		}
		while(a[0]!=c[0]) {
			for (int i1 = 0,x1=0,j1 = (a.length)/2; x1 < a.length/2; i1+=2,x1++,j1++) {
				a[i1] = b[j1];
				a[i1+1] = b[x1];
			}
			System.arraycopy(a, 0, b, 0, a.length);
			result ++;
		}
		System.out.println(result);
		scanner.close();
	}
}
