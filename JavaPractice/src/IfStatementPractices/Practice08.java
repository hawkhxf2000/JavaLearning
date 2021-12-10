package IfStatementPractices;

import java.util.Scanner;

public class Practice08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the cost of purchase:");
		Scanner scanner = new Scanner(System.in); 
		double cost = scanner.nextDouble();
				
		double amountShipping;
		if(cost <= 0)
			System.out.println("The cost can't equal or less than 0!");
		else if(cost <=20) {
			amountShipping=5.99;
			System.out.println("The shipping fee is " + amountShipping);
			}else if(cost <= 65) {
			amountShipping=10.99;
			System.out.println("The shipping fee is " + amountShipping);
			}else{
				amountShipping=15.99;
				System.out.println("The shipping fee is " + amountShipping);
			}
	}

}
