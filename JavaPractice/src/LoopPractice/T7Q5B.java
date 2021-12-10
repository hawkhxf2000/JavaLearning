package LoopPractice;


/*
 Question 5:
Write programs to draw the following shapes:
	B. 
	    *
	   ***
	  *****
	 *******
	*********
	
	*/

import java.util.Scanner;

public class T7Q5B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please input the lines of star:");
		int totalLine = in.nextInt();
		System.out.println("Please input the number of space between each symbol:");
		int numSpace = in.nextInt();
		
		for(int i=totalLine;i>0;i--) {
			int pos = i;
			for(int j=1;j<=2*(totalLine+numSpace);j++) {
				if(j == pos && pos<=2*(totalLine+numSpace-i)) {
					System.out.print("*");
					pos+=numSpace + 1;
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
			in.close();
	}

}
