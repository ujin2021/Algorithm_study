package baekjoon_java;
import java.util.*;
public class EasySolve {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int sum = 0;
		for(int i = 1;; i++) {
			b -= i;
			if(b >= 0) {
				sum += i*i;
			}
			else {
				sum += i * (b+i);
				break;
			}
		}
		a = a - 1;
		for(int i = 1;;i++) {
			a -= i;
			if(a >= 0) {
				sum -= i*i;
			}
			else {
				sum -= i * (a+i);
				break;
			}
		}
		System.out.println(sum);
	}
}
