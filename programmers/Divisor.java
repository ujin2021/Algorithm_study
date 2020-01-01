package programmers;
import java.util.*;

public class Divisor {
	public static int[] solution(int[] arr, int divisor) {
		int[] answer = {};
	    int leng = arr.length;
	    int num = 0;
	    int[] index = new int[arr.length];
	      
	    for(int i = 0; i < leng; i++){
	        if(arr[i] % divisor == 0){
	            index[num] = i;
	            num++;
	        }
	    }
	     
	   if(num == 0){
	       answer = new int[1];
	       answer[0] = -1;
	   }
	   else{
		   answer = new int[num];
		   for(int i = 0; i < num; i++){
			   answer[i] = arr[index[i]];
			   }
	          Arrays.sort(answer);
	      }
	      return answer;
	  }
	public static void main(String[] args) {
		int[] arr = {5, 9, 7, 10};
		int divisor = 5;
		solution(arr, divisor);
	}
}
