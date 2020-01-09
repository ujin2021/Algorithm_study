package baekjoon_java;
import java.util.*;
//"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점
//1차원 배열사용
public class Oxquiz {
	public static void quiz(String s) {
		int plus = 1;
		int score = 0;
		String[] arr = s.split("");
		for(int i = 0; i < s.length(); i++) {
			if(arr[i].equals("O")) {
				score += plus;
				plus++;
			}
			if(arr[i].equals("X")) {
				plus = 1;
			}
		}
		System.out.println(score);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		for(int i = 0; i < num; i++) {
			String s = input.next();
			quiz(s);
		}
	}
}
