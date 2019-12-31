package baekjoon;
import java.util.*;
public class WordNum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] strSplit = str.split(" ");
		int num = 0;
		
		if(strSplit.length == 0)
			System.out.println(0);
		
		else{
			for(int i = 0; i < strSplit.length; i++) {
				if(!strSplit[i].equals(""))
					num++;
			}
			System.out.println(num);
		}
		/*
		<runtime error>
		int i = 0;
		int num = 0;
		
		if(str.isEmpty())
			System.out.println(0);
		else {
			String prev = strSplit[0];
			String now = strSplit[1];
			
			for(i = 0; i < strSplit.length - 1; i++) {
				prev = strSplit[i];
				now = strSplit[i + 1];
				if(!prev.equals(" ") && now.equals(" "))
					num++;
			}
			if(!prev.equals(" ") && !now.equals(" "))
				num++;
			else if(prev.equals(" ") && !now.equals(" "))
				num++;
			
			System.out.println(num);
			
		}	*/
	}
}
