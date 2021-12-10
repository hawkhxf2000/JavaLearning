package LoopPractice;

public class T7Q1E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int j=0;j<=2;j++) {
			System.out.print(j);
			for(char ch='A';ch<='M';ch+=(3+j))
				System.out.print((char)(ch+1));
			System.out.println();
		}
	}

}
