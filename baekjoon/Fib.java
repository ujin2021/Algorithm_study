package baekjoon;
import java.util.*;
public class Fib {
	static int fib(int num) {
		if(num <= 1)
			return num;
		else
			return fib(num - 1) + fib(num - 2);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int result = fib(num);
		System.out.println(result);
	}
}
