//Please remove or change this line if you put the application into default or other folder 
package arrayPracitce;

public class LockerState {
    public static void main(String[] args) {
        //create a boolean array. Default value false represents opened state of all lockers when first student passed
        // so True represents closed
        boolean[] lockerStates = new boolean[100];
        int[] sc= new int[10];

        //Create a nested loop. The outer loop represents students and inner loop represents lockers. Once the locker no.
        //can be divided by the order of student exactly, change the state of locker
        for(int s=2; s<=100; s++) {
            for (int l = s; l <= 100; l++)
                if(l%s == 0)
                    lockerStates[l-1] = !lockerStates[l-1];
        }

        //output the locker's state. Use a conditional operator to simplify the code.
        for(int i=0; i<100; i++)
        	//output all lockers states.
//            System.out.println("The locker "+(i+1) + " is "+(lockerStates[i]?"closed":"opened"));
        	
        	//just output the locker which is opened
        	if(!lockerStates[i])
        		System.out.println("The locker "+(i+1) + " is opened");
    }
}
