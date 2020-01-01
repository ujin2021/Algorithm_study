package programmers;

public class Onetwofour {
	public static String reverseString(String s) {
	    return ( new StringBuffer(s) ).reverse().toString();
	  }
	
	public static String solution(int n) {
	      String answer = "";
	      int quo = 0;
	      int mod = 0;
	      String[] arr = {"4", "1", "2"};
	      while(true){
	          mod = n % 3;
	          if(mod == 0){
	              quo = n / 3 - 1;
	          }
	          else
	              quo = n / 3;
	          answer += arr[mod];
	          n = quo;
	          if(n == 0)
	              break;
	      }
	      answer = reverseString(answer);
	      return answer;
	  }
	public static void main(String[] args) {
		String answer = solution(24);
		System.out.println(answer);
	}
}
