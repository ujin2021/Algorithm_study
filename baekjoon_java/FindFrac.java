package baekjoon_java;
import java.util.*;
public class FindFrac {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int i = 1;
		int sum = 0;
		int off;
		
		for(i = 1; ;i++) {
			if(i*i + i >= 2*num)
				break;
		}
		sum = (i*(i+1))/2;
		//System.out.println(i);
		//System.out.println(sum);
		
		off = num - (sum - i);
		
		if((i+1) % 2 == 0) {
			System.out.printf("%d/%d", i+1-off, off);
		}
		else {
			System.out.printf("%d/%d", off, i+1-off);
		}
	}
}
