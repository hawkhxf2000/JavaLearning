package CollectionPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class Homework02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Car> carList = new ArrayList<>();
		Car car1 = new Car("±¦Âí", 400000);
		Car car2 = new Car("±öÀû",5000000);
		
		carList.add(car1);
		carList.add(car2);
		
		System.out.println(carList);
		
		carList.remove(0);
		System.out.println(carList);
		
		System.out.println(carList.contains(car2));
		
		int length = carList.size();
		System.out.println(length);
		
		System.out.println(carList.isEmpty());
		
		carList.clear();
		System.out.println(carList);
		
		carList.add(car1);
		carList.add(car2);
		carList.addAll(carList);
		System.out.println(carList);
		
		System.out.println(carList.containsAll(carList));
		
//		carList.removeAll(carList);
//		System.out.println(carList);
		
	    for (Car car : carList) {
			System.out.println(car);
		}
	    
	    for (Iterator<Car> iterator = carList.iterator(); iterator.hasNext();) {
			Car car = (Car) iterator.next();
			System.out.println(car);
			
		}
		
	}

}

class Car {
	
	private String name;
	private int price;
	
	public Car(String name, int price) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.price = price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}
	
	
}