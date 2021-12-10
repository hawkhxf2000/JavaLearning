package LoopPractice;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("pls input the first number:");
		Scanner input = new Scanner(System.in);
		int number1 = (int)input.nextDouble()*100;
		System.out.println("pls input the second number:");
		int number2 = (int)input.nextDouble()*100;
		
		if(number1 == number2)
			System.out.println("The two number is same");
		else {
			System.out.println("The two number is not same");
		}	
		input.close();
		
	}

}
