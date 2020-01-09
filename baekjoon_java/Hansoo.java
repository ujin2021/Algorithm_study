package baekjoon_java;
import java.util.*;
public class Hansoo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int count = 0;
		
		if(num < 100)
			System.out.println(num);
		
		else if(num < 1000){
			for(int i = 100; i <= num; i++) {
				int three = i / 100;
				int two = (i - three*100) / 10;
				int one = (i - three*100 - two*10);
				if((three - two) == (two - one))
					count++;
			}
			System.out.println(count + 99);
		}
		else {
			for(int i = 100; i <= 999; i++) {
				int three = i / 100;
				int two = (i - three*100) / 10;
				int one = (i - three*100 - two*10);
				if((three - two) == (two - one))
					count++;
			}
			System.out.println(count + 99);
		}
	}
}
