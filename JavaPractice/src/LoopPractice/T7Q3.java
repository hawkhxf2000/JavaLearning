package LoopPractice;

public class T7Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean condition = true;
		int i;
		double pi = 0.0;
		for(i=1;i<=10000;i++) {
			if(i%4 == 1)
				pi += 1.0/i;
			if(i%4 == 3)
				pi -= 1.0/i;
		}
		System.out.println("PI="+pi*4);
		
		pi=0.0;
		for(i=1;i<=10000;i+=2) {
			if(condition)
				pi+=1.0/i;
			else pi-=1.0/i;
			condition = !condition;
		}
		System.out.println("PI="+pi*4);
	}

}
