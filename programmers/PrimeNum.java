package programmers;
import java.util.*;
public class PrimeNum {
	public static void main(String[] args) {
		int answer = 0;
	    int count = 0;
	      
	    for(int i = 2; i <= 10; i++){
	        for(int j = 1; j <= i; j++){
	        	System.out.printf("i : %d, j : %d", i, j);
	            if(i % j == 0) {
	            	count++;
	            	System.out.println("count:" + count);
	            }
	        }
	        if(count == 2) {
	        	answer++;
	        }
	        count = 0;
	    }
		System.out.println(answer);
	}
}
