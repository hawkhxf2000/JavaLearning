package sortingMethods;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,9,6,1,2,8};
		SortingMethods sm = new SortingMethods();
		//sm.selectionSort(a);
		sm.bubbleSort(a);
		System.out.println(Arrays.toString(a));
	}
}