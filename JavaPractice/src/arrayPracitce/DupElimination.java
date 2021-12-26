//Please remove or change this line if you put the application into default or other folder 
package arrayPracitce;  

import java.util.Scanner;

public class DupElimination {
	public static void main(String[] args) {
		//Initialize variable
		int[] arr= {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
		int index = 0;

		//Input numbers and fill in array
		System.out.println("Please input a value in [10,100]");
		while(index<arr.length){
			System.out.print("Value " +(index+1) +": ");
			Scanner sc= new Scanner(System.in);
			int temp = sc.nextInt();
			boolean isPositve = false;
			do {
				if(temp <10 || temp>100){         //validate the input number is within the range
					System.out.print("Wrong Value, please input a value in [10,100]: ");
					sc = new Scanner(System.in);
					temp = sc.nextInt();
				}
				else isPositve = true;
			}while(!isPositve);

			arr[index] = temp;
			index++;

		}

		//        Using nested loop to compare arr[i] with each other numbers behind. If equal, replace the number behind
		//         with -1.
		        for(int i = 0; i<arr.length; i++){
		            for (int j =i+1; j<arr.length;j++){
		                if(arr[j] == arr[i])
		                    arr[j] = -1;
		            }
		        }
		
		        //print out the result
		        System.out.println("The unique values are:");
		        for(int num:arr){
		            if(num != -1)
		                System.out.print(num + " ");
		        }

	}
}
