package baekjoon_java;
import java.util.*;
//최소 갯수를 구하기위해선 일단 5로 먼저 나누고 시작해야한다. 5로 나눴을때 나머지가 5가지이므로 나머지로 상황을 나눠서 생각해본다
public class Sugar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num == 3 || num == 5)
			System.out.println(1);
		else if(num == 4 || num == 7)
			System.out.println(-1);
		else {
			switch(num % 5) {
				case 0 :
					System.out.println(num / 5);
					break;
				case 1 : case 3 :
					System.out.println((num / 5) + 1);
					break;	
				case 2 : case 4 :
					System.out.println((num / 5) + 2);
					break;
			}
		}
	}
}
