package LoopPractice;

public class Practice05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
		while(!(i % 3== 1 && i % 5 ==2 && i % 7 == 3))
			i++;
		System.out.println("The minimun number meet the requirement is: " + i);
		
	}

}
