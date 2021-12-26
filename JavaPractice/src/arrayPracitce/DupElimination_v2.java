package arrayPracitce;

import java.util.Scanner;

public class DupElimination_v2 {
    public static void main(String[] args) {
        //Initialize variable
        int[] arr = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        int index = 0;

        //Input numbers and fill in array
        System.out.println("Please input a value in [10,100]");
        do {
            System.out.print("Value " + (index + 1) + ": ");
            Scanner sc = new Scanner(System.in);
            int temp = sc.nextInt();
            if (temp < 10 || temp > 100) {         //validate the input number is within the range
                System.out.print("Wrong Value, please input a value in [10,100]: ");
                sc = new Scanner(System.in);
                arr[index] = sc.nextInt();
            }

            int count = 0;
            for (int i=0;i<index;i++){
                if(arr[i] == temp) {
                    count++;
                    break;
                }
            }
            
            if(count == 0)
            arr[index] =temp;
            index++;
        }while (index < arr.length);

        System.out.println("The unique values are:");
        for(int num:arr){
            if(num != -1)
                System.out.print(num + " ");
        }
    }
}
