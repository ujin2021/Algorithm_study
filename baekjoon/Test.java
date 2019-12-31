package baekjoon;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		String str = input.next();
		String[] arr = str.split("");
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += Integer.parseInt(arr[i]);
		}
		System.out.println(sum);
	}
}
