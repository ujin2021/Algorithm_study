package baekjoon_java;
import java.util.*;
public class ExitSquare {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		int w = input.nextInt();
		int h = input.nextInt();
		int[] arr = {x, y, (h-y), (w-x)};
		Arrays.sort(arr);
		System.out.println(arr[0]);
	}
}
