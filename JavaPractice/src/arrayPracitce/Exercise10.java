package arrayPracitce;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please input an odd number to define the size of magic square:");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("You have input an even number,please try again!");
			n = in.nextInt();
		}
		
		int number = 1;
		int row = n-1;
		int column =n/2;
		int[][] square = new int[n][n];
		square[row][column] = 1;
		
		for(int i = 2; i<= n*n; i++) {
			if(square[(row+1)%n][(column+1)%n] == 0) {
				row = (row+1) % n;
				column = (column + 1) % n;
			}
			else {
				row  = (row-1)%n;
			}
			square[row][column] = i;
		}
		
//		for(int i=0;i<n*n;i++) {
//			if(row >= n)
//				row = 0;
//			if (column >= n )
//				column = 0;
//			
//			if(square[row][column] != 0){
//				row = row - 2;
//				column--;
//				}
//			square[row][column] = number++;
//			
//			if(row == n-1 && column == n-1)
//				row = row-1;
//			else{
//				row++;
//				column++;
//			}	
//			
//		}
		
		for(int j = 0; j < n;j++) {
			for(int k = 0; k < n; k++)
				System.out.print(square[j][k]+"  ");
		System.out.println();
		}
		in.close();
	}

}
