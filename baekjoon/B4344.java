package baekjoon;
//한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력
import java.util.*;
public class B4344 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		for(int i = 0; i < num; i++) {
			double sum = 0;
			double good = 0;
			int std = input.nextInt();
			int[] arr = new int[std];
			for(int j = 0; j < std; j++) {
				arr[j] = input.nextInt();
				sum += arr[j];
			}
			//System.out.println("sum" + sum);
			double aver = sum / std;
			//System.out.println("aver " + aver);
			for(int j = 0; j < std; j++) {
				if(arr[j] > aver) {
					good++;
				}
			}
			//System.out.println("good" + good);
			double per = good / std * 100;
			System.out.printf("%.3f", per);
			System.out.print("%\n");
		}
	}
}
