package baekjoon_java;
import java.util.*;
public class GermanLotto {
	static void printLotto(int arr[]) {
		int five[] = new int[5];
		for(int i = 0; i < 5; i++) {
			five[i] = arr[i];
		}
		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		while(true) {
			num = input.nextInt();
			if(num == 0) {
				input.close();
				break;
			}
			int arr[] = new int[num];
			for(int i = 0; i < num; i++) {
				arr[i] = input.nextInt();
				printLotto(arr);
			}
		}
	}
}
