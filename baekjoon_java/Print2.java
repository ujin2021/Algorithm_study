package baekjoon_java;
import java.util.*;
public class Print2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(true) {
			String str = input.nextLine();
			if(str == null)
				break;
			else if(str.equals(""))
				System.out.println();
			else
				System.out.println(str);
		}
	}
}
