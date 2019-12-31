package baekjoon;
import java.util.*;
public class Print {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		int idx = 0;
		for(int i = 0; i < str.length(); i++) {
			idx = i;
			if(idx != 0 && idx % 10 == 0) {
				System.out.println();
				idx = 0;
			}
			System.out.print(str.charAt(i));
		}
	}
}
