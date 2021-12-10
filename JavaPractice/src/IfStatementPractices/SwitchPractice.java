package IfStatementPractices;

import java.util.Scanner;

public class SwitchPractice {

	public static void main(String[] args) {
		int category, grade;
		
		System.out.println("Enter a grade(0-100):");
		Scanner scanner = new Scanner(System.in);
		grade = scanner.nextInt();
		category = grade/10;
		
		if(category ==10 || category == 9)
			System.out.println("Excellent");
		else if(category == 8)
			System.out.println("Nice job");
		else if(category == 7)
			System.out.println("Good");
		else if(category == 6)
			System.out.println("Below Average");
		else 
			System.out.println("Problem");
		
		scanner.close();
	}

}
