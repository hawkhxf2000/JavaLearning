package CollectionPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Homework03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> employee = new HashMap<>();
		employee.put("Jack", 650);
		employee.put("Tom", 1200);
		employee.put("Smith", 2900);
		
		employee.put("Jack", 2600);
		
//		for (HashMap.Entry<String, Integer> entry : employee.entrySet()) {
//			String key = entry.getKey();
//			Integer val = entry.getValue();
//			val += 100;
//			entry.setValue(val);
//			
//		}
//		System.out.println(employee);
	
		for (String key : employee.keySet()) {
			employee.put(key, employee.get(key)+100);
			System.out.print(key+"'s salary is:");
			System.out.println(employee.get(key));
		}
		
	Collection values= employee.values();
	for (Object value : values) {
		System.out.println(value);
	}
	}

}
