package IfStatementPractices;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IfStatementPriactice_1 {

	public static void main(String[] args) {
		System.out.println("Quadratic equation is as: ax^2+bx+c=0, please input parameters a,b,c:");
		
		// ‰»Î≤Œ ˝a,b,c
		System.out.print("a= \t");
		Scanner aInput = new Scanner(System.in);
		double a = aInput.nextDouble();
		System.out.print("b= \t");
		Scanner bInput = new Scanner(System.in);
		double b = bInput.nextDouble();
		System.out.print("c= \t");
		Scanner cInput = new Scanner(System.in);
		double c = cInput.nextDouble();
		
		if(a == 0) {
			System.out.println("a cannot be zero! Please try again");	
			System.exit(0);
		}
		
		double lambda = b*b -4*a*c;		
		if(lambda <0.0) {
			System.out.println("The equation has no real roots");
		}
		
		if(lambda ==0.0) {
			System.out.println("The equation has just one real root");
			System.out.println("x="+(-b/(2*a)));
		}
		
		if(lambda >0.0) {
			System.out.println("The equation has two real roots");
			System.out.println("x1="+((-b+Math.sqrt(lambda))/(2*a))+"\t"+"x2="+((-b-Math.sqrt(lambda))/(2*a)));
		}
	}

}
