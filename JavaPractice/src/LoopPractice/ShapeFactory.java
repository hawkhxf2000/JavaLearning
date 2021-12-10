//这个版本将两个算法重构为类的方法，这样可以保证主体结构尽量简洁，在进行修改时不容易出错。

package LoopPractice;

import java.util.Scanner;

public class ShapeFactory {

	public static void main(String[] args) {
		// Show welcome message and ask user to choose which shape they want
		System.out.println("*** Welcome to Shape Factory! ***");
		System.out.println("Do you want to print a reversed pyramid or a number pattern? (\"R\", \"#\", or \"x\" for exit)");
		Scanner inScanner = new Scanner(System.in);
		char choice = inScanner.next().toUpperCase().charAt(0); //Get user's input, Convert it to upper case for next step 

		//print different pattern based on user's choice by switch statement 
		switch (choice) {
		case 'R': {
			//Show message to ask for input element of reversed pyramid 
			System.out.println("A reversed pyramid of stars or at signs?(\"*\" or \"@\")");
			char pyramidElement = inScanner.next().charAt(0); //Get user's input and store it to a variable for output

			//Add a judgment to ensure user input "*" or "@"
			if(pyramidElement!='*' && pyramidElement!= '@')
				System.out.println("Wrong input! Please input correct element again.");

			//if the input is correct, run algorithm for reversed pyramid
			else {
				pyramidShape(pyramidElement);
			}
			break;
		}

		//below is for number pattern output
		case '#':{
			numberShape(5);
			break;
		}

		//below is for message of exit
		case 'X':
			System.out.println("Bye!!");
			break;

			//show message to ask user input again when they input wrong character
		default:
			System.out.println("Wrong input! Please try again.");
		}
		inScanner.close(); //close scanner
	}

	public static void pyramidShape(char element) {
		for(int i = 1; i<=5;i++) {
			for(int j=1;j<i;j++) 
				System.out.print(" ");
			for(int k=0;k<=5-i;k++)
					System.out.print(element+" ");
			System.out.println();
		}
	}

	public static void numberShape(int line) {
		int sum = 1;
		for(int i=0;i<line;i++) {
			for(int j=0;j<=i;j++)
			{System.out.print(sum+" ");
			sum++;
			}
			System.out.println();
		}
	}

}
