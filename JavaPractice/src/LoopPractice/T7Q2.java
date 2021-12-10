package LoopPractice;

public class T7Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prevprev =2, prev=2, sum=0;
		for(int i=1 ;i<4;++i) {
			sum = prevprev +prev;
			System.out.println(prevprev+" "+prev+" "+sum);
			prevprev = prev;
			prev = sum;
		}
		
	}

}
