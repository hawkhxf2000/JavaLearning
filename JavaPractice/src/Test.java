import java.util.Arrays;
import java.util.Scanner;

//import java.util.Arrays;

//import java.util.ArrayList;
//import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp; 
		int [] theArray =new int [5];
		Scanner myScanner=new Scanner(System.in);
		System.out.println("Please enter 5 numbers:");
		for ( int i=0; i<theArray.length;i++)
			theArray[i]= myScanner.nextInt(); 

		for(int i=0;i<theArray.length - 1;i++) {
			for (int  j=i+1; j<theArray.length; j++) {
				if (theArray[i]>theArray[j]) {
					temp =theArray[i]; 
					theArray[i] = theArray[j];
					theArray[j] = temp; 
				} 
			}
		}

		System.out.println(Arrays.toString(theArray));
	}
}


