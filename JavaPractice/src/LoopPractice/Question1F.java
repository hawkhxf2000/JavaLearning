package LoopPractice;

public class Question1F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean sign = true;
		int sum = 0; 
		int n = 0;
		
		while(sum<30) {
			if(sign)
				sum = sum + n;
			else 
				sum = sum - n;
			System.out.print(sum);
			sign = !sign;
			n = n + 10;
		}
	}

}
