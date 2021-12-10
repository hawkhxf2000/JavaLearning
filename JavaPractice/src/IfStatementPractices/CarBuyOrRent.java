package IfStatementPractices;

import java.util.Scanner;

public class CarBuyOrRent {

	public static void main(String[] args) {
		// Show welcome message and let the customer choose buy or rent
		System.out.println("*** Welcome to Vroom! ***");
		System.out.println("Buy or rent a car? Enter B for buying, R for renting.");
		Scanner scanner = new Scanner(System.in); 
		String buyOrRent = scanner.next().trim().toUpperCase();

		//Judge the customer want to buy or rent the car. If it's "B", show the welcome message and the type of cars they can choose.
		if(buyOrRent.equals("B")) {
			System.out.println("So you are here to Buy!");
			System.out.println("We have three different cars available:");
			System.out.println("1- Toyota, 12K");
			System.out.println("2- Ford, 25K");
			System.out.println("3- Ferrari, 100K");

			//Ask the customer to choose one type  
			System.out.println("Which one do you want?");
			int carType = scanner.nextInt();

			//use switch statement to determine what message should be shown
			switch (carType) {
			case 1: 
				System.out.println("You got the Toyota!");
				break;
			case 2: 
				System.out.println("You got the Ford!");
				break;
			case 3:
				System.out.println("You got the Ferrari!");
				break;

			default:
				System.out.println("Oops! We don't have that option!");  //If the input number is not 1,2,3, show them error message. 
			}
		}

		//If it's rent, show the welcome message and ask for the number of days they want to rent.
		else if(buyOrRent.equals("R")) {
			System.out.println("So you are here to Rent!");
			System.out.println("For how many days do you need a car?");
			int numOfDaysRent = scanner.nextInt();

			//if the number of days is less than or equal 0, show the error message 
			if(numOfDaysRent <= 0) 
				System.out.println("Number of days can't be zero or negative");
			else {
				double totalRent = 3.5 * Math.pow(numOfDaysRent, 2.0)/2; //calculate the total rent cost
				System.out.println("Total rent is: C$"+totalRent );      //Show the total rent cost
			}
		}
		// If customer's choice is not B or R, show the error message 
		else 
			System.out.println("You didn't enter B or R and we don't offer any other services!"); 

		System.out.println("Bye!!");                                    //Show the end message
		scanner.close();                                                //Close the scanner
	}
}

