package baekjoon;
import java.util.*;
public class Square {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		int b = input.nextInt();
		
		double result = Math.pow(a, b);
		System.out.println(result);
	}
}
