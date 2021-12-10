package IfStatementPractices;

import java.util.Scanner;

public class IfStatementPractice_4 {

	
	public static void main(String[] args) {
		System.out.println("Please input the month you want to check(mm/yyyy):");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		String[] inputArray = input.split("/");
		String month = inputArray[0];
		String year = inputArray[1];
		
		if(month.equals("01") || month.equals("03") || month.equals("05") ||month.equals("07") 
				|| month.equals("08") || month.equals("10") || month.equals("12")) {
			System.out.println("There are 31 days in this month");
		}
		else if(month.equals("04") || month.equals("06") || month.equals("09") ||month.equals("11")) {
			System.out.println("There are 30 days in this month");
		}else {
			if(Integer.parseInt(year) % 400 != 0) {
				if(Integer.parseInt(year) % 4 != 0 || Integer.parseInt(year) % 100 == 0)
				System.out.println("There are 28 days in this month");
				else System.out.println("There are 29 days in this month");
			}
			else System.out.println("There are 29 days in this month");
			
		scanner.close();
		}
	//int result = month.compareTo(year);
	}
  
}
