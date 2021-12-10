package LoopPractice;

/*
Question 4:
Write a program that prints the numbers from 1 to 100. But for multiples of three
print ¡°Fizz¡± instead of the number and for the multiples of five print ¡°Buzz¡±. For
numbers which are multiples of both three and five print ¡°FizzBuzz¡±.
Use a for loop to solve this problem.
*/

public class T7Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++) {
			if(i%3 != 0 && i%5 !=0) 
				System.out.print(i);				
			else if(i%3 == 0)
				System.out.print("Fizz");				
			if(i%5 == 0)
				System.out.print("Buzz");
		
		System.out.println();
		}
	}
}
