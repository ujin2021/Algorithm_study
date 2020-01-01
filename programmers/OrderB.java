package programmers;

import java.util.Arrays;

//65 ~ 90:AtoZ, 97~122 : atoz
public class OrderB {
	public static String solution(String s) {
	      String answer = "";
	      int leng = s.length();
	      int[] arr = new int[leng];
	      
	      for(int i = 0; i < leng; i++) {
	    	  arr[i] = (int)(s.charAt(i));
	      }
	      Arrays.sort(arr);
	      for(int i = leng - 1; i >= 0; i--) {
	    	  answer += (char)(arr[i]);
	      }
	      return answer;
	}
	public static void main(String[] args) {
		String answer = solution("Zbcdefg");
		System.out.println(answer);
	}
}
