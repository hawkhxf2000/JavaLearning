package IfStatementPractices;

import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the weight:");
		Scanner scanner = new Scanner(System.in);
		double weight = scanner.nextDouble();

		if(weight <116)
			System.out.println("Eat 5 banana splits!");
		else if(weight >116 && weight <=130)
			System.out.println("Eat a banana split!");
		else if(weight >130 && weight <=200)
			System.out.println("Perfect!");
		else if(weight >200)
			System.out.println("Plenty of banana splits have been consumed!");
		else System.out.println("You have input wrong weight!");
		
		scanner.close();
	}
}


