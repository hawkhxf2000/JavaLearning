package CollectionPractice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPracitce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> colorList = new ArrayList<>();
		
		colorList.add("Red");
		colorList.add("Green");
		colorList.add("Blue");
		colorList.add(0,"Purple");
		//System.out.println(colorList);
		
		for(String color:colorList) {
			System.out.println(color);
		}
		
		String colorString = colorList.get(0);
		System.out.println(colorString);
	}

}
