package arrayPracitce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
//import java.util.Iterator;
import java.util.List;

/*74. Write a Java program to find all triplets equal to a given sum in a 
 unsorted array of integers. 
Example:
Input :
nums = { 1, 6, 3, 0, 8, 4, 1, 7 }
Output:
Triplets of sum 7
(0 1 6)
(0 3 4)*/

public class W3ResourceEx74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] nums = {1,6,3,0,8,4,1,7};
		int[] nums = new int[8];
		for(int i=0; i<nums.length;i++)
			nums[i] = (int)(Math.random() * 8);
		System.out.println(Arrays.toString(nums));
		System.out.println();
		
		List<Integer[]> ls =  new ArrayList<>();
		
		for(int i=0; i<nums.length; i++)
			for(int j=i+1; j<nums.length;j++)
				for (int k=j+1;k<nums.length;k++)
					if((nums[i]+nums[j]+nums[k])==7) {
						Integer[] result = {nums[i],nums[j],nums[k]};
						Arrays.sort(result);
						ls.add(result);
							}
					
		for(int i=0;i<ls.size();i++)
			for(int j=i+1;j<ls.size();j++) {
				if(ls.get(i)[0] == ls.get(j)[0] && ls.get(i)[1] ==ls.get(j)[1]
				   && ls.get(i)[2] == ls.get(j)[2]) {
					ls.remove(j);
					j--;
				}
			}
		
			
		for(Integer[] result:ls)
						System.out.println(Arrays.toString(result));
		
	}

}
