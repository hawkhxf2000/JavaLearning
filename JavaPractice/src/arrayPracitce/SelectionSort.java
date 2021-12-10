package arrayPracitce;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] arraySorting =  new double[5];
		System.out.println("Please enter 5 numbers for sorting:");
		Scanner in = new Scanner(System.in);
		for(int i=0;i<5;i++) {
		arraySorting[i] = in.nextDouble();
		}
		for(int i=0;i<5;i++) {
			for(int j=i;j<5;j++) {
				double temp;
				temp = arraySorting[i];
				if(arraySorting[j]<temp) {
					arraySorting[i] = arraySorting[j];
					arraySorting[j] = temp;
					temp = arraySorting[i];
				}
			}
		}
		System.out.println("the sorted array is as:");
		System.out.println(Arrays.toString(arraySorting));
		in.close();
	}

}
