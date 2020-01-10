package baekjoon_java;
import java.util.*;
public class SortGrid {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int[][] grid = new int[num][2];
		int tempX; int tempY;
		for(int i = 0; i < num; i++) {
			grid[i][0] = input.nextInt();
			grid[i][1] = input.nextInt();
		}
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num-1-i; j++) {
				if(grid[j][0] > grid[j + 1][0]) {
					tempX = grid[j+1][0];
					tempY = grid[j+1][1];
					grid[j+1][0] = grid[j][0];
					grid[j+1][1] = grid[j][1];
					grid[j][0] = tempX;
					grid[j][1] = tempY;
				}
			}
		}
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num-1-i; j++) {
				if(grid[j][0] == grid[j][0]) {
					if(grid[j][1] > grid[j + 1][1]) {
						tempX = grid[j+1][0];
						tempY = grid[j+1][1];
						grid[j+1][0] = grid[j][0];
						grid[j+1][1] = grid[j][1];
						grid[j][0] = tempX;
						grid[j][1] = tempY;
					}
				}
			}
		}
	
		for(int i = 0; i < num; i++) {
			System.out.printf("%d %d\n", grid[i][0], grid[i][1]);
		}
		input.close();
	}
	
}
