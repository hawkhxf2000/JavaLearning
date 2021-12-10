package LoopPractice;

import java.util.Scanner;

public class Practice00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the numbers you want to calculate the average, seperated by \",\":");
		Scanner in = new Scanner(System.in);
	    String numbersEntering = in.next();
	    String[] numbersToCalculate = numbersEntering.split(",");
	    double sum = 0.0;
	    int count = numbersToCalculate.length, i=0;
	    while(i<count) {
	    	double number =  Double.parseDouble(numbersToCalculate[i]);
	    	if (number >= 0.0)
	    		sum += number;
	    	else {
				System.out.println("You enter a negative number " + number + ", we can't count this number in");
			}
	    	i++;
	    }
	    System.out.println("The sum is:" + sum);
	    System.out.println("The average is: " +(sum/count));
	}

}
