package programmers;

public class Lcm {
	public static int solution(int[] arr) {
	      int answer = 1;
	      int temp = 1;
	      for(int i = 0; i < arr.length; i++){
	          answer *= arr[i];
	      }
	      System.out.println("answer :" + answer);
	      for(int i = 0; i < arr.length; i++){
	    	  System.out.println("i :" + i);
	          for(int j = 0; j < arr.length; j++){
	              if(j != i){
	                  temp *= arr[j];
	              }
	          }
	          System.out.println("temp :" + temp);
	          if(answer / arr[i] == temp)
	              continue;
	          else
	              answer = answer / arr[i];
	          temp = 1;
	          System.out.println("answer :" + answer);
	      }
	      return answer;
	 }
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		int answer = solution(arr);
	}
	
}
