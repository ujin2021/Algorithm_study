package baekjoon_java;
import java.util.*;
public class MakeOne {
	static int fun(int number) {
		int sum = 0;
		for(int i = 0; number > 0 ; i++) {
			sum += number % 10;
			number = number / 10;
		}
		if(sum < 10) {
			return sum;
		}
		else {
			return fun(sum);
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int result = fun(num);
		System.out.println(result);
	}
}
