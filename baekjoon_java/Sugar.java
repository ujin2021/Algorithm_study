package baekjoon_java;
import java.util.*;
//�ּ� ������ ���ϱ����ؼ� �ϴ� 5�� ���� ������ �����ؾ��Ѵ�. 5�� �������� �������� 5�����̹Ƿ� �������� ��Ȳ�� ������ �����غ���
public class Sugar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num == 3 || num == 5)
			System.out.println(1);
		else if(num == 4 || num == 7)
			System.out.println(-1);
		else {
			switch(num % 5) {
				case 0 :
					System.out.println(num / 5);
					break;
				case 1 : case 3 :
					System.out.println((num / 5) + 1);
					break;	
				case 2 : case 4 :
					System.out.println((num / 5) + 2);
					break;
			}
		}
	}
}
