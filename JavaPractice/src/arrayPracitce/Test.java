package arrayPracitce;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		  // Write your code here
		  double[] numbers = new double[3];
		  System.out.println("Please enter 3 numbers, seperate with \',\':");
		  Scanner sc = new Scanner(System.in);
		  String inputNumberString= sc.nextLine();
		  
		  String[] inputNumbers = inputNumberString.split(",");
		  for(int i=0;i<3;i++){
		     numbers[i] = Double.parseDouble(inputNumbers[i]);
		  }
		  if(numbers[0]<numbers[1] && numbers[1]<numbers[2]){
		     System.out.println("Increasing");
		  }
		   else if(numbers[0]>numbers[1] && numbers[1]>numbers[2]){
		     System.out.println("Decreasing");
		   }
		   else
		     {System.out.println("Neither increasing or decreasing order");}
		 }
}
