package baekjoon_java;
import java.util.*;
public class BEpoint {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int fixedCost = input.nextInt();
		int varCost = input.nextInt();
		int num = input.nextInt();
		
		if(num <= varCost)
			System.out.println(-1);
		//else if(fixedCost <= (num - varCost))
			//System.out.println(-1); 이 조건을 넣으면 왜 안되는거죠?
		else {
			int max = fixedCost/(num - varCost);
			System.out.println(max + 1);
		}
	}
}
