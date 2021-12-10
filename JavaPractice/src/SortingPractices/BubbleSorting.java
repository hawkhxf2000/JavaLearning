package SortingPractices;

import java.util.Scanner;

public class BubbleSorting {

	public static void main(String[] args) {
boolean isContinue = true;
		
		do {
		System.out.println("Please enter the numbers you want to sort, seperated by \",\"");
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
				
		double temp;
		
		//从大到小排列
		System.out.println("The number sorted by descending order");
		for (int i = 1; i <= numberInputs.length; i++) {
			for (int j=numberInputs.length-1; j>0; j--) {
				if (numberInputs[j] >numberInputs[j-1]) {
					temp = numberInputs [j-1];
					numberInputs[j-1] = numberInputs[j];
					numberInputs[j] = temp;
				}
			}		
			System.out.print(numberInputs[i-1]+"\t");
		}
		
		//从小到大排列
		System.out.println("\nThe number sorted by ascending order");
		for (int i = 1; i <= numberInputs.length; i++) {
			for (int j=numberInputs.length-1; j>0; j--) {
				if (numberInputs[j] <numberInputs[j-1]) {
					temp = numberInputs [j-1];
					numberInputs[j-1] = numberInputs[j];
					numberInputs[j] = temp;
				}
			}		
			System.out.print(numberInputs[i-1]+"\t");
		}
		
		System.out.println("");
		System.out.println("Do you want to try another one?yes/no");
		Scanner scCondition = new Scanner(System.in);
		String conditionQuit = scCondition.next();
		
		if(conditionQuit.equals("no")) {
			isContinue = false;
		}
		
		}while(isContinue);
	}

}
