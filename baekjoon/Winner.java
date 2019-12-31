package baekjoon;
import java.util.*;
public class Winner {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] score = {0, 0, 0, 0, 0};
		int[] copy = new int[5];
		int idx = 0;
		while(idx < 5) {
			for(int i = 0; i < 4; i++) {
				score[idx] += input.nextInt();
			}
			idx++;
		}
		
		for(int i = 0; i < 5; i++)
			copy[i] = score[i];
		
		Arrays.sort(copy);
		int num = 0;
		for(int i = 0; i < 5; i++) {
			if(score[i] == copy[4]) {
				num = i + 1;
				break;
			}
		}
		System.out.printf("%d %d", num, copy[4]);
	}
}
