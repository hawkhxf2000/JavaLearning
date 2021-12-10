package LoopPractice;

public class Question1E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5, count = 0;
		while(i != 1) {
			System.out.println(count + " " + i);
			count++;
			if(i%2 == 0)
				i/=2;
			else 
				i = 3 * i + 1;
		}
	}

}
