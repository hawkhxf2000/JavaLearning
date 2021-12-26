public class LabThree {

	public static void main(String[] args) {
	   System.out.print("what size do you want your array to be (minimim size 5 and an odd number):");	
	   @SuppressWarnings("resource")
	java.util.Scanner scanner= new java.util.Scanner(System.in);
       int s1=scanner.nextInt();
       int[] arr=new int[s1];
       System.out.print("Starting integer value:");
       int s2=scanner.nextInt();
       for (int i= 0; i<s1; i++) {
    	   arr[s1-i-1]=s2;
    	   s2+=3;
       } //input and print the array size and starting integer.
       System.out.println("Original array:");
       for (int i : arr) {
    	   System.out.print(i+"->"+" ");	
       }
       System.out.println();
		
		  for (int i=0,temp=0;i<=s1-5;i+=2) {//rotation for array and print the result.
			  if (i==0) {
				  temp=arr[s1-1];
			      arr[s1-1]=arr[i];
			  }     			 
			  arr[i]=arr[i+2];
			  if (i==s1-5) arr[i+2]=temp;
		  }	 
			 
		 
		  System.out.println("Array after rotation:"); //foreath print result.
		  for (int i : arr) {
		  System.out.print(i+"->"+" "); // }
		  }	 
	}
	
}