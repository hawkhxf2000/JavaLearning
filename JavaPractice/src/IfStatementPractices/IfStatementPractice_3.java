package IfStatementPractices;

import java.util.Scanner;

public class IfStatementPractice_3 {

	public static void main(String[] args) {
		System.out.println("Please input the first number:");
		Scanner scanner = new Scanner(System.in);
		double number1 = scanner.nextDouble();
		System.out.println("Please input the second number");
		double number2 =  scanner.nextDouble();
		
		number1 = Math.round(number1 * 1000);
		number2 = Math.round(number2 * 1000);
		
		if ( number1 == number2) {
			System.out.println("The two number is same!");
		}else {
			System.out.println("The two number is not same!");
		}
		//System.out.println(number1 + " " +number2)
		scanner.close();
	}

}
