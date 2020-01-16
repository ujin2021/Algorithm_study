package baekjoon_java;

public class SameNum {
	public static void main(String[] args) {
		int ten = 0;
		int twelve = 0;
		int sixteen = 0;
		for(int i = 1000; i < 9999; i++) {
			int num1 = i;
			int num2 = i;
			int num3 = i;
			while(num1 != 0) {
				ten += num1 % 10;
				num1 = num1 / 10;
			}
			while(num2 != 0) {
				twelve += num2 % 12;
				num2 = num2 / 12;
			}
			while(num3 != 0) {
				sixteen += num3 % 16;
				num3 = num3 / 16;
			}
			if(ten == twelve && twelve == sixteen)
				System.out.println(i);
			
			ten = 0; twelve = 0; sixteen = 0;
		}
	}
}
