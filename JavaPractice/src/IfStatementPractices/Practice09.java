package IfStatementPractices;

import java.util.Scanner;

public class Practice09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Please input the string:");
	Scanner in = new Scanner(System.in);
	String msg = in.next();
	
	int x=0, y=10, z=100;
	
	switch (msg.charAt(0)) {
	case 'a': case 'b':System.out.println("case 1");
	x = (msg.equals("abc")?(5+y++):(--y+ z--));
	break;
	case 'c': System.out.println("case 2");
	y /= 5; 
	default:
		System.out.println("default");
	}
	System.out.println(x + " " + y +" " +z);
	}

}
