package baekjoon_java;
import java.util.*;
public class Star {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		for(int i = num; i > 0; i--) {
			for(int j = i; j > 0; j--)
				System.out.print("*");
			System.out.println();
		}
	}
}
