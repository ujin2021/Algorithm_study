package baekjoon_java;
import java.util.*;
/*������ ���ĺ��� ���ؼ�, a�� ó�� �����ϴ� ��ġ, b�� ó�� �����ϴ� ��ġ, ... z�� ó�� �����ϴ� ��ġ�� �������� �����ؼ� ����Ѵ�.
����, � ���ĺ��� �ܾ ���ԵǾ� ���� �ʴٸ� -1�� ����Ѵ�. �ܾ��� ù ��° ���ڴ� 0��° ��ġ�̰�, �� ��° ���ڴ� 1��° ��ġ�̴�.*/
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
