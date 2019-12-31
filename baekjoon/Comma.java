package baekjoon;
import java.util.*;
public class Comma {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		for(int i = 0; i < num; i++) {
			String str = input.next();
			String a = str.split(",")[0];
			String b = str.split(",")[1];
			int result = Integer.parseInt(a) + Integer.parseInt(b);
			System.out.println(result);
		}
	}
}
