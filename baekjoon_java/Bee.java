package baekjoon_java;
import java.util.*;
public class Bee {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int count = 1;
		int i = 0;
		for(i = 0;;i++) {
			count += 6 * i;
			if(num <= count) {
				break;
			}
		}
		System.out.println(i + 1);
	}
}
