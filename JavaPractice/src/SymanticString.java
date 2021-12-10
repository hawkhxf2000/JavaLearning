import java.util.Scanner;

public class SymanticString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str, another = "y";
		int left, right;
		Scanner in = new Scanner(System.in);
		do{
			System.out.println("Please enter a string:");
		str = in.next();
		left = 0;
		right = str.length()-1;
		while(str.charAt(left) == str.charAt(right) && left < right) {
			left++;
			right--;
		}
		System.out.println((left<right)?"No":"Yes");
		System.out.println("Test another string(y/n)?");
		another =in.next();
	}while(another.equalsIgnoreCase("y"));
		in.close();
	}

}
