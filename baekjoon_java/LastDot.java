package baekjoon_java;
import java.util.*;
public class LastDot {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] dot = new int[3][2];
		int resultX = 0;
		int resultY = 0;
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				dot[i][j] = input.nextInt();
			}
		}
		if(dot[0][0] == dot[1][0]) {
			resultX = dot[2][0];
		}
		else if(dot[1][0] == dot[2][0]) {
			resultX = dot[0][0];
		}
		else if(dot[2][0] == dot[0][0]) {
			resultX = dot[1][0];
		}
		
		if(dot[0][1] == dot[1][1]) {
			resultY = dot[2][1];
		}
		else if(dot[1][1] == dot[2][1]) {
			resultY = dot[0][01];
		}
		else if(dot[2][1] == dot[0][1]) {
			resultY = dot[1][1];
		}
		System.out.printf("%d %d",resultX, resultY);
	}
}
