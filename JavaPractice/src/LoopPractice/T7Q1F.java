package LoopPractice;

public class T7Q1F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<9;i++) {
			if(i%2 == 0) System.out.println(i+1);
			else if(i%3 == 0) continue;
			else if(i%5 == 0) break;
			else System.out.println("Not multiple of 2, 3 or 5.");
		}
		System.out.println("End");
	}

}
