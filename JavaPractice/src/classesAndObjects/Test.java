package classesAndObjects;

//import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableFactory tf = new TableFactory("Red", 75, "Round");
		TableFactory tf2 = new TableFactory();
		//tf2.color = "green";
		tf2.getColor();
		
		tf.setColor("green");
		
		tf.printSate();
		//System.out.println(tf.getColor());
		
	
	}

}

