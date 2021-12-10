
public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String title = "hii";
		
		System.out.println(title.concat("world!"));
		System.out.println(title);
		
		String emptyString = "";
		System.out.println("Length of the emptyString is:"+emptyString.length());  //length of the empty string is 0;
		
		String string1 = "this is a string.";
		System.out.println(string1.substring(3,10));//beginIndex is inclusive but endIndex is exclusive
		System.out.println(string1.substring(3,string1.length())); //The value of length is exclusive,so the last index is length-1
	}

}
