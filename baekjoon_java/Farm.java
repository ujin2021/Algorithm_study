package baekjoon_java;
import java.util.*;
public class Farm {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int n = input.nextInt();
		int w = input.nextInt();
		if(a == b) {
			if(n == 2) {
				if(a + b == w)
					System.out.printf("%d %d", 1, 1);
				else
					System.out.println(-1);
			}
			else
				System.out.println(-1);
		}	
		else {
			int op = (w - b*n > 0)? (w - b*n) : (b*n - w);
			int num = (a > b)? (a - b) : (b - a);
			int sheepNum = op / num;
			if(op % num > 0)
				System.out.println(-1);
			else if(sheepNum == n)
				System.out.println(-1);
			else if(sheepNum <= 0)
				System.out.println(-1);
			else
				System.out.printf("%d %d", sheepNum, n - sheepNum);
		}
	}
}
