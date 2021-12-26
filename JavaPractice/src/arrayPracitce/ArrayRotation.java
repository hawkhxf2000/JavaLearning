package arrayPracitce;


import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Welcome message part
		System.out.print("What size do you want your array to be (minimum size 5 and an odd number)? ");
		Scanner in = new Scanner(System.in);
		int arrSize = in.nextInt();
		System.out.print("Starting integer value: ");
		int inputNum = in.nextInt();
		System.out.println();
		
		//Create an array with input size and start with the input number at the last position then add 3
		//to left position. Finally display the array
		int[] arr = new int[arrSize];
		System.out.println("Original array :");
		for(int i = arrSize-1; i>=0; i--) {
			arr[i] = inputNum;
			inputNum += 3;	
		}
		for(int num:arr)
			System.out.print(num+"->   ");
		System.out.println();
		System.out.println();
		
		//Rotate the Array
		System.out.println("Array after rotation:");
		
		arr[arrSize-1] =arr[0];  //Place the number on first place to last place;
		
		//Because the number at even index equals the on at previous even index minus 6, moving left actually
		// means the number at previous even index minus 6. 
		
		for(int i = 0; i<arrSize-2; i=i+2) {
			arr[i] = arr[i] - 6;
		}
		
		for(int num:arr)
			System.out.print(num+"->   ");
		
		in.close();
	}

}
