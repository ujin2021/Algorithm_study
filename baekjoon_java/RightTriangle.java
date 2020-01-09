package baekjoon_java;
import java.util.*;
public class RightTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
			int x = input.nextInt();
			int y = input.nextInt();
			int z = input.nextInt();
			if(x == 0 && y == 0 && z == 0)
				break;
			if((x*x + y*y == z*z) || (z*z + y*y == x*x) || (x*x + z*z == y*y))
				System.out.println("right");
			else
				System.out.println("wrong");
		}
		input.close();
	}
}
