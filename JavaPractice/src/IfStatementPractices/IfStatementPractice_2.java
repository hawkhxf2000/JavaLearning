package IfStatementPractices;

//import java.util.Iterator;
import java.util.Scanner;

public class IfStatementPractice_2 {
	public static void main(String[] args) {
		
		boolean isContinue = true;
		
		do {
		System.out.println("Please enter 3 numbers, seperated by \",\"");
		Scanner scanner = new Scanner(System.in);
		String inputString =  scanner.nextLine();
		String[] numberInputStrings = (inputString.split(","));
		
		double[] numberInputs = new double[numberInputStrings.length];
		try {
			for (int i = 0; i < numberInputStrings.length; i++) {
				numberInputs[i] = Double.parseDouble(numberInputStrings[i]);
			}
		} catch (Exception e) {
			System.out.println("You have enter non-number character, please try again!");
			continue;
		}
				
		double greatestNumber =0.0;
		for (int i = 0; i < numberInputs.length; i++) {
			if (numberInputs[i] >= greatestNumber) {
				greatestNumber = numberInputs[i];
			}		
		}
		System.out.println("The greatest number is:" + greatestNumber);
		
		double equalNumber;
		
		System.out.println("Do you want to try another one?yes/no");
		Scanner scCondition = new Scanner(System.in);
		String conditionQuit = scCondition.next();
		
		if(conditionQuit.equals("no")) {
			isContinue = false;
		}
		
		}while(isContinue);
	}
}
