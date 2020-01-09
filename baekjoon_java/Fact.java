package baekjoon_java;
import java.util.*;
public class Fact {
	static int factorial (int num) {
		if(num <= 1)
			return 1;
		else
			return num * factorial(num - 1);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int result = factorial(num);
		System.out.println(result);
	}
}
