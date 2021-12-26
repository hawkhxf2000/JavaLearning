import java.util.Scanner;

//import javax.imageio.plugins.tiff.ExifGPSTagSet;
public class PrimeSelection {
	public static void main(String[] args) {

		Scanner myKeyScanner=new Scanner(System.in);
		System.out.println("Enter a positive number: ");
		int aNumber=myKeyScanner.nextInt() ;
		
		for(int i=1; i<=aNumber;i++) {
			int count =0;
			for(int j=1;j<=i;j++) {
				if(i%j == 0)
					count++;
			}
			if(count == 2) {
				System.out.print(i +" ");
			}
		}
		
		myKeyScanner.close();
	}
}