package CCFTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BouncingBall {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int L = scanner.nextInt();
		int t = scanner.nextInt();
		ArrayList<Ball> balls = new ArrayList<>();
		ArrayList<Integer> positions = new ArrayList<>();
		ArrayList<Integer> changeIndex = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			Ball ball = new Ball();
			ball.x = scanner.nextInt();
			balls.add(ball);
		}
		for (int i = 0; i < balls.size(); i++) {
			positions.add(balls.get(i).x);
		}
		Collections.sort(balls,new Comparator<Ball>() {
			@Override
			public int compare(Ball o1, Ball o2) {
				return o1.x - o2.x;
			}
		});
		for (int i = 0; i < positions.size(); i++) {
			for (int j = 0; j < balls.size(); j++) {
				if (positions.get(i).equals(balls.get(j).x)) {
					changeIndex.add(j);
				}
			}
		}
		deal(balls,L,t);
		for (int i = 0; i < balls.size(); i++) {
			System.out.print(balls.get(changeIndex.get(i)).x + " ");
		}
		scanner.close();
	}
	
	public static void deal(ArrayList<Ball> balls,int L,int t) {
		for (int i = 0; i < t; i++) {
			for (int j = 0; j < balls.size() - 1; j++) {
				Ball currentBall = balls.get(j);
				Ball nextBall = balls.get(j + 1);
				if (currentBall.x == nextBall.x) {
					currentBall.v = currentBall.v == 1 ? -1 : 1;
					nextBall.v = nextBall.v == 1 ? -1 : 1;
				}
				if (currentBall.v == 1) {
					if (currentBall.x == L) {
						currentBall.v = -1;
						currentBall.x --;
					}else {
						currentBall.x ++;
					}
				}else {
					if (currentBall.x == 0) {
						currentBall.v = 1;
						currentBall.x ++;
					}else {
						currentBall.x --;
					}
				}
			}
			Ball lastBall = balls.get(balls.size() - 1);
			if (lastBall.v == 1) {
				if (lastBall.x == L) {
					lastBall.v = -1;
					lastBall.x --;
				}else {
					lastBall.x ++;
				}
			}else {
				if (lastBall.x == 0) {
					lastBall.v = 1;
					lastBall.x ++;
				}else {
					lastBall.x --;
				}
			}
		}
	}
	
}
class Ball{
	public int v = 1;
	public int x;
	
	public Ball() {}
	
	@Override
	public String toString() {
		return "v:" + v + " ---- x:" + x;
	}
}
