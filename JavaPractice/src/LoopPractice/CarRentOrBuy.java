package LoopPractice;

import java.util.Scanner;
public class CarRentOrBuy {
    public static void main(String[] args) {
				
		   System.out.println(" *** Welcome to Vroom!*** ");
		   System.out.println("Buy or rent a car ? enter B for buying , R for renting. ");
		   Scanner keyboard = new Scanner(System.in);
		   char input = keyboard.next().toLowerCase().charAt(0);
		   switch (input) {   
		   case 'b':
		     System.out.println("so you're here to buy!");
		     System.out.println("we have three different cars available");
		     System.out.println("1-Toyota,12k");
		     System.out.println("1-Ford,  25k");
		     System.out.println("3-Ferrari 100k");
		     System.out.println("Which one do you want?");
		     int wHichone = keyboard.nextInt();
		      if (wHichone==1)
		         System.out.println("You got a the Toyota!");
		      else if (wHichone==2) 
		         System.out.println("You got a the Ford!"); 
		      else if  (wHichone==3)
		    	 System.out.println("You got a the Ferrari!"); 
		      else
		    	 System.out.println("Oops! we dont have that option"); 
		     System.out.println("Bye!!"); 
		     break;
		   case 'r':
		     System.out.println("so you're here to Rent!");
			 System.out.println("For how many days do you need a car?");
			 int dAys=keyboard.nextInt();
			 Double totalRent = 3.5 * Math.pow(dAys,2.0)/2;
			   if (dAys>0)
				 System.out.println("Total rent is C$"+totalRent);
			   else
				 System.out.println("Number of days can't be Zero or Negative");
			 System.out.println( "Bye!!");
		     break;
		   default:
		     System.out.println("You didn't enter 'B'or 'R' and we we don't offer any other service!");
		     System.out.println("Bye!!");
		     break;

		    
		}
		   keyboard.close();
	}

}
