package sortingMethods;

public class SortingMethods{
	
	public void selectionSort(int[] a) {
		int min, temp;
		for(int i = 0; i<a.length-1;i++) {
			min = i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min])
					min = j;
			}
			temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
	}
	
	public void insertionSort(int[] a) {
		int key,j;
		for(int i=1;i<a.length;i++) {
			key=a[i];
			j= i-1;
			while(j>=0 && a[j]>key) {
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1] = key;
		}
	}
	
	public void bubbleSort(int[] a) {
		
		for(int i=1;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp =a[j];
					a[j] =a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	
	public void quickSort(int[] a) {
		
	}
	
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i]=a[j];
		a[j] = temp;
	}
 }
