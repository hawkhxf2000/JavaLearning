package LoopPractice;

/*
 Question 6:
Write a nested for loop to display the following output:
a b c d e
a b c d
a b c
a b
a

*/

public class T7Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			for(char ch='a';ch<=('e'-i);ch++) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}

}
