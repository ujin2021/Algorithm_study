package baekjoon_java;
import java.util.*;
/*각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.*/
//97(a)~122(z)
public class Where {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		int idx = 0;
		int result = 0;
		for(int i = 97; i < 123; i++) {
			for(int j = 0; j < str.length(); j++) {
				if(i == (int)str.charAt(j)) {
					System.out.print(j);
					idx = j;
					break;
				}
			}
			if(idx == str.length());
				System.out.print(-1);
			idx = 0;
		}
	}
}
