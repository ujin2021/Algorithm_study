package baekjoon_java;
import java.util.*;
public class Binary {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();
		for(int i = 0; i < count; i++) {
			int num = input.nextInt();
			int digit = 0;
			while(num != 0) {
				if(num % 2 == 1) {
					System.out.printf("%d ", digit);
				}
				num /= 2;
				digit++;
			}
			System.out.println();
		}
	}
}
