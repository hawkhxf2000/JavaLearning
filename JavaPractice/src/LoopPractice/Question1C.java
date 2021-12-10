package LoopPractice;

public class Question1C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		boolean again = true;
		
		for(i=1;i<5;i++) {
			again = !again;
			for(j=1;j<5;j+=2) {
				System.out.print(i+"  "+j);
				if(again)
					System.out.print("-");
				else 
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
