package LoopPractice;

public class Question1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=30;
		int b=3;
		
		while(a>=b) {
			System.out.println("while "+ a +" " + b);
			if(a%b == 0) {
				a = a / b;
				b++;
			}
			else {
				a = a - 1;
				b = b - 1;
			}
		}
		System.out.println("the end " + a + " " + b);
	}

}
