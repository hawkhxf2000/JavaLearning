//import java.util.Arrays;

//import java.util.ArrayList;
//import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = new int[50];
		x[0] = 0;
		x[1] =0;
		for(int i=2;i<x.length;i++)
		  x[i] = 1;
		int i,t;
		for(i=2;i<8;i++) 
			if(x[i]!=0) {
				System.out.print(i+"  ");
				t = 2 * i;
				while(t<50) {
					x[t]=0;
					t+=i;
				}
			}
		System.out.println();
		for(i=2;i<x.length;i++) {
			if(x[i]!=0)
				System.out.println(i);
		}
	}
}

